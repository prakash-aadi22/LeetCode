import java.util.Scanner;

public class q_2_Add_Two_Numbers {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode tail = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int digit1 = (l1 != null) ? l1.val : 0;
            int digit2 = (l2 != null) ? l2.val : 0;

            int sum = digit1 + digit2 + carry;
            int digit = sum % 10;
            carry = sum / 10;

            tail.next = new ListNode(digit);
            tail = tail.next;

            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }

        ListNode result = dummyHead.next;
        dummyHead.next = null;
        return result;
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

    public static void print(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.print("First LinkedList --> ");
        ListNode head1 = takeInput();
        System.out.print("Second LinkedList --> ");
        ListNode head2 = takeInput();
        print(addTwoNumbers(head1, head2));
    }
}
