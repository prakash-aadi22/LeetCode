import java.util.Scanner;

public class q_2390_Removing_Stars_From_a_String {
    public static String removeStars(String s) {
        int len = s.length();
        byte[] result = new byte[len];
        s.getBytes(0, len, result, 0);
        int stars = 0;
        for (int i = 0; i < len; i++) {
            if (result[i] == '*') {
                stars++;
            } else {
                result[i - stars * 2] = result[i];
            }
        }
        return new String(result, 0, len - stars * 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input: ");
        String s = sc.nextLine();
        System.out.println(removeStars(s));
    }
}
