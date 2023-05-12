import java.math.BigInteger;
import java.util.Scanner;

public class q_67_Add_Binary {
    public static String addBinary(String a, String b) {
//        int x = Integer.parseInt(a, 2); // wrong for very large number
//        int y = Integer.parseInt(b, 2);
//        return Integer.toBinaryString(x + y);
        BigInteger x = new BigInteger(a, 2);
        BigInteger y = new BigInteger(b, 2);
        BigInteger sum = x.add(y);
        return sum.toString(2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first binary number: ");
        String a = sc.next();
        System.out.print("Enter the second binary number: ");
        String b = sc.next();
        System.out.println(addBinary(a, b));
    }
}
