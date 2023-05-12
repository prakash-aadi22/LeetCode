import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class q_412_Fizz_Buzz {
    public static List<String> fizzBuzz(int n) {
        List<String> l1 = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                l1.add("FizzBuzz");
            } else if (i % 3 == 0) {
                l1.add("Fizz");
            } else if (i % 5 == 0) {
                l1.add("Buzz");
            } else {
                l1.add(String.valueOf(i));
            }
        }
        return l1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        System.out.println(fizzBuzz(sc.nextInt()));
    }
}
