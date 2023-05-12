import java.util.Scanner;

public class q_231_Power_of_Two {
    public static boolean isPowerOfTwo(int n) {
//        double r = (Math.log(n) / Math.log(2));
//        return (Math.ceil(r) == Math.floor(r)); // wrong for n = 536870912

//         return n > 0 && (n & n - 1) == 0;

        if (n < 1) {
            return false;
        }
        while (n % 2 == 0) {
            n /= 2;
        }
        return n == 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.println(isPowerOfTwo(n));
    }
}
