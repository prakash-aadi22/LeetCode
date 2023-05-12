import java.util.Scanner;

public class q_1281_Subtract_the_Product_and_Sum_of_Digits_of_an_Integer {
    public static int subtractProductAndSum(int n) {
        int product = 1, sum = 0;
//        int x = n;
//        while (n != 0) {
//            product *= (n % 10);
//            n /= 10;
//        }
//        while (x != 0) {
//            sum += (x % 10);
//            x /= 10;
//        }
        for (; n > 0; n /= 10) {
            sum += n % 10;
            product *= n % 10;
        }
        return (product - sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.println(subtractProductAndSum(n));
    }
}
