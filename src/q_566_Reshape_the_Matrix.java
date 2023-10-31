import java.util.Arrays;
import java.util.Scanner;

public class q_566_Reshape_the_Matrix {
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int n = mat.length, m = mat[0].length;
        if (r * c != n * m) {
            return mat;
        }
        int[][] ans = new int[r][c];
        for (int i = 0; i < r * c; i++) {
            ans[i / c][i % c] = mat[i / m][i % m];
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row of your 2D array: ");
        int m = sc.nextInt();
        System.out.print("Enter the column of your 2D array: ");
        int n = sc.nextInt();
        System.out.print("Enter the row of reshaping 2D array: ");
        int r = sc.nextInt();
        System.out.print("Enter the column of reshaping 2D array: ");
        int c = sc.nextInt();
        int[][] twoArr = new int[m][n];
        System.out.println(Arrays.deepToString(matrixReshape(twoArr, r, c)));
    }
}
