import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class q_118_Pascal_s_Triangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int row = 1; row <= numRows; row++) {
            ans.add(generateRow(row));
        }
        return ans;
    }

    public static List<Integer> generateRow(int numRows) {
        int ans = 1;
        List<Integer> ansRow = new ArrayList<>();
        ansRow.add(1);
        for (int col = 1; col < numRows; col++) {
            ans = ans * (numRows - col);
            ans = ans / col;
            ansRow.add(ans);
        }
        return ansRow;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        System.out.println(generate(n));
    }
}
