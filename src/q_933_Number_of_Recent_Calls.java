import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class RecentCounter {
    Queue<Integer> q;

    public RecentCounter() {
        q = new LinkedList<>();
    }

    public int ping(int t) {
        q.add(t);
        while (q.peek() < t - 3000) {
            q.poll();
        }
        return q.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
public class q_933_Number_of_Recent_Calls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RecentCounter obj = new RecentCounter();
        while (true) {
            System.out.print("Enter a timestamp (or type 'exit' to quit): ");
            String input = sc.next();
            if (input.equals("exit")) {
                break;
            }
            try {
                int timestamp = Integer.parseInt(input);
                int count = obj.ping(timestamp);
                System.out.println("Number of recent calls: " + count);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer or 'exit'.");
            }
        }
    }
}
