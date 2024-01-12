import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class q_2790_Maximum_Number_of_Groups_With_Increasing_Length {

    public static int maxIncreasingGroups(List<Integer> usageLimits) {
        int n = usageLimits.size();
        int[] count = new int[n + 1];
        for (Integer limit : usageLimits) {
            int x = Math.min(limit, n);
            count[x]++;
        }
        long total = 0, k = 0;
        for (int usageLimit = 1; usageLimit <= n; usageLimit++) {
            for (int c = 0; c < count[usageLimit]; c++) {
                total += usageLimit;
                if (total >= k + 1)
                    total -= ++k;
            }
        }
        return (int) k;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int numberOfElements = sc.nextInt();
        List<Integer> usageLimits = new ArrayList<>();
        System.out.println("Enter " + numberOfElements + " integers:");
        for (int i = 0; i < numberOfElements; i++) {
            usageLimits.add(sc.nextInt());
        }
        System.out.println("Result: " + maxIncreasingGroups(usageLimits));
    }
}
