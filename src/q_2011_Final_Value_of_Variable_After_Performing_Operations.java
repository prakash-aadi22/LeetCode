import java.util.Scanner;

public class q_2011_Final_Value_of_Variable_After_Performing_Operations {
    public static int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (String s : operations) {
            x = (s.charAt(1) == '+') ? x + 1 : x - 1;
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int l = sc.nextInt();
        sc.nextLine();
        String[] str = new String[l];
        for (int i = 0; i < str.length; i++) {
            System.out.print("Enter the String for the " + i + " index: ");
            str[i] = sc.nextLine();
        }
        System.out.println(finalValueAfterOperations(str));
    }
}
