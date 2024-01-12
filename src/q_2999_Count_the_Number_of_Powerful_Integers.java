import java.util.Scanner;

public class q_2999_Count_the_Number_of_Powerful_Integers {
    private static long numberOfPowerfulLE(long max, int i, long tp, int limit, long[] limPow) {
        if (i == 0)
            return Math.min(max, limit) + 1;
        int hd = (int) (max / tp);
        if (limit < hd) {
            return (limit + 1) * limPow[i];
        } else {
            return hd * limPow[i] + numberOfPowerfulLE(max % tp, i - 1, tp / 10, limit, limPow);
        }
    }

    private static long numberOfPowerfulLE(long max, int limit) {
        if (max < 10) {
            return Math.min(max, limit) + 1;
        }
        int n = (int) Math.log10(max) + 1;
        int lp1 = limit + 1;
        long[] limPow = new long[n--];
        long p = 1;
        for (int i = 0; i <= n; i++) {
            limPow[i] = p;
            p *= lp1;
        }
        return numberOfPowerfulLE(max, n, (long) Math.pow(10, n), limit, limPow);
    }

    private static long numberOfPowerfulLE(long max, int limit, long sl, long st) {
        long maxHigh = max / st;
        long maxLow = max % st;
        if (maxLow < sl) {
            maxHigh--;
        }
        return numberOfPowerfulLE(maxHigh, limit);
    }

    public static long numberOfPowerfulInt(long start, long finish, int limit, String s) {
        long sl = Long.parseLong(s);
        long st = (long) Math.pow(10, s.length());
        return numberOfPowerfulLE(finish, limit, sl, st) - numberOfPowerfulLE(start - 1, limit, sl, st);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting range: ");
        long start = sc.nextLong();
        System.out.print("Enter the ending range: ");
        long finish = sc.nextLong();
        System.out.print("Enter the limit: ");
        int limit = sc.nextInt();
        System.out.print("Enter the string representation: ");
        String s = sc.next();
        System.out.println("Number of powerful integers: " + numberOfPowerfulInt(start, finish, limit, s));
    }
}
