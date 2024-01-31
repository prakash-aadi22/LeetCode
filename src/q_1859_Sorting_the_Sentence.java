import java.util.Scanner;

public class q_1859_Sorting_the_Sentence {

    public static String sortSentence(String s) {
//        String[] str = s.split(" ");
//        String[] ans = new String[str.length];
//        int n;
//        for (String i : str) {
//            n = i.charAt(i.length() - 1) - '0';
//            ans[n - 1] = i.substring(0, i.length() - 1);
//        }
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < ans.length - 1; i++) {
//            sb.append(ans[i]).append(" ");
//        }
//        sb.append(ans[ans.length - 1]);
//        return sb.toString();

        String[] ans = new String[s.split(" ").length];
        for (String st : s.split(" ")) {
            ans[st.charAt(st.length() - 1) - '1'] = st.substring(0, st.length() - 1);
        }
        return String.join(" ", ans);
    }

    public static void main(String[] args) {
        // is2 sentence4 This1 a3
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String str = sc.nextLine();
        System.out.println(sortSentence(str));
    }
}
