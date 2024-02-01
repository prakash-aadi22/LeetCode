import java.util.Scanner;

public class q_1689_Partitioning_Into_Minimum_Number_Of_Deci_Binary_Numbers {
    public static int minPartitions(String n) {
        for (int i = 9; i > 0; i--) {
            if (n.contains(String.valueOf(i))) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String str = sc.next();
        System.out.println(minPartitions(str));
    }
}
