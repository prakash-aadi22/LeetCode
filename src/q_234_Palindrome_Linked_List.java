import java.util.ArrayList;
import java.util.Scanner;

public class q_234_Palindrome_Linked_List {

    public static boolean isPalindrome(ListNode head) {
        ArrayList<Integer> al = new ArrayList<>();
        while (head != null) {
            al.add(head.val);
            head = head.next;
        }
        int end = al.size();
//        for (int i = 0; i < al.size(); i++) {
        for (Integer integer : al) {
            end--;
//            if (al.get(i) != al.get(end)) {
            if (!integer.equals(al.get(end))) {
                return false;
            }
        }
        return true;
    }

    static Scanner sc = new Scanner(System.in);

    public static ListNode takeInput() {
        ListNode head = null, tail = null;
        int data = sc.nextInt();
        while (data != -1) {
            ListNode newNode = new ListNode(data);
            if (head == null) {
                head = newNode;
            } else {
                tail.next = newNode;
            }
            tail = newNode;
            data = sc.nextInt();
        }
        return head;
    }

    public static void main(String[] args) {
        System.out.print("Enter the List values --> ");
        ListNode head = takeInput();
        System.out.println(isPalindrome(head));
    }
}
