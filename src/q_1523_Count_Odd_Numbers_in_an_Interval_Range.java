import java.util.Scanner;

public class q_1523_Count_Odd_Numbers_in_an_Interval_Range {
    public static int countOdds(int low, int high) {
//        int count = 0;
//        for (int i = low; i <= high; i++) {
//            if (i % 2 != 0) {
//                count++;
//            }
//        }
//        return count;
        return ((high + 1) / 2) - (low / 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("LOW: ");
        int low = sc.nextInt();
        System.out.print("HIGH: ");
        int high = sc.nextInt();
        System.out.println(countOdds(low, high));
    }
}
