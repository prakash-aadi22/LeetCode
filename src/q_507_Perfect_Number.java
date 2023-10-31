import java.util.Scanner;

public class q_507_Perfect_Number {
    public static boolean checkPerfectNumber(int num) {
        int sum = 0;
        if (num % 2 != 0) {
            return false;
        } else {
            for (int i = 1; i <= num / 2; i++) {
                if (num % i == 0) {
                    sum += i;
                }
            }
        }
        return sum == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        System.out.println(checkPerfectNumber(sc.nextInt()));
    }
}
