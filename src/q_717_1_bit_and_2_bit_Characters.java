import java.util.Arrays;
import java.util.Scanner;

public class q_717_1_bit_and_2_bit_Characters {

    public boolean isOneBitCharacter(int[] bits) {
        int i = 0;
        int n = bits.length;

        while (i < n - 1) {
            if (bits[i] == 1)
                i += 2;
            else
                i += 1;
        }

        return i == n - 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of array: ");
        int len = sc.nextInt();

        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter value at index " + i + ": ");
            arr[i] = sc.nextInt();
        }

        q_717_1_bit_and_2_bit_Characters obj = new q_717_1_bit_and_2_bit_Characters();

        System.out.println(obj.isOneBitCharacter(arr));
    }
}
