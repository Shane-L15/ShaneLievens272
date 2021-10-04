import java.util.*;

public class BinarySearchTree<E extends Comparable<E>> extends BinaryTree<E> {

    private BinaryTree<E> bt;

    public BinarySearchTree() {

        int x;

    }
    public BinarySearchTree(E val) {

        bt = new BinaryTree(val);

    }

    // returns true if BST has val else false.
    public boolean contains (E val) {

        Node<E> first = bt.root;
        if (first == null) {
            return false;
        }
        while (first != null) {
            if (first.getInfo().compareTo(val) != 0) {
                if (first.getInfo().comparesTo(val) < 0) {
                    first = first.getLeft();
                }
                if (first.getInfo().comparesTo(val) > 0) {
                    first = first.getRight();
                }
            }
            if (first.getInfo().compareTo(val) == 0) {
                return true;
            }
    }
    // inserts val at the right place satisfying search tree properties, should handle if the tree is empty
// if value is already there then donâ€™t insert it again
    public void insert(E val) {

            BinaryTree<E> bt2 = new BinaryTree<>(val);
            Node<E> first = bt2.root;
            Node<E> temp = null;

            if (first == null) {
                bt2 = new BinaryTree<E>(val);
            }
            else if (val.CompareTo(first.info) < 0) {
                bt2.addLeft(first.left, val);
            }
            else if (val.CompareTo(first.info) > 0) {
                bt2.addRight(first.right, val);
            }
            else return;
        }
    }

    // returns the minimum value stored in the tree
    public E findMin() {

        Node<E> first = bt.root;
        first = first.getLeft();

        while (first != null) {
            if (val.compareTo(first.info) < 0) {
                first = first.getLeft();
            }
        }
        return first.getInfo();
    }

    // returns the maximum value stored in the tree
    public E findMax() {

        Node<E> first = bt.root;
        first = first.getRight();

        while (first != null) {
            if (val.compareTo(first.info) > 0) {
                first = first.getRight();
            }
        }
        return first.getInfo();
    }

    public static void main(String[] args) {
        BinarySearchTree<Integer> bt= new BinarySearchTree<>();
        bt.insert(5);
        bt.insert(10);
        bt.insert(3);
        bt.insert(20);
        bt.insert(8);
        bt.insert(4);
    }


}
