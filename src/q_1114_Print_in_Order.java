import java.util.Scanner;

class Foo {

    volatile int methodCompleted;

    public Foo() {
        methodCompleted = 0;
    }

    public void first(Runnable printFirst) throws InterruptedException {
        printFirst.run();
        methodCompleted = 1;
    }

    public void second(Runnable printSecond) throws InterruptedException {
        while (methodCompleted != 1) Thread.onSpinWait();
        printSecond.run();
        methodCompleted = 1;
    }

    public void third(Runnable printThird) throws InterruptedException {
        while (methodCompleted != 2) Thread.onSpinWait();
        printThird.run();
    }
}

public class q_1114_Print_in_Order {
    public static void main(String[] args) {
        Foo foo = new Foo();

        Runnable printFirst = () -> System.out.print("first");
        Runnable printSecond = () -> System.out.print("second");
        Runnable printThird = () -> System.out.print("third");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the order (e.g., 1 2 3 or 1 3 2):");
        String input = sc.nextLine();
        String[] order = input.split(" ");

        for (String s : order) {
            int num = Integer.parseInt(s);
            if (num == 1) {
                new Thread(() -> {
                    try {
                        foo.first(printFirst);
                    } catch (InterruptedException e) {
                        System.out.println("" + e);
                    }
                }).start();
            } else if (num == 2) {
                new Thread(() -> {
                    try {
                        foo.second(printSecond);
                    } catch (InterruptedException e) {
                        System.out.println("" + e);
                    }
                }).start();
            } else if (num == 3) {
                new Thread(() -> {
                    try {
                        foo.third(printThird);
                    } catch (InterruptedException e) {
                        System.out.println("" + e);
                    }
                }).start();
            }
        }
    }
}
