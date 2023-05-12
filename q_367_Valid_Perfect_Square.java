import java.util.Scanner;

public class q_367_Valid_Perfect_Square {
    public static boolean isPerfectSquare(int num) {
//        double d = Math.sqrt(num);
//        String s = String.valueOf(d);
//        String[] str = s.split("\\.");
//        return Objects.equals(str[1], "0");
        double d = Math.sqrt(num);
        return Math.ceil(d) == Math.floor(d);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        System.out.println(isPerfectSquare(sc.nextInt()));
    }
}
