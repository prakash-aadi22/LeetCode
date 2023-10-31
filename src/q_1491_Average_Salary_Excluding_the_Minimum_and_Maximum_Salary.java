import java.util.Arrays;
import java.util.Scanner;

public class q_1491_Average_Salary_Excluding_the_Minimum_and_Maximum_Salary {
    public static double average(int[] salary) {
        Arrays.sort(salary);
        double sum = 0;
        for (int i = 1; i < salary.length - 1; i++) {
            sum += salary[i];
        }
        return sum / (salary.length - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of Array:  ");
        int size = sc.nextInt();
        int[] salary = new int[size];
        for (int i = 0; i < salary.length; i++) {
            System.out.print("Enter the salary of " + i + "th employee: ");
            salary[i] = sc.nextInt();
        }
        System.out.println(average(salary));
    }
}
