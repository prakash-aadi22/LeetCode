import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class q_624_Maximum_Distance_in_Arrays {
    public static int maxDistance(List<List<Integer>> arrays) {
        int min = Integer.MAX_VALUE;
        int minIdx = -1;
        int secMin = min;
        int max = Integer.MIN_VALUE;
        int maxIdx = -1;
        int secMax = max;
        for (int i = 0; i < arrays.size(); i++) {
            List<Integer> arr = arrays.get(i);
            int curMin = arr.getFirst();
            int curMax = arr.getLast();
            if (min > curMin) {
                secMin = min;
                min = curMin;
                minIdx = i;
            } else if (secMin > curMin) {
                secMin = curMin;
            }

            if (max < curMax) {
                secMax = max;
                max = curMax;
                maxIdx = i;
            } else if (secMax < curMax) {
                secMax = curMax;
            }
        }
        return minIdx == maxIdx ? Math.max(max - secMin, secMax - min) : max - min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = sc.nextInt();
        List<List<Integer>> my2DList = new ArrayList<>();
        for (int i = 0; i < rows; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter element at position " + (i + 1) + "," + (j + 1) + ": ");
                row.add(sc.nextInt());
            }
            my2DList.add(row);
        }
        System.out.println(maxDistance(my2DList));
    }
}
