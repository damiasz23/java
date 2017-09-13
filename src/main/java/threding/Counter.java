package threding;

public class Counter {

    private long count =0;

    public long getCount() {
        return count;
    }

    public synchronized void add(int count){
        this.count += count;


    }
}
