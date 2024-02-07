import java.util.Scanner;

public class q_319_Bulb_Switcher {
    public static int bulbSwitch(int n) {
        return (int) Math.sqrt(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.println(bulbSwitch(n));
    }
}
