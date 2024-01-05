import java.util.Scanner;

public class q_434_Number_of_Segments_in_a_String {
    public static int countSegments(String s) {
        s = s.replaceAll("\\s+", " ").trim();
        if (s.isEmpty()) {
            return 0;
        }
        return s.split(" ").length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        System.out.println(countSegments(str));
    }
}
