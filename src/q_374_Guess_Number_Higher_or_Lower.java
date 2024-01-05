import java.util.Random;
import java.util.Scanner;

public class q_374_Guess_Number_Higher_or_Lower {
    public static Random random = new Random();
    public static final int pickedNumber = random.nextInt();

    public static int guess(int num) {
        return Integer.compare(pickedNumber, num);
    }

    public static int guessNumber(int n) {
        int first = 1, last = n;
        while (first <= last) {
            int mid = first + (last - first) / 2;
            int res = guess(mid);
            if (res == 0) {
                return mid;
            } else if (res == -1) {
                last = mid - 1;
            } else {
                first = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();
        System.out.println(guessNumber(n));
    }
}