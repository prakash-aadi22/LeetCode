import java.util.Scanner;

public class q_191_Number_of_1_Bits {
    public static int hammingWeight(int n) {
//        int count = 0;
//        while (n != 0){
//            if (n % 10 == 1){
//                count++;
//            }
//            n /= 10;
//        }
//        return count;

//        int result = 0;
//        while (n != 0) {
//            result += (n & 1);
//            n >>>= 1;
//        }
//        return result;

        return Integer.bitCount(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.println(hammingWeight(n));
    }
}
