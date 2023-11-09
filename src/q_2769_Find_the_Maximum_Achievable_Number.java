import java.util.Scanner;

public class q_2769_Find_the_Maximum_Achievable_Number {
    public static int theMaximumAchievableX(int num, int t) {
        return num + (t * 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of num: ");
        int num = sc.nextInt();
        System.out.print("Enter the value of t: ");
        int t = sc.nextInt();
        System.out.println(theMaximumAchievableX(num, t));
    }
}
