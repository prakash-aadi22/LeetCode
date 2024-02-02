import java.util.Arrays;
import java.util.Scanner;

public class q_492_Construct_the_Rectangle {

    public static int[] constructRectangle(int area) {
        int w = (int) Math.sqrt(area);
        while (area % w != 0) {
            w--;
        }
        return new int[]{area / w, w};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the area of the rectangle: ");
        int area = sc.nextInt();
        System.out.println(Arrays.toString(constructRectangle(area)));
    }
}
