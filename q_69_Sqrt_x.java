import java.util.Scanner;

public class q_69_Sqrt_x {
    public static int mySqrt(int x) {
        return (int) Math.sqrt(x);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        System.out.println(mySqrt(sc.nextInt()));
    }
}
