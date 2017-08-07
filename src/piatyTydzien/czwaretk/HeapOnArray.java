package piatyTydzien.czwaretk;

/**
 * Created by olaIdamian on 8/7/2017.
 */
public class HeapOnArray {
    private int[] heap;
    private int counter = 0;

    public HeapOnArray(int size) {
        this.heap = new int[size];
    }

    public void push(int el)
    {
        this.heap[this.counter] = el;
        this.counter++;
    }

    public int pop()
    {

        this.counter--;
        return this.heap[this.counter];

    }
}