import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class q_17_Letter_Combinations_of_a_Phone_Number {
    public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits.isEmpty()) {
            return result;
        }
        String[] mapping = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        dfs(0, digits, result, new StringBuilder(), mapping);
        return result;
    }

    private static void dfs(int length, String digits, List<String> result, StringBuilder sb, String[] mappings) {
        if (length == digits.length()) {
            result.add(sb.toString());
            return;
        }
        char ch = digits.charAt(length);
        String str = mappings[ch - '0'];
        for (char c : str.toCharArray()) {
            sb.append(c);
            dfs(length + 1, digits, result, sb, mappings);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        String str = sc.nextLine();
        System.out.println(letterCombinations(str));
    }
}
