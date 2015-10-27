package trees;

import java.util.Iterator;

/**
 * Created by Dvir on 27/10/2015.
 */
public class TreeNode<V> implements Iterable {
    private V value;
    private TreeNode<V> right;
    private TreeNode<V> left;

    public static <V> TreeNode<V> fromValue(V value) {
        return new TreeNode<>(value);
    }

    public TreeNode(V value) {
        this.value = value;
    }

    public TreeNode<V> getLeft() {
        return left;
    }

    public void setLeft(V value) {
        this.left = new TreeNode<V>(value);
    }

    public void setLeft(TreeNode<V> node) {
        this.left = node;
    }

    public TreeNode<V> getRight() {
        return right;
    }

    public void setRight(V value) {
        this.right = new TreeNode<V>(value);
    }

    public void setRight(TreeNode<V> right) {
        this.right = right;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }


    @Override
    public Iterator iterator() {
        return null;
    }
}
