import java.util.Scanner;

public class q_58_Length_of_Last_Word {
    public static int lengthOfLastWord(String s) {
        int len;
        String[] arr = s.split(" ");
//        len = arr[0].length(); //for first word if first word is not space
        len = arr[arr.length - 1].length(); //for last word
        return len;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String s = sc.nextLine();
        System.out.println(lengthOfLastWord(s));
    }
}
