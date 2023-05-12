import java.util.Scanner;

public class q_405_Convert_a_Number_to_Hexadecimal {
    public static String toHex(int num) {
        return Integer.toHexString(num);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        System.out.println(toHex(sc.nextInt()));
    }
}
