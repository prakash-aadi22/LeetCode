import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class q_1466_Reorder_Routes_to_Make_All_Paths_Lead_to_the_City_Zero {
    public static int minReorder(int n, int[][] connections) {
        List<int[]> toCheck = new ArrayList<>();
        boolean[] isConnected = new boolean[n];
        isConnected[0] = true;
        int ans = 0;
        for (int[] c : connections) {
            if (isConnected[c[1]]) {
                isConnected[c[0]] = true;
            } else if (isConnected[c[0]]) {
                isConnected[c[1]] = true;
                ans++;
            } else {
                toCheck.add(c);
            }
        }
        while (!toCheck.isEmpty()) {
            for (int i = 0; i < toCheck.size(); i++) {
                int u = toCheck.get(i)[0];
                int v = toCheck.get(i)[1];
                if (isConnected[v]) {
                    isConnected[u] = true;
                    toCheck.remove(i);
                    i--;
                } else if (isConnected[u]) {
                    isConnected[v] = true;
                    ans++;
                    toCheck.remove(i);
                    i--;
                }
            }
            for (int i = toCheck.size() - 1; i >= 0; i--) {
                int u = toCheck.get(i)[0];
                int v = toCheck.get(i)[1];
                if (isConnected[v]) {
                    isConnected[u] = true;
                    toCheck.remove(i);
                } else if (isConnected[u]) {
                    isConnected[v] = true;
                    ans++;
                    toCheck.remove(i);
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int columns = sc.nextInt();
        int[][] arr = new int[rows][columns];
        System.out.println("Enter the points (format: x y):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        System.out.println(minReorder(n, arr));
    }
}
