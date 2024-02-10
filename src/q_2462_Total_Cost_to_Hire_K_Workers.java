import java.util.Arrays;
import java.util.Scanner;

public class q_2462_Total_Cost_to_Hire_K_Workers {
    public static long totalCost(int[] costs, int k, int candidates) {
        long cost = 0;
        int startPtr = candidates - 1;
        int endPtr = costs.length - candidates;
        if (startPtr >= endPtr) {
            endPtr = startPtr + 1;
        }
        int[] startCandidates = Arrays.copyOfRange(costs, 0, startPtr + 1);
        int[] endCandidates = Arrays.copyOfRange(costs, endPtr, costs.length);
        int startLimit = startCandidates.length;
        int endLimit = endCandidates.length;
        buildMinHeap(startCandidates);
        buildMinHeap(endCandidates);
        while (k > 0) {
            int startMin = startCandidates[0];
            int endMin;
            if (endCandidates.length > 0) {
                endMin = endCandidates[0];
            } else {
                endMin = 10000000;
            }
            if (startLimit == 0) {
                startMin = 10000000;
            }
            if (endLimit == 0) {
                endMin = 10000000;
            }
            if (startMin <= endMin) {
                cost = cost + startMin;
                if (startPtr < endPtr - 1) {
                    startCandidates[0] = costs[++startPtr];
                    minHeapify(0, startCandidates, candidates);
                } else {
                    swap(startCandidates, 0, startLimit - 1);
                    minHeapify(0, startCandidates, --startLimit);
                }
            } else {
                cost = cost + endMin;
                if (endPtr > startPtr + 1) {
                    endCandidates[0] = costs[--endPtr];
                    minHeapify(0, endCandidates, candidates);
                } else {
                    swap(endCandidates, 0, endLimit - 1);
                    minHeapify(0, endCandidates, --endLimit);
                }
            }
            k--;
        }
        return cost;
    }

    static void buildMinHeap(int[] arr) {
        for (int i = (arr.length - 1) / 2; i >= 0; i--) {
            minHeapify(i, arr, arr.length);
        }
    }

    static void minHeapify(int index, int[] arr, int limit) {
        int left = 2 * index + 1;
        int right = 2 * index + 2;
        int max = index;

        if (left < limit && arr[left] < arr[max]) max = left;
        if (right < limit && arr[right] < arr[max]) max = right;

        if (max == index) return;
        swap(arr, index, max);
        minHeapify(max, arr, limit);
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int len = sc.nextInt();
        int[] nums = new int[len];
        for (int i = 0; i < nums.length; i++) {
            System.out.print("Enter the " + i + "th value: ");
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();
        System.out.print("Enter the value of candidates: ");
        int c = sc.nextInt();
        System.out.println(totalCost(nums, k, c));
    }
}
