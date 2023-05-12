import java.util.Scanner;

public class q_9_Palindrome_Number {
    public static boolean isPalindrome(int x) {
        // not work of negative -121
//        int reverse = 0, n = x;
//        while (n != 0) {
//            reverse *= 10;
//            reverse += n % 10;
//            n /= 10;
//        }
//        return reverse == x;

        // same issue
//        int num = x, reversedNum = 0, remainder;
//        int originalNum = num;
//        while (num != 0) {
//            remainder = num % 10;
//            reversedNum = reversedNum * 10 + remainder;
//            num /= 10;
//        }
//        return originalNum == reversedNum;

//        String str = String.valueOf(x);
//        StringBuilder reverseStr = new StringBuilder();
//        int strLength = str.length();
//        for (int i = (strLength - 1); i >= 0; --i) {
//            reverseStr.append(str.charAt(i));
//        }
//        return str.equals(reverseStr.toString());

        String str = String.valueOf(x);
        StringBuilder check = new StringBuilder(str);
        return str.equals(check.reverse().toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        System.out.println(isPalindrome(sc.nextInt()));
    }
}
