import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class q_2352_Equal_Row_and_Column_Pairs {
    private static int getColHash(int idx, int[][] m) {
        int hash = 0;
        for (int[] i : m) {
            hash = i[idx] + 17 * hash;
        }
        return hash;
    }

    private static int getRowHash(int idx, int[][] m) {
        int hash = 0;
        for (int i = 0; i < m.length; i++) {
            hash = m[idx][i] + 17 * hash;
        }
        return hash;
    }

    public static int equalPairs(int[][] grid) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < grid.length; i++) {
            int hash = getRowHash(i, grid);
            m.put(hash, m.getOrDefault(hash, 0) + 1);
        }
        int ans = 0;
        for (int i = 0; i < grid.length; i++) {
            int hash = getColHash(i, grid);
            ans += m.getOrDefault(hash, 0);
        }
        return ans;
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
        System.out.println((equalPairs(points)));
    }
}
