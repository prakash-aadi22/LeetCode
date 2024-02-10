import java.util.Scanner;

public class q_547_Number_of_Provinces {
    public static void dfs(int[][] arr, boolean[] ck, int n) {
        ck[n] = true;
        for (int i = 0; i < arr.length; i++) {
            if (!ck[i] && arr[i][n] == 1) {
                dfs(arr, ck, i);
            }
        }
    }

    public static int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        int c = 0;
        boolean[] ck = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!ck[i]) {
                c++;
                dfs(isConnected, ck, i);
            }
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int columns = sc.nextInt();
        int[][] arr = new int[rows][columns];
        System.out.println("Enter the points (format: x y):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(findCircleNum(arr));
    }
}
