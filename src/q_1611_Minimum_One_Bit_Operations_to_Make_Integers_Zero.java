import java.util.Scanner;

public class q_1611_Minimum_One_Bit_Operations_to_Make_Integers_Zero {
    public static int minimumOneBitOperations(int n) {
        if (n == 0) {
            return n;
        }
        int k = 0;
        int curr = 1;
        while (curr * 2 <= n) {
            curr *= 2;
            k++;
        }
        return (1 << (k + 1)) - 1 - minimumOneBitOperations(n ^ curr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.println(minimumOneBitOperations(num));
    }
}
