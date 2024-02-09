import java.util.Arrays;
import java.util.Scanner;

public class q_452_Minimum_Number_of_Arrows_to_Burst_Balloons {
    public static int findMinArrowShots(int[][] points) {
        long[] A = new long[points.length];
        for (int i = 0; i < points.length; i++) {
            A[i] = (((long) points[i][1]) << 32) | (points[i][0] & 0xFFFFFFFFL);
        }
        Arrays.sort(A);
        int prev = (int) (A[0] >>> 32);
        int count = 1;
        for (int i = 1; i < A.length; i++) {
            if ((int) A[i] > prev) {
                count++;
                prev = (int) (A[i] >>> 32);
            }
        }
        return count;
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
        System.out.println(findMinArrowShots(points));
    }
}
