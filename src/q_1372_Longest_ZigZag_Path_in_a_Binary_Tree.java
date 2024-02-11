import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class q_1372_Longest_ZigZag_Path_in_a_Binary_Tree {
    private static int longestZigZagLength;

    public static int longestZigZag(TreeNode root) {
        longestZigZagLength = 0;
        dfs(root, 0, 0);
        return longestZigZagLength;
    }

    private static void dfs(TreeNode node, int leftLength, int rightLength) {
        if (node == null) {
            return;
        }
        longestZigZagLength = Math.max(longestZigZagLength, Math.max(leftLength, rightLength));
        dfs(node.left, rightLength + 1, 0);
        dfs(node.right, 0, leftLength + 1);
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
        System.out.println(longestZigZag(root));
    }
}
