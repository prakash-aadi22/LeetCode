import java.util.Scanner;
import java.util.stream.Collectors;

public class q_2325_Decode_the_Message {
    public static String decodeMessage(String key, String message) {
        char[] m = new char[128];
        m[' '] = ' ';
        char cur = 'a';
        for (var k : key.toCharArray()) {
            m[k] = m[k] != 0 ? m[k] : cur++;
        }
        return message.chars().mapToObj(i -> String.valueOf(m[i])).collect(Collectors.joining());

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the key: ");
        String key = sc.nextLine();
        System.out.print("Enter the message: ");
        String message = sc.nextLine();
        System.out.println(decodeMessage(key, message));
    }
}
