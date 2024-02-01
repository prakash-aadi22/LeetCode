import java.util.Scanner;

public class q_2103_Rings_and_Rods {
    public static int countPoints(String rings) {
        int[][] count = new int[26][10];
        for (int i = 0; i + 1 < rings.length(); i = i + 2) {
            int row = rings.charAt(i) - 'A';
            int col = rings.charAt(i + 1) - '0';
            count[row][col]++;
        }
        int res = 0;
        for (int i = 0; i < 10; i++) {
            if (count['B' - 'A'][i] > 0 && count['G' - 'A'][i] > 0 && count['R' - 'A'][i] > 0) {
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String str = sc.next();
        System.out.println(countPoints(str));
    }
}
