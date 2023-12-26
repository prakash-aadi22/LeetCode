import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class q_1431_Kids_With_the_Greatest_Number_of_Candies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = -1;
        for (int i : candies) {
            if (i > max) {
                max = i;
            }
        }
        ArrayList<Boolean> al = new ArrayList<>();
        for (int i : candies) {
            if ((i + extraCandies) >= max) {
                al.add(true);
            } else {
                al.add(false);
            }
        }
        return al;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int l = sc.nextInt();
        int[] arr = new int[l];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the String for the " + i + " index: ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the value of extra candies: ");
        int x = sc.nextInt();
        System.out.println(kidsWithCandies(arr, x));
    }
}
