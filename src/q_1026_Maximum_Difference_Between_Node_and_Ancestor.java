import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class q_1026_Maximum_Difference_Between_Node_and_Ancestor {
    public static int maxAncestorDiff(TreeNode root) {
        int[] m = {0};
        dfs(root, m);
        return m[0];
    }

    private static int[] dfs(TreeNode root, int[] m) {
        if (root == null) {
            return new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE};
        }
        int[] left = dfs(root.left, m);
        int[] right = dfs(root.right, m);
        int minVal = Math.min(root.val, Math.min(left[0], right[0]));
        int maxVal = Math.max(root.val, Math.max(left[1], right[1]));
        m[0] = Math.max(m[0], Math.max(Math.abs(minVal - root.val), Math.abs(maxVal - root.val)));
        return new int[]{minVal, maxVal};
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
        System.out.println(maxAncestorDiff(root));
    }
}
