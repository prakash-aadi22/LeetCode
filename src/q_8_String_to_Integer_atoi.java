import java.util.Scanner;

public class q_8_String_to_Integer_atoi {

    public static int myAtoi(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        String str = sc.nextLine();
        System.out.println(myAtoi(str));
    }
}
