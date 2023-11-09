import java.util.Arrays;
import java.util.Scanner;

public class q_2469_Convert_the_Temperature {
    public static double[] convertTemperature(double celsius) {
        double[] ans = new double[2];
        ans[0] = celsius + 273.15;
        ans[1] = (celsius * 1.80) + 32.00;
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature in Celsius: ");
        double temp = sc.nextDouble();
        System.out.println(Arrays.toString(convertTemperature(temp)));
    }
}
