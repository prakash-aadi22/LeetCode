import java.util.Arrays;
import java.util.Scanner;

public class q_2418_Sort_the_People {
    public static String[] sortPeople(String[] names, int[] heights) {
        quickSort(names, heights, 0, heights.length - 1);
        return names;
    }

    static void quickSort(String[] names, int[] heights, int low, int high) {
        if (low >= high) {
            return;
        }
        int start = low;
        int end = high;
        int mid = start + (end - start) / 2;
        int pivot = heights[mid];
        while (start <= end) {
            while (heights[start] > pivot) {
                start++;
            }
            while (heights[end] < pivot) {
                end--;
            }
            if (start <= end) {
                swap(names, heights, start, end);
                start++;
                end--;
            }
        }
        quickSort(names, heights, low, end);
        quickSort(names, heights, start, high);
    }

    static void swap(String[] names, int[] heights, int start, int end) {
        int num = heights[start];
        heights[start] = heights[end];
        heights[end] = num;
        String name = names[start];
        names[start] = names[end];
        names[end] = name;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of people:");
        int n = sc.nextInt();
        String[] names = new String[n];
        int[] heights = new int[n];
        System.out.println("Enter names of people:");
        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
        }
        System.out.println("Enter heights of people:");
        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(sortPeople(names, heights)));
    }
}
