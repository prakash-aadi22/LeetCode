public class Main_Copy {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        System.out.println("Hello World");

        int n = 10; // Change the value of 'n' to generate a different number of Fibonacci numbers

        System.out.println("Fibonacci Series:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println("\n--------------");
        System.out.print(fibonacci(n) + " ");
    }

}
