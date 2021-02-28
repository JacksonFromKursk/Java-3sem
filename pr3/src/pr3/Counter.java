package pr3;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {
    private static final Lock lock = new ReentrantLock();
    public int count;

    public Counter() {
        count=0;
    }

    public int getCount() {
        return count;
    }

    synchronized public void plus1(){
        count++;
    }

    public void plus2(){
        lock.lock();
        count++;
        lock.unlock();
    }

}
