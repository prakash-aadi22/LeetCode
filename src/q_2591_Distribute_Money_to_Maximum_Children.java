import java.util.Scanner;

public class q_2591_Distribute_Money_to_Maximum_Children {

    public static int distMoney(int money, int children) {
        money -= children;
        if (money < 0) {
            return -1;
        }
        if (money / 7 == children && money % 7 == 0) {
            return children;
        }
        if (money / 7 == children - 1 && money % 7 == 3) {
            return children - 2;
        }
        return Math.min(children - 1, money / 7);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of money:");
        int m = sc.nextInt();
        System.out.println("Enter the value of children:");
        int c = sc.nextInt();
        System.out.println((distMoney(m, c)));
    }
}
