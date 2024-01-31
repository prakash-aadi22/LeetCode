import java.util.Scanner;

public class q_2124_Check_if_All_A_s_Appears_Before_All_B_s {
    public static boolean checkString(String s) {
        if (s.lastIndexOf('a') == -1 || s.indexOf('b') == -1) {
            return true;
        } else {
            return s.lastIndexOf('a') < s.indexOf('b');
        }

//        boolean bHasAppeared = false;
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == 'b') {
//                bHasAppeared = true;
//            } else if (bHasAppeared) {
//                return false;
//            }
//        }
//        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String str = sc.nextLine();
        System.out.println(checkString(str));
    }
}
