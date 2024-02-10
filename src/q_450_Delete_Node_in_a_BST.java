import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class q_450_Delete_Node_in_a_BST {
    public static TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }
        if (key < root.val) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.val) {
            root.right = deleteNode(root.right, key);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            TreeNode minNode = findMin(root.right);
            root.val = minNode.val;
            root.right = deleteNode(root.right, root.val);
        }
        return root;
    }

    private static TreeNode findMin(TreeNode node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
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
        System.out.print("Enter the value of key: ");
        int key = sc.nextInt();
        System.out.println(deleteNode(root, key));
    }
}
