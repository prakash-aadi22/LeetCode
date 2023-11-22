import java.util.Scanner;

public class q_2798_Number_of_Employees_Who_Met_the_Target {
    public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;
//        for (int i = 0; i < hours.length; i++) {
//            if (hours[i] >= target) {
//                count++;
//            }
//        }
        for (int i : hours) {
            if (i >= target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length: ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the value of " + i + "th index: ");
            arr[i] = sc.nextInt();
        }
        System.out.println(numberOfEmployeesWhoMetTarget(arr, len));
    }
}
