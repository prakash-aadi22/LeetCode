import java.util.Scanner;

public class q_1347_Minimum_Number_of_Steps_to_Make_Two_Strings_Anagram {
    public static int minSteps(String s, String t) {
        int[] count = new int[26];
        byte[] sb = s.getBytes(), tb = t.getBytes();
        for (byte b : sb) {
            count[b - 'a']++;
        }
        for (byte b : tb) {
            count[b - 'a']--;
        }
        int res = 0;
        for (int i : count) {
            res += Math.abs(i);
        }
        return res / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter s: ");
        String s = sc.next();
        System.out.print("Enter t: ");
        String t = sc.next();
        System.out.println(minSteps(s, t));
    }
}
