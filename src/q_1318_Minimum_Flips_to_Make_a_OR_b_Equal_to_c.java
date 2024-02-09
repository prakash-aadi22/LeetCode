import java.util.Scanner;

public class q_1318_Minimum_Flips_to_Make_a_OR_b_Equal_to_c {
    public static int minFlips(int a, int b, int c) {
        return Integer.bitCount(c ^= (a | b)) + Integer.bitCount(a & b & c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int x = sc.nextInt();
        System.out.print("Enter the second number: ");
        int y = sc.nextInt();
        System.out.print("Enter the third number: ");
        int z = sc.nextInt();
        System.out.println(minFlips(x, y, z));
    }
}
