import java.util.Scanner;

public class q_190_Reverse_Bits {
    public static int reverseBits(int n) {
        int reversed = 0;
        for (int i = 0; i < 32; i++) {
            reversed = (reversed << 1) | (n & 1);
            n = n >>> 1;
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the binary number: ");
        int n = sc.nextInt();
        System.out.println(reverseBits(n));
    }
}
