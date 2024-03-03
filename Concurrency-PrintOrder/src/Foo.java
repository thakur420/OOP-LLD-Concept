import java.util.concurrent.Semaphore;

public class Foo implements Runnable {
    Semaphore first;
    Semaphore second;
    public Foo() {
        first = new Semaphore(0);
        second = new Semaphore(0);

    }

    public void first(Runnable printFirst) throws InterruptedException {
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        first.release();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        // printSecond.run() outputs "second". Do not change or remove this line.
        first.acquire();
        printSecond.run();
        second.release();
    }

    public void third(Runnable printThird) throws InterruptedException {
        // printThird.run() outputs "third". Do not change or remove this line.
        second.acquire();
        printThird.run();
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        if(threadName.equals("A")){
            PrintFirst printFirst = new PrintFirst();
            try {
                first(printFirst);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        else if(threadName.equals("B")){
            PrintSecond printSecond = new PrintSecond();
            try {
                second(printSecond);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        else{
           PrintThird printThird = new PrintThird();
            try {
                third(printThird);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
