import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class q_1161_Maximum_Level_Sum_of_a_Binary_Tree {
    static int max = Integer.MIN_VALUE;
    static int minLevel = 0;
    static int high = 1;
    static int[] breadthSum;

    public static int maxLevelSum(TreeNode root) {
        breadthSum = new int[3000];
        high = 1;
        dfs(root, 1);
        for (int i = 1; i <= high; i++) {
            if (max < breadthSum[i]) {
                max = breadthSum[i];
                minLevel = i;
            }
        }
        return minLevel;
    }

    public static void dfs(TreeNode root, int level) {
        if (root == null) {
            return;
        }
        breadthSum[level] += root.val;
        if (high < level) {
            high = level;
        }
        dfs(root.left, level + 1);
        dfs(root.right, level + 1);
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
        TreeNode root = takeInput_LevelWise();
        System.out.println(maxLevelSum(root));
    }
}
