import java.util.Scanner;

public class q_504_Base_7 {
    public static String convertToBase7(int num) {
//        if (num > 0) {
//            StringBuilder ans = new StringBuilder();
//            while (num != 0) {
//                ans.append(num % 7);
//                num /= 7;
//            }
//            return ans.reverse().toString();
//        } else if (num < 0) {
//            num = Math.abs(num);
//            StringBuilder ans = new StringBuilder();
//            while (num != 0) {
//                ans.append(num % 7);
//                num /= 7;
//            }
//            return "-" + ans.reverse();
//        } else {
//            return "0";
//        }
        return Integer.toString(num, 7);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.println(convertToBase7(n));
    }
}
