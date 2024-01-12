import java.util.Scanner;

public class q_2827_Number_of_Beautiful_Integers_in_the_Range {
    public static int numberOfBeautifulIntegers(final int low, final int high, final int k) {
        final String lowStr = Integer.toString(low);
        final String highStr = Integer.toString(high);

        if (lowStr.length() < highStr.length()) {
            int result = 0;
            for (int lowerBound = 10; lowerBound <= high; lowerBound *= 100) {
                if (lowerBound * 10 - 1 >= low) {
                    final int subLow = Math.max(lowerBound, low);
                    final int subHigh = Math.min(lowerBound * 10 - 1, high);
                    assert Integer.toString(subLow).length() == Integer.toString(subHigh).length();
                    result += numberOfBeautifulIntegers(subLow, subHigh, k);
                }
            }
            return result;
        }

        assert lowStr.length() == highStr.length();

        final int numDigits = lowStr.length();
        if (numDigits % 2 == 1) {
            return 0;
        }

        final int[][][] memoPad = new int[numDigits + 1][numDigits + 1][k];
        {
            final int lowPrefix = lowStr.charAt(0) - '0';
            final int highPrefix = highStr.charAt(0) - '0';
            for (int num = lowPrefix; num <= highPrefix; ++num) {
                memoPad[1][num % 2][num % k]++;
            }
        }

        for (int prevII = 1; prevII < numDigits; ++prevII) {
            final int ii = prevII + 1;
            for (int prevJJ = 0; prevJJ <= prevII; ++prevJJ) {
                for (int lastDigit = 0; lastDigit <= 9; ++lastDigit) {
                    final int jj = prevJJ + (lastDigit % 2);
                    for (int prevKK = 0; prevKK < k; ++prevKK) {
                        final int kk = (prevKK * 10 + lastDigit) % k;
                        memoPad[ii][jj][kk] += memoPad[prevII][prevJJ][prevKK];
                    }
                }
            }
            final int lowPrefix = Integer.parseInt(lowStr.substring(0, ii));
            final int prevLowPrefix = lowPrefix / 10;
            final int highPrefix = Integer.parseInt(highStr.substring(0, ii));
            final int prevHighPrefix = highPrefix / 10;
            for (int num = prevLowPrefix * 10; num < lowPrefix; ++num) {
                final int jj = countOddDigits(num);
                final int kk = num % k;
                memoPad[ii][jj][kk] -= 1;
            }
            for (int num = highPrefix + 1; num < (prevHighPrefix + 1) * 10; ++num) {
                final int jj = countOddDigits(num);
                final int kk = num % k;
                memoPad[ii][jj][kk] -= 1;
            }
        }

        return memoPad[numDigits][numDigits / 2][0];
    }

    private static int countOddDigits(int num) {
        int result = 0;
        while (num > 0) {
            result += num % 2;
            num /= 10;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the lower bound of the range: ");
        int low = scanner.nextInt();
        System.out.print("Enter the upper bound of the range: ");
        int high = scanner.nextInt();
        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();
        int result = numberOfBeautifulIntegers(low, high, k);
        System.out.println("Number of beautiful integers in the range [" + low + ", " + high + "] with k=" + k + ": " + result);
    }
}
