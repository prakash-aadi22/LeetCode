import java.util.ArrayList;
import java.util.Scanner;

class StockSpanner {
    ArrayList<Integer> prev;
    ArrayList<Integer> days;

    public StockSpanner() {
        prev = new ArrayList<>();
        days = new ArrayList<>();
    }

    public int next(int price) {
        int size = prev.size();
        if (size == 0) {
            prev.add(price);
            days.add(1);
            return 1;
        } else {
            int day = 1;
            size--;
            while (size >= 0) {
                if (prev.get(size) <= price) {
                    day += days.get(size);
                    size -= days.get(size);
                } else {
                    break;
                }
            }
            prev.add(price);
            days.add(day);
            return day;
        }
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
public class q_901_Online_Stock_Span {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StockSpanner obj = new StockSpanner();
        System.out.println("Enter the number of days:");
        int n = sc.nextInt();
        System.out.println("Enter the prices for each day:");
        for (int i = 0; i < n; i++) {
            int price = sc.nextInt();
            int span = obj.next(price);
            System.out.println("Day " + (i + 1) + ": " + span);
        }
    }
}
