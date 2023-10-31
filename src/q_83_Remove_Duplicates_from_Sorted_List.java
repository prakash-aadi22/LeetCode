import java.util.Scanner;

public class q_83_Remove_Duplicates_from_Sorted_List {
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        while (temp != null && temp.next != null) {
            if (temp.next.val == temp.val) {
                temp.next = temp.next.next;
                continue;
            }
            temp = temp.next;
        }
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
        System.out.println("LinkedList Value --> ");
        ListNode head1 = takeInput();
        deleteDuplicates(head1);
        print(deleteDuplicates(head1)); // not working
    }
}
