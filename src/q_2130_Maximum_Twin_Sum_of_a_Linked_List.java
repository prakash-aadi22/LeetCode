import java.util.Scanner;

public class q_2130_Maximum_Twin_Sum_of_a_Linked_List {
    public static int pairSum(ListNode head) {
        ListNode firstHead = null;
        ListNode secondTail = head.next;
        ListNode next;
        while (secondTail.next != null) {
            next = head.next;
            head.next = firstHead;
            firstHead = head;
            head = next;
            secondTail = secondTail.next.next;
        }
        next = head.next;
        head.next = firstHead;
        firstHead = head;
        head = next;
        int max = 0;
        while (firstHead != null) {
            max = Math.max(firstHead.val + head.val, max);
            firstHead = firstHead.next;
            head = head.next;
        }
        return max;
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
        System.out.print("Enter the LinkedList --> ");
        ListNode head1 = takeInput();
        System.out.println(pairSum(head1));
    }
}
