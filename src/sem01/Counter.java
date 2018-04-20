package sem01;

/**
 * Created by romy on 13.04.2018.
 */
public class Counter {

    private int counter;

    public Counter() {
        this.counter = 0;
    }

    public void inc() {
        counter++;
    }

    public int getCounter() {
        return counter;
    }
}
