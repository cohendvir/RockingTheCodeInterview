package trees;

/**
 * Created by Dvir on 27/10/2015.
 */
public class TreeTraversals {

    public static void main(String[] args) {

        TreeNode<Integer> root = TreeNode.fromValue(1);
        TreeNode<Integer> b = TreeNode.fromValue(2);
        TreeNode<Integer> d = TreeNode.fromValue(5);

        root.setLeft(d);
        root.setRight(b);
        b.setRight(3);
        d.setLeft(4);
        d.setRight(6);

        /*preOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        postOrder(root);*/

        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        bst.add(8);
        bst.add(9);
        bst.add(6);
        bst.add(7);
        bst.add(5);
        bst.add(3);

        for (int i = 0; i < 10; i++) {
            System.out.printf("%d exists: %s%n", i, bst.exists(i));
        }
    }

    private static void postOrder(TreeNode<Integer> root) {
        if (root != null) {
            postOrder(root.getLeft());
            postOrder(root.getRight());
            System.out.print(root.getValue() + ", ");
        }
    }

    private static void inOrder(TreeNode<Integer> root) {

        if (root != null) {
            inOrder(root.getLeft());
            System.out.print(root.getValue() + ", ");
            inOrder(root.getRight());
        }
    }

    private static void preOrder(TreeNode<Integer> root) {

        if (root != null) {
            System.out.print(root.getValue() + ", ");
            preOrder(root.getLeft());
            preOrder(root.getRight());
        }
    }
}
