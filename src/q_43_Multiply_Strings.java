import java.math.BigInteger;
import java.util.Scanner;

public class q_43_Multiply_Strings {

    public static String multiply(String num1, String num2) {
        BigInteger bi1 = new BigInteger(num1);
        BigInteger bi2 = new BigInteger(num2);
        return String.valueOf(bi1.multiply(bi2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string number: ");
        String x = sc.next();
        System.out.print("Enter the second string number: ");
        String y = sc.next();
        System.out.println(multiply(x, y));
    }
}
