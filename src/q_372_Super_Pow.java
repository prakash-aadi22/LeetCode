import java.util.Scanner;

public class q_372_Super_Pow {

    public static int superPow(int a, int[] b) {
//        double n = Integer.parseInt(Arrays.toString(b).replaceAll("\\D", ""));
//        return (int) Math.pow(a, n);

        if (a % 1337 == 0) {
            return 0;
        }
        int n = 0;
        for (int i : b) {
            n = (n * 10 + i) % 1140;
        }
        if (n == 0) n += 1440;
        a %= 1337;
        int result = 1;
        while (n > 0) {
            if (n % 2 == 1) result = (result * a) % 1337;
            n /= 2;
            a = (a * a) % 1337;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int x = sc.nextInt();
        System.out.print("Enter the length of the number: ");
        int len = sc.nextInt();
        int[] num = new int[len];
        for (int i = 0; i < num.length; i++) {
            System.out.print("Enter the value of " + i + ": ");
            num[i] = sc.nextInt();
        }
        System.out.println(superPow(x, num));
    }
}
