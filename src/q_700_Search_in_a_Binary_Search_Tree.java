import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class q_700_Search_in_a_Binary_Search_Tree {
    public static TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            return null;
        }
        if (root.val == val) {
            return root;
        } else {
            return val < root.val ? searchBST(root.left, val) : searchBST(root.right, val);
        }
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
        System.out.print("Enter the value: ");
        int v = sc.nextInt();
        System.out.println(searchBST(root, v));
    }
}
