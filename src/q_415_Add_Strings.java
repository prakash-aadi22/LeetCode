import java.math.BigInteger;
import java.util.Scanner;

public class q_415_Add_Strings {
    public static String addStrings(String num1, String num2) {
//        BigInteger a = new BigInteger(num1);
//        BigInteger b = new BigInteger(num2);
//        return a.add(b).toString();
        return String.valueOf(new BigInteger(num1).add(new BigInteger(num2)));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string number: ");
        String num1 = sc.next();
        System.out.print("Enter the second string number: ");
        String num2 = sc.next();
        System.out.println(addStrings(num1, num2));
    }
}
