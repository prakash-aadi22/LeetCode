import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_Copy {
    public static void charValue() {
        String a = "hello2";
        System.out.println(a.charAt(a.length() - 1));
        System.out.println(a.charAt(a.length() - 1) - '0');
        System.out.println(a.charAt(a.length() - 1) - '1');
        System.out.println(a.charAt(a.length() - 1) - 'a');
        System.out.println(a.charAt(a.length() - 1) - '2');
        System.out.println(a.charAt(a.length() - 1) - '3');
    }

    public static void main(String[] args) {
        charValue();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = sc.nextInt();
        List<List<Integer>> my2DList = new ArrayList<>();
        for (int i = 0; i < rows; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter element at position " + (i + 1) + "," + (j + 1) + ": ");
                row.add(sc.nextInt());
            }
            my2DList.add(row);
        }
        System.out.println("Entered 2D list:");
        for (List<Integer> row : my2DList) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
