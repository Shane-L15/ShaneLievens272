import java.util.ArrayList;
import java.util.*;

public class MaxHeap<E extends Comparable<E>> extends ArrayList<E> {

    ArrayList<E> H1;

    // construct an empty Heap using ArrayList
    // with root at index 0.
    // don't use binary tree for implementing the heap.
    public MaxHeap(){

        H1 = new ArrayList<E>();

    }
    // returns max value
    public E findMax() {
        int max = H1.get(0);

        for (int i = 0; i < H1.size(); i++) {
            if (max < H1.get(i)) {
                max = H1.get(i);
            }
        }

    }

    // adds a new value to the heap at the end of the Heap and
    // adjusts values up to the root to ensure Max heap property is satisfied.
    // parent of node at i is given by the formula (i-1)/2
    // throw appropriate exception
    public void addHeap(E val) {

        this.H1.add(val);
        this.siftUp(this.H1.size()-1);
    }

    public void siftUp(int NI) {
        E temp = this.H1.get(NI);
        while (NI >0 && temp.compareTo(this.H1.get((int)Math.floor(NI-1)/2)>0)) {
            this.H1.set(NI, this.H1.get((int)Math.floor((NI-1)/2)));
            NI = (int)Math.floor((NI-1)/2);
        }
        this.H1.set(NI, temp);
    }

    //returns the max value at the root of the heap by swapping the last value
    // and percolating the value down from the root to preserve max heap property
    // children of node at i are given by the formula 2i+1,2i+2, to not exceed the
    // bounds of the Heap index, namely, 0 ... size()-1.
    // throw appropriate exception
    public E removeHeap() {

        if (!this.H1.isEmpty()) {

            E temp;
            E res;
            temp = this.H1.get(0);
            this.H1.set(0, this.H1.get(this.H1.size()-1));
            this.H1.set(this.H1.size()-1, temp);
            res = this.H1.remove(this.H1.size()-1);
            siftDown(0);

            return res;

        }
        else return null;

    }

    public void siftDown(int NIx) {

        int LCI = NIx*2 +1;
        int RCI = NIx*2+2;
        int size = this.H1.size();
        int max;

        if (RCI >= size) {
            if (LCI >= size) {
                return;

            }
            else {
                max = LCI;
            }
        }
        else {
            if (this.H1.get(LCI).compareTo(this.H1.get(RCI)) > 0) {
                max = RCI;
            }
            else max = RCI;
        }
    }

    // takes a list of items E and builds the heap and then prints
    // decreasing values of E with calls to removeHeap().
    public void heapSort(List<E> list){

    }

    // merges the other maxheap with this maxheap to produce a new maxHeap.
    public void heapMerge(MaxHeap<E> other){

    }

    //takes a list of items E and builds the heap by calls to addHeap(..)
    public void buildHeap(List<E> list) {

    }


}