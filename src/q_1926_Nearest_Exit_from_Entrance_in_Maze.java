import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class q_1926_Nearest_Exit_from_Entrance_in_Maze {
    public static int nearestExit(char[][] maze, int[] entrance) {
        int[][] dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        Queue<int[]> q = new LinkedList<>();
        int count = 0;
        q.add(entrance);
        int x = entrance[0];
        int y = entrance[1];
        maze[x][y] = '+';
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int[] arr = q.poll();
                for (int[] dir : dirs) {
                    assert arr != null;
                    int newX = arr[0] + dir[0];
                    int newY = arr[1] + dir[1];
                    if (newX < 0 || newX >= maze.length || newY < 0 || newY >= maze[0].length) {
                        if (count != 0) {
                            return count;
                        }
                    } else if (maze[newX][newY] == '.') {
                        q.add(new int[]{newX, newY});
                        maze[newX][newY] = '+';
                    }

                }
            }
            count++;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int columns = sc.nextInt();
        char[][] maze = new char[rows][columns];
        System.out.println("Enter the points (format: x y):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                maze[i][j] = sc.next().charAt(0);
            }
        }
        System.out.print("Enter the length of array: ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the value of " + i + " element of the array: ");
            arr[i] = sc.nextInt();
        }
        System.out.println(nearestExit(maze, arr));
    }
}
