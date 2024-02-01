import java.util.Scanner;

public class q_2843_Count_Symmetric_Integers {
    private static final short[] symCount = new short[10_001];

    public static int countSymmetricIntegers(int low, int high) {
        if (symCount[11] == 0) buildCounts();
        return symCount[high] - symCount[low - 1];
    }

    private static void buildCounts() {
        for (int num = 11; num <= 99; num++) {
            symCount[num] = (short) (num / 11);
        }
        short prev = symCount[99];
        for (int num = 100; num <= 999; num++) {
            symCount[num] = prev;
        }
        prev = symCount[999];
        int idx = 1000;
        for (int high10 = 1; high10 <= 9; high10++) {
            for (int high1 = 0; high1 <= 9; high1++) {
                final int highSum = high10 + high1;
                for (int low10 = 0; low10 <= 9; low10++)
                    for (int low1 = 0; low1 <= 9; low1++)
                        symCount[idx++] = (highSum == low10 + low1) ? ++prev : prev;
            }
        }
        symCount[10_000] = symCount[9999];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of low: ");
        int l = sc.nextInt();
        System.out.print("Enter the value of high: ");
        int h = sc.nextInt();
        System.out.println(countSymmetricIntegers(l, h));
    }
}
