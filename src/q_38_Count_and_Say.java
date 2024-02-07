import java.util.Scanner;

public class q_38_Count_and_Say {
    public static String countAndSay(int n) {
        String s = "1";
        for (int i = 2; i <= n; i++) {
            s = countAndAdd(s);
        }
        return s;
    }

    public static String countAndAdd(String s) {
        StringBuilder str = new StringBuilder();
        char c = s.charAt(0);
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == c) count++;
            else {
                str.append(count);
                str.append(c);
                c = s.charAt(i);
                count = 1;
            }
        }
        str.append(count);
        str.append(c);
        return str.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.println(countAndSay(n));
    }
}
