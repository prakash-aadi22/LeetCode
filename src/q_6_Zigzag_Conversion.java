import java.util.Scanner;

public class q_6_Zigzag_Conversion {

    public static String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        int n = s.length();
        char[] convS = new char[n];
        int i = 0;
        int step = 2 * (numRows - 1);
        for (int row = 0; row < numRows; row++) {
            for (int j = 0; j - row < n; j += step) {
                int elemIndex;
                elemIndex = j - row;
                if (elemIndex >= 0 && elemIndex > j - step + row) {
                    convS[i++] = s.charAt(elemIndex);
                }
                elemIndex = j + row;
                if (elemIndex < n && elemIndex > j) {
                    convS[i++] = s.charAt(elemIndex);
                }
            }
        }
        return String.valueOf(convS);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        String str = sc.nextLine();
        System.out.print("Enter the value of k: ");
        int x = sc.nextInt();
        System.out.println(convert(str, x));
    }
}
