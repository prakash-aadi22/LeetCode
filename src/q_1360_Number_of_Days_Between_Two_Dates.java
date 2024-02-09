import java.util.Scanner;

public class q_1360_Number_of_Days_Between_Two_Dates {
    //    public static int daysBetweenDates(String date1, String date2) {
//        return Math.abs((int) ChronoUnit.DAYS.between(LocalDate.of(Integer.parseInt(date1.substring(0, 4)),
//                Integer.parseInt(date1.substring(5, 7)), Integer.parseInt(date1.substring(8, 10))),
//                LocalDate.of(Integer.parseInt(date2.substring(0, 4)), Integer.parseInt(date2.substring(5, 7)),
//                        Integer.parseInt(date2.substring(8, 10)))));
//    }

    private static final int[] MONTH_DAYS = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};

    public static int daysBetweenDates(String date1, String date2) {
        return Math.abs(dateToDays(date1) - dateToDays(date2));
    }

    private static int dateToDays(String date) {
        int year = convertYear(date);
        int month = convertMonth(date);
        int day = convertDay(date);
        return year * 365 + (year - 1968) / 4 + (year == 2100 || (year % 4 == 0 && month <= 2) ? -1 : 0) + MONTH_DAYS[month - 1] + day;
    }

    private static int convertYear(String date) {
        return (date.charAt(0) - '0') * 1000 + (date.charAt(1) - '0') * 100 + (date.charAt(2) - '0') * 10 + (date.charAt(3) - '0');
    }

    private static int convertMonth(String date) {
        return (date.charAt(5) - '0') * 10 + (date.charAt(6) - '0');
    }

    private static int convertDay(String date) {
        return (date.charAt(8) - '0') * 10 + (date.charAt(9) - '0');
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first date: ");
        String d1 = sc.next();
        System.out.print("Enter the second date: ");
        String d2 = sc.next();
        System.out.println((daysBetweenDates(d1, d2)));
    }
}
