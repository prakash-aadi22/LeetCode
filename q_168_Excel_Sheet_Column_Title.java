import java.util.Scanner;

public class q_168_Excel_Sheet_Column_Title {
    public static String convertToTitle(int columnNumber) {
        String ans = "";
        while (columnNumber > 0) {
            columnNumber--;
            ans = (char) ('A' + (columnNumber % 26)) + ans;
            columnNumber = columnNumber / 26;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        System.out.println(convertToTitle(sc.nextInt()));
    }
}
