import java.util.Scanner;

class VersionControl {
    // Dummy implementation, replace this with your actual implementation
    boolean isBadVersion(int version) {
        // Your implementation here
        return false;
    }
}

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */
class firstBadVersion_278 extends VersionControl {
    public int firstBadVersion(int n) {
        int l = 1;
        int h = n;
        int mid;
        while (l < h) {
            mid = l + (h - l) / 2;
            if (isBadVersion(mid)) {
                h = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }
}

public class q_278_First_Bad_Version {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        firstBadVersion_278 sol = new firstBadVersion_278();
        System.out.println(sol.firstBadVersion(n));
    }
}
