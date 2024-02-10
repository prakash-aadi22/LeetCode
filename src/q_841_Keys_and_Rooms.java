import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class q_841_Keys_and_Rooms {
    public static boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];
        canVisitAllRoomsAux(rooms, 0, visited);
        for (boolean b : visited) {
            if (!b) {
                return false;
            }
        }
        return true;
    }

    public static void canVisitAllRoomsAux(List<List<Integer>> rooms, int room, boolean[] visited) {
        visited[room] = true;
        for (int i = 0; i < rooms.get(room).size(); i++) {
            if (!visited[rooms.get(room).get(i)]) {
                canVisitAllRoomsAux(rooms, rooms.get(room).get(i), visited);
            }
        }
    }

    public static void main(String[] args) {
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
        System.out.println(canVisitAllRooms(my2DList));
    }
}
