import java.util.Scanner;

public class q_435_Non_overlapping_Intervals {
    public static int eraseOverlapIntervals(int[][] intervals) {
        int max = intervals[0][1];
        int min = max;
        for (int i = 1; i < intervals.length; i++) {
            max = Math.max(max, intervals[i][1]);
            min = Math.min(min, intervals[i][1]);
        }
        int shift = 1 - min;
        int maxIntervalRange = 2 + max - min;
        int[] rightEnds = new int[maxIntervalRange];
        for (int[] interval : intervals) {
            int left = interval[0] + shift;
            int right = interval[1] + shift;
            if (left > rightEnds[right])
                rightEnds[right] = left;
        }
        int start = 1;
        int count = 1;
        for (int i = 2; i < maxIntervalRange; i++) {
            if (start <= rightEnds[i]) {
                count++;
                start = i;
            }
        }
        return intervals.length - count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int columns = sc.nextInt();
        int[][] intervals = new int[rows][columns];
        System.out.println("Enter the points (format: x y):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                intervals[i][j] = sc.nextInt();
            }
        }
        System.out.println(eraseOverlapIntervals(intervals));
    }
}
