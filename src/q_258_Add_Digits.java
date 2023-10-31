import java.util.Scanner;

public class q_258_Add_Digits {
    public static int addDigits(int num) {
//        int sum = 0;
//        while (num != 0) {
//            sum += num % 10;
//            num /= 10;
//            if (num == 0 && sum > 9){
//                num = sum;
//                sum = 0;
//            }
//        }
//        return sum;

        if (num == 0) {
            return 0;
        }
        if (num % 9 == 0) {
            return 9;
        }
        return num % 9;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        System.out.println(addDigits(sc.nextInt()));
    }
}
