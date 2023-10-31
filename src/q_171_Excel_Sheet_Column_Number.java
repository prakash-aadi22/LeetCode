import java.util.Scanner;

public class q_171_Excel_Sheet_Column_Number {
    public static int titleToNumber(String columnTitle) {
//        int sum = 0;
//        for (char ch : columnTitle.toCharArray()) {
//            int diff = ch - ('A' - 1);
//            sum = sum * 26 + diff;
//        }
//        return sum;

        int num = 0;
        int j = 0;
        for (int i = columnTitle.length() - 1; i >= 0; i--) {
            num += Math.pow(26, j) * (columnTitle.charAt(i) - 64);
            j++;
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the characters: ");
        System.out.println(titleToNumber(sc.next()));
    }
}
