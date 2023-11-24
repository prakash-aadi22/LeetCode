import java.util.Scanner;

public class q_1662_Check_If_Two_String_Arrays_are_Equivalent {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        for (int i = 0; i < word1.length; i++) {
            sb1.append(word1[i]);
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < word2.length; i++) {
            sb2.append(word2[i]);
        }
        return sb1.compareTo(sb2) == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the first array: ");
        int len1 = sc.nextInt();
        String[] str1 = new String[len1];
        for (int i = 0; i < str1.length; i++) {
            System.out.print("Enter the string value of " + i + "th index: ");
            str1[i] = sc.next();
        }
        System.out.print("Enter the length of the second array: ");
        int len2 = sc.nextInt();
        String[] str2 = new String[len2];
        for (int i = 0; i < str2.length; i++) {
            System.out.print("Enter the string value of " + i + "th index: ");
            str2[i] = sc.next();
        }
        System.out.println(arrayStringsAreEqual(str1, str2));
    }
}
