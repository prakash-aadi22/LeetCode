import java.util.Scanner;

public class q_1779_Find_Nearest_Point_That_Has_the_Same_X_or_Y_Coordinate {
    public static int nearestValidPoint(int x, int y, int[][] points) {
        int smallestDistance = Integer.MAX_VALUE, result = -1;
        for (int i = 0; i < points.length; i++) {
            if (points[i][0] == x || points[i][1] == y) {
                int currentDistance = Math.abs(x - points[i][0]) + Math.abs(y - points[i][1]);
                if (currentDistance < smallestDistance) {
                    smallestDistance = currentDistance;
                    result = i;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("x-coordinate: ");
        int x = sc.nextInt();
        System.out.print("y-coordinate: ");
        int y = sc.nextInt();
        System.out.print("Number of inputs: ");
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        System.out.println("Coordinates-> x y");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(nearestValidPoint(x, y, arr));
    }
}
