import java.util.Scanner;
import java.util.Stack;

class MyQueue {
    private final Stack<Integer> s1;
    private final Stack<Integer> s2;

    public MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void push(int x) {
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        s1.push(x);
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }

    public int pop() {
        return s1.pop();

    }

    public int peek() {
        return s1.peek();
    }

    public boolean empty() {
        return s1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
public class q_232_Implement_Queue_using_Stacks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyQueue myQueue = new MyQueue();
        while (true) {
            System.out.println("Enter your choice:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Empty");
            System.out.println("5. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the element to push: ");
                    int elementToPush = sc.nextInt();
                    myQueue.push(elementToPush);
                    System.out.println("Element pushed.");
                    break;
                case 2:
                    if (!myQueue.empty()) {
                        System.out.println("Popped element: " + myQueue.pop());
                    } else {
                        System.out.println("Queue is empty.");
                    }
                    break;
                case 3:
                    if (!myQueue.empty()) {
                        System.out.println("Front element: " + myQueue.peek());
                    } else {
                        System.out.println("Queue is empty.");
                    }
                    break;
                case 4:
                    System.out.println("Is queue empty? " + myQueue.empty());
                    break;
                case 5:
                    System.out.println("Exiting program.");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
