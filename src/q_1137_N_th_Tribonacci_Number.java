import java.util.Scanner;

public class q_1137_N_th_Tribonacci_Number {
    public static int tribonacci(int n) {
        if (n < 2) {
            return n;
        }
        int a = 0, b = 1, c = 1, d;
        while (n-- > 2) {
            d = a + b + c;
            a = b;
            b = c;
            c = d;
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.println(tribonacci(num));
    }
}
