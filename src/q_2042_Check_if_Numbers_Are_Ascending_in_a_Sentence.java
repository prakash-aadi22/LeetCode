import java.util.Scanner;

public class q_2042_Check_if_Numbers_Are_Ascending_in_a_Sentence {
    public static boolean areNumbersAscending(String s) {
        int checkPoint = 0;
        for (String str : s.split(" ")) {
            if (Character.isDigit(str.charAt(0))) {
                int number = Integer.parseInt(str);
                if (number <= checkPoint) {
                    return false;
                }
                checkPoint = number;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // 1 box has 3 blue 4 red 6 green and 12 yellow marbles
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String str = sc.nextLine();
        System.out.println(areNumbersAscending(str));
    }
}
