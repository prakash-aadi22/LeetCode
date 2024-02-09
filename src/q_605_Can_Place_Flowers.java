import java.util.Scanner;

public class q_605_Can_Place_Flowers {

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        int k = 0;
        for (int i = 0; i < len; i++) {
            if (flowerbed[i] == 1) {
                i++;
            } else if (flowerbed[i] == 0) {
                if (i == len - 1) {
                    k++;
                } else if (flowerbed[i + 1] == 0) {
                    k++;
                    i++;
                } else {
                    i += 2;
                }
            }
        }
        return k >= n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the value of " + i + " element of the array: ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the value of the target: ");
        int t = sc.nextInt();
        System.out.println((canPlaceFlowers(arr, t)));
    }
}
