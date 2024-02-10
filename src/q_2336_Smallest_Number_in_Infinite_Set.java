import java.util.Scanner;

class SmallestInfiniteSet {
    boolean[] list;
    int nums;

    public SmallestInfiniteSet() {
        list = new boolean[1001];
        nums = 1;
    }

    public int popSmallest() {
        for (int x = nums; x < list.length; x++) {
            if (!list[x]) {
                list[x] = true;
                nums = x;
                break;
            }
        }
        return nums;
    }

    public void addBack(int num) {
        list[num] = false;
        nums = Math.min(num, nums);
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */
public class q_2336_Smallest_Number_in_Infinite_Set {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SmallestInfiniteSet set = new SmallestInfiniteSet();
        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Pop the smallest number");
            System.out.println("2. Add back a number");
            System.out.println("3. Exit");
            int choice = sc.nextInt();
            sc.nextLine();  // Consume newline
            switch (choice) {
                case 1:
                    int poppedNumber = set.popSmallest();
                    System.out.println("Popped the smallest number: " + poppedNumber);
                    break;
                case 2:
                    System.out.println("Enter the number to add back:");
                    int addBackNumber = sc.nextInt();
                    sc.nextLine();  // Consume newline
                    set.addBack(addBackNumber);
                    System.out.println("Number added back successfully!");
                    break;
                case 3:
                    System.out.println("Exiting program...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
