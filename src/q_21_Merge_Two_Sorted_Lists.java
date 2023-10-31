import java.util.Scanner;

public class q_21_Merge_Two_Sorted_Lists {

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode preHead = new ListNode(-1);
        ListNode cur = preHead;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                cur.next = list1;
                list1 = list1.next;
            } else {
                cur.next = list2;
                list2 = list2.next;
            }
            cur = cur.next;
        }
        cur.next = list1 == null ? list2 : list1;
        return preHead.next;
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
        System.out.println("First LinkedList --> ");
        ListNode head1 = takeInput();
        System.out.println("Second LinkedList --> ");
        ListNode head2 = takeInput();
        mergeTwoLists(head1, head2);
        print(mergeTwoLists(head1, head2)); // not working
    }
}
