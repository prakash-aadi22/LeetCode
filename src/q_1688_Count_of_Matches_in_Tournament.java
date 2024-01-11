import java.util.Scanner;

public class q_1688_Count_of_Matches_in_Tournament {
    public static int numberOfMatches(int n) {
        int totalMatches = 0;
        while (n != 1) {
            if (n % 2 == 0) {
                totalMatches += (n / 2);
                n = n / 2;
            } else if (n % 2 != 0) {
                totalMatches += (n - 1) / 2;
                n = ((n - 1) / 2) + 1;
            }
        }
        return totalMatches;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of the teams: ");
        int n = sc.nextInt();
        System.out.println(numberOfMatches(n));
    }
}
