import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class MyStack {
    private final Queue<Integer> q;

    public MyStack() {
        q = new LinkedList<>();
    }

    public void push(int x) {
        q.add(x);
        for (int i = 1; i < q.size(); i++) {
            q.add(q.remove());
        }
    }

    public int pop() {
        return q.remove();
    }

    public int top() {
        return q.peek();
    }

    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
public class q_225_Implement_Stack_using_Queues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyStack myStack = new MyStack();
        while (true) {
            System.out.println("Enter your choice:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Top");
            System.out.println("4. Empty");
            System.out.println("5. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the element to push: ");
                    int elementToPush = sc.nextInt();
                    myStack.push(elementToPush);
                    System.out.println("Element pushed.");
                    break;
                case 2:
                    if (!myStack.empty()) {
                        System.out.println("Popped element: " + myStack.pop());
                    } else {
                        System.out.println("Stack is empty.");
                    }
                    break;
                case 3:
                    if (!myStack.empty()) {
                        System.out.println("Top element: " + myStack.top());
                    } else {
                        System.out.println("Stack is empty.");
                    }
                    break;
                case 4:
                    System.out.println("Is stack empty? " + myStack.empty());
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
