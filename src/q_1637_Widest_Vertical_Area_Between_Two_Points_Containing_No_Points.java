import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class q_1637_Widest_Vertical_Area_Between_Two_Points_Containing_No_Points {
    public static int maxWidthOfVerticalArea(int[][] points) {
//        Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));
        Arrays.sort(points, Comparator.comparingInt(a -> a[0]));
        int max_width = 0;
        for (int i = 1; i < points.length; i++) {
            max_width = Math.max(max_width, points[i][0] - points[i - 1][0]);
        }
        return max_width;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input points in the format [[x1,y1],[x2,y2],...,[xn,yn]]: ");
        String input = sc.nextLine();
        input = input.replaceAll("\\[|]|\\s", "");
        String[] coordinates = input.split(",");
        int[][] points = new int[coordinates.length / 2][2];
        int k = 0;
        for (int i = 0; i < coordinates.length; i += 2) {
            points[k][0] = Integer.parseInt(coordinates[i]);
            points[k][1] = Integer.parseInt(coordinates[i + 1]);
            k++;
        }
        System.out.println(maxWidthOfVerticalArea(points));
    }
}
