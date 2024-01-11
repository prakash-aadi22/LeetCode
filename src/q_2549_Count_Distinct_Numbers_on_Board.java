import java.util.Scanner;

public class q_2549_Count_Distinct_Numbers_on_Board {
    public static int distinctIntegers(int n) {
//        ArrayList<Integer> al = new ArrayList<>();
//        while (n != 1) {
//            for (int i = 1; i <= n; i++) {
//                if (n % i == 1) {
//                    if (!al.contains(i)) {
//                        al.add(i);
//                    }
//                }
//            }
//            n--;
//        }
//        return (al.size() + 1);

//        if (n == 1) {
//            return 1;
//        } else {
//            return n - 1;
//        }
//        return n == 1 ? 1 : n - 1;

        return Math.max(n - 1, 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.println(distinctIntegers(n));
    }
}
