import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class q_1448_Count_Good_Nodes_in_Binary_Tree {
    public static int goodNodes(TreeNode root) {
        return 1 + goodNodes(root, root.val);
    }

    static int goodNodes(TreeNode root, int val) {
        if (root == null) return 0;
        TreeNode left = root.left;
        TreeNode right = root.right;
        int l = 0, r = 0;
        if (left != null) {
            if (left.val >= val) {
                l = 1 + goodNodes(left, left.val);
            } else {
                l = goodNodes(left, val);
            }
        }
        if (right != null) {
            if (right.val >= val) {
                r = 1 + goodNodes(right, right.val);
            } else {
                r = goodNodes(right, val);
            }
        }
        return l + r;
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
        System.out.println(goodNodes(root));
    }
}
