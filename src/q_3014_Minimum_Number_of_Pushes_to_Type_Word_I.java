import java.util.Scanner;

public class q_3014_Minimum_Number_of_Pushes_to_Type_Word_I {

    public static int minimumPushes(String word) {
        int n = word.length();
        return (n + Math.max(0, n - 8) + Math.max(0, n - 16) + Math.max(0, n - 24) + Math.max(0, n - 26));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String str = sc.next();
        System.out.println(minimumPushes(str));
    }
}
