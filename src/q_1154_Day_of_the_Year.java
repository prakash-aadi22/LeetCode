import java.util.Scanner;

public class q_1154_Day_of_the_Year {
    public static int dayOfYear(String date) {
//        return LocalDate.parse(date).getDayOfYear();
        int month = 10 * date.charAt(5) + date.charAt(6) - 528, day = 10 * date.charAt(8) + date.charAt(9) - 528;
        if (month <= 2) {
            return day + (1 - month >>> 27);
        }
        day += 30 * month + month / 2 - 32 + ((month - 1 >> 3) & month);
        int yearPart = 10 * date.charAt(2) + date.charAt(3) - 528;
        if (yearPart == 0) {
            yearPart = 10 * date.charAt(0) + date.charAt(1) - 528;
        }
        return day + (((yearPart & 3) - 1) >>> 31);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the date: ");
        String d = sc.next();
        System.out.println((dayOfYear(d)));
    }
}
