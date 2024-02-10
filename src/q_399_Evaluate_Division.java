import java.util.*;

public class q_399_Evaluate_Division {
    private static final Map<String, String> root = new HashMap<>();
    private static final Map<String, Double> weight = new HashMap<>();

    public static double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        for (int i = 0; i < values.length; i++) {
            String a = equations.get(i).get(0);
            String b = equations.get(i).get(1);
            double val = values[i];
            String rootA = find(a);
            String rootB = find(b);
            root.put(rootA, rootB);
            weight.put(rootA, val * weight.get(b) / weight.get(a));
        }
        double[] results = new double[queries.size()];
        for (int i = 0; i < queries.size(); i++) {
            String a = queries.get(i).get(0);
            String b = queries.get(i).get(1);
            if (!root.containsKey(a) || !root.containsKey(b)) {
                results[i] = -1.;
            } else {
                String rootA = find(a);
                String rootB = find(b);
                if (!rootA.equals(rootB)) {
                    results[i] = -1.;
                } else {
                    results[i] = weight.get(a) / weight.get(b);
                }
            }
        }
        return results;
    }

    private static String find(String x) {
        if (!root.containsKey(x)) {
            root.put(x, x);
            weight.put(x, 1.);
            return x;
        }
        if (root.get(x).equals(x)) {
            return x;
        }
        String currentRoot = root.get(x);
        String correctionRoot = find(currentRoot);
        root.put(x, correctionRoot);
        weight.put(x, weight.get(x) * weight.get(currentRoot));
        return correctionRoot;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows of equations: ");
        int rows1 = sc.nextInt();
        System.out.print("Enter the number of columns of equations: ");
        int columns1 = sc.nextInt();
        List<List<String>> l1 = new ArrayList<>();
        for (int i = 0; i < rows1; i++) {
            ArrayList<String> row = new ArrayList<>();
            for (int j = 0; j < columns1; j++) {
                System.out.print("Enter element at position " + (i + 1) + "," + (j + 1) + ": ");
                row.add(sc.next());
            }
            l1.add(row);
        }
        System.out.print("Enter the length of array: ");
        int len = sc.nextInt();
        double[] arr = new double[len];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the value of " + i + " element of the array: ");
            arr[i] = sc.nextDouble();
        }
        System.out.print("Enter the number of rows of queries: ");
        int rows2 = sc.nextInt();
        System.out.print("Enter the number of columns of queries: ");
        int columns2 = sc.nextInt();
        List<List<String>> l2 = new ArrayList<>();
        for (int i = 0; i < rows2; i++) {
            ArrayList<String> row = new ArrayList<>();
            for (int j = 0; j < columns2; j++) {
                System.out.print("Enter element at position " + (i + 1) + "," + (j + 1) + ": ");
                row.add(sc.next());
            }
            l2.add(row);
        }
        System.out.println(Arrays.toString(calcEquation(l1, arr, l2)));
    }
}
