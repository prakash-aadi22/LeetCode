import java.util.Scanner;

public class q_1463_Cherry_Pickup_II {
    public static int cherryPickup(int[][] grid) {
        int C = grid[0].length;
        int[][] dp = new int[C][C], old = new int[C][C];
        for (int r = grid.length - 1; r >= 0; r--) {
            for (int c1 = Math.min(r, C - 1); c1 >= 0; c1--) {
                for (int c2 = Math.max(c1, C - 1 - r); c2 < C; c2++) {
                    int max = 0;
                    for (int i = c1 - 1; i <= c1 + 1; i++) {
                        for (int j = c2 - 1; j <= c2 + 1; j++) {
                            if (i >= 0 && j >= 0 && j < C && i <= j) max = Math.max(max, old[i][j]);
                        }
                    }
                    dp[c1][c2] = max + grid[r][c1] + (c1 == c2 ? 0 : grid[r][c2]);
                }
            }
            int[][] temp = dp;
            dp = old;
            old = temp;
        }
        return old[0][C - 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int columns = sc.nextInt();
        int[][] points = new int[rows][columns];
        System.out.println("Enter the points (format: x y):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                points[i][j] = sc.nextInt();
            }
        }
        System.out.println(cherryPickup(points));
    }
}
