import java.util.Scanner;

public class q_19_Remove_Nth_Node_From_End_of_List {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head, slow = head;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        if (fast == null) {
            assert head != null;
            return head.next;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
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
        System.out.print("Values of the List --> ");
        ListNode head1 = takeInput();
        System.out.print("Enter the node to delete: ");
        int n = sc.nextInt();
        print(removeNthFromEnd(head1, n));
    }
}
