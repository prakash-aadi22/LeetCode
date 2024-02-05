import java.util.Scanner;

public class q_476_Number_Complement {
    public static int findComplement(int num) {
        int i = 0;
        int j = 0;
        while (i < num) {
            i += (int) Math.pow(2, j);
            j++;
        }
        return i - num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.println(findComplement(n));
    }
}
