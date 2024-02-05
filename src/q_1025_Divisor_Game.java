import java.util.Scanner;

public class q_1025_Divisor_Game {
    public static boolean divisorGame(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.println((divisorGame(n)));
    }
}
