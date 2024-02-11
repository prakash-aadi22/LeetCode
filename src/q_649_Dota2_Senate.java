import java.util.Scanner;

public class q_649_Dota2_Senate {
    public static String predictPartyVictory(String senate) {
        return vote(senate.toCharArray(), 0);
    }

    private static String vote(char[] charArray, int votes) {
        int r = 0;
        int d = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == 'R') {
                if (votes >= 0) {
                    r++;
                } else {
                    charArray[i] = '#';
                }
                votes++;
            } else if (charArray[i] == 'D') {
                if (votes <= 0) {
                    d--;
                } else {
                    charArray[i] = '#';
                }
                votes--;
            }
        }
        if (r == 0) return "Dire";
        if (d == 0) return "Radiant";
        return vote(charArray, votes);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.next();
        System.out.println(predictPartyVictory(str));
    }
}
