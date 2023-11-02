import java.util.Scanner;

public class q_1528_Shuffle_String {
    public static String restoreString(String s, int[] indices) {
        char[] ans = new char[s.length()];
        for (int i = 0; i < indices.length; i++) {
            ans[indices[i]] = s.charAt(i);
        }
        return new String(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.next();
        int[] indices = new int[s.length()];
        System.out.println("Enter the indices: ");
        for (int i = 0; i < indices.length; i++) {
            indices[i] = sc.nextInt();
        }
        System.out.println(restoreString(s, indices));
    }
}
