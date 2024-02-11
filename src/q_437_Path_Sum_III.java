import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class q_437_Path_Sum_III {
    static int count = 0;
    static int k;
    static HashMap<Long, Integer> h = new HashMap<>();

    public static int pathSum(TreeNode root, int targetSum) {
        k = targetSum;
        preorder(root, 0L);
        return count;
    }

    public static void preorder(TreeNode node, long currSum) {
        if (node == null) {
            return;
        }
        currSum += node.val;
        if (currSum == k) {
            count++;
        }
        count += h.getOrDefault(currSum - k, 0);
        h.put(currSum, h.getOrDefault(currSum, 0) + 1);
        preorder(node.left, currSum);
        preorder(node.right, currSum);
        h.put(currSum, h.get(currSum) - 1);
    }

    public static TreeNode takeInput_LevelWise() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter root data");
        int rootData = sc.nextInt();
        TreeNode root = new TreeNode(rootData);
        Queue<TreeNode> pendingNodes = new LinkedList<>();
        pendingNodes.add(root);

        while (!pendingNodes.isEmpty()) {
            TreeNode frontNode = pendingNodes.poll();

            System.out.println("Enter left child of " + frontNode.val + " (or -1 if no left child): ");
            int leftChildData = sc.nextInt();
            if (leftChildData != -1) {
                frontNode.left = new TreeNode(leftChildData);
                pendingNodes.add(frontNode.left);
            }

            System.out.println("Enter right child of " + frontNode.val + " (or -1 if no right child): ");
            int rightChildData = sc.nextInt();
            if (rightChildData != -1) {
                frontNode.right = new TreeNode(rightChildData);
                pendingNodes.add(frontNode.right);
            }
        }
        return root;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeNode root = takeInput_LevelWise();
        System.out.print("Enter the target sum: ");
        int n = sc.nextInt();
        System.out.println(pathSum(root, n));
    }
}
