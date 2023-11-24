import java.util.Scanner;

public class q_1342_Number_of_Steps_to_Reduce_a_Number_to_Zero {
    public static int numberOfSteps(int num) {
        int stepCounter = 0;
        while (num > 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num--;
            }
            stepCounter++;
        }
        return stepCounter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of num: ");
        int n = sc.nextInt();
        System.out.println(numberOfSteps(n));
    }
}
