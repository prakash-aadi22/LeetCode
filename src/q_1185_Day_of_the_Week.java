import java.util.Scanner;

public class q_1185_Day_of_the_Week {
    public static String dayOfTheWeek(int day, int month, int year) {
        int[] t = {0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4};
        if (month < 3) {
            year--;
        }
        int n = (year + year / 4 - year / 100 + year / 400 + t[month - 1] + day) % 7;
        String[] arr = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        return arr[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the day: ");
        int d = sc.nextInt();
        System.out.print("Enter the month: ");
        int m = sc.nextInt();
        System.out.print("Enter the year: ");
        int y = sc.nextInt();
        System.out.println((dayOfTheWeek(d, m, y)));
    }
}
