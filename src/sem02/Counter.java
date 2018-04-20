package sem02;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by romy on 13.04.2018.
 */
public class Counter {

    private int counter;
    private static Lock lock = new ReentrantLock();

    public Counter() {
        this.counter = 0;
    }

    public void inc() {
        lock.lock();
        try {
            counter++;
        } finally {
            lock.unlock();
        }
    }

    public int getCounter() {
        return counter;
    }
}
