import java.util.Scanner;

public class q_451_Sort_Characters_By_Frequency {
    public static String frequencySort(String s) {
        char[] str = s.toCharArray();
        int[] freq = new int[128];
        for (int i = 0; i < str.length; i++) {
            freq[str[i]]++;
        }
        for (int i = 0; i < str.length; ) {
            char cmax = ',';
            for (int j = 0; j < 128; j++) {
                if (freq[j] > freq[cmax]) cmax = (char) j;
            }
            while (freq[cmax] != 0) {
                str[i++] = cmax;
                freq[cmax]--;
            }
        }
        return new String(str);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s = sc.nextLine();
        System.out.println(frequencySort(s));
    }
}
