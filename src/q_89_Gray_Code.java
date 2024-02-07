import java.util.AbstractList;
import java.util.List;
import java.util.Scanner;

public class q_89_Gray_Code {

    public static List<Integer> grayCode(int n) {
        return new AbstractList<>() {
            public Integer get(int index) {
                return index ^ (index / 2);
            }

            public int size() {
                return 1 << n;
            }
        };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.println(grayCode(n));
    }
}
