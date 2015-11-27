package trees;

import sun.reflect.generics.tree.Tree;

/**
 * Created by Dvir on 27/10/2015.
 */
public class BinarySearchTree<V extends Comparable> {

    private TreeNode<V> root;

    public TreeNode<V> getRoot() {
        return root;
    }

    public void add(V value) {
        if (value != null) {
            if (root == null) {
                root = TreeNode.fromValue(value);
            } else {
                add(root, TreeNode.fromValue(value));
            }
        }
    }

    private void add(TreeNode<V> subtree, TreeNode<V> value) {
        int res = value.getValue().compareTo(subtree.getValue());

        // Smaller or equal to root, traverse left tree
        if (res < 1) {

            if (subtree.getLeft() == null) {
                subtree.setLeft(value);
            } else {
                add(subtree.getLeft(), value);
            }
        }
        // Greater than root, travers right
        else {
            if (subtree.getRight() == null) {
                subtree.setRight(value);
            } else {
                add(subtree.getRight(), value);
            }
        }
    }

    public boolean exists(V value) {

        if (root == null) {
            return false;
        }

        return exists(root, value);
    }

    private boolean exists(TreeNode<V> subtree, V value) {

        if (subtree.getValue().equals(value)) {
            return true;
        }

        if (subtree.getLeft() == null && subtree.getRight() == null) {
            return false;
        }

        int res = value.compareTo(subtree.getValue());

        if (res < 1) {
            return exists(subtree.getLeft(), value);
        }
        else {
            return exists(subtree.getRight(), value);
        }
    }
}
