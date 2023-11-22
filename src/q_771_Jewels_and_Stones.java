import java.util.Scanner;

public class q_771_Jewels_and_Stones {
    public static int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for (int i = 0; i < jewels.length(); i++) {
            for (int j = 0; j < stones.length(); j++) {
                if (jewels.charAt(i) == stones.charAt(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the jewels: ");
        String str1 = sc.next();
        System.out.print("Enter the stones: ");
        String str2 = sc.next();
        System.out.println(numJewelsInStones(str1, str2));
    }
}
