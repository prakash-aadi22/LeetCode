import java.util.PriorityQueue;
import java.util.Scanner;

public class q_2785_Sort_Vowels_in_a_String {
    public static String sortVowels(String s) {
        char[] str = s.toCharArray();
        PriorityQueue<Character> pq = new PriorityQueue<>();
        for (char c : str) {
            if ("AEIOUaeiou".indexOf(c) != -1) {
                pq.offer(c);
            }
        }
        for (int i = 0; i < str.length; i++) {
            if ("AEIOUaeiou".indexOf(str[i]) != -1 && !pq.isEmpty()) {
                str[i] = pq.poll();
            }
        }
        return new String(str);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(sortVowels(s));
    }
}
