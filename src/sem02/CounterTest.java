package sem02;

/**
 * Created by romy on 13.04.2018.
 */
public class CounterTest {
    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        Thread[] thread = new Thread[100];
        Counter counter = new Counter();
        for (int i=0; i<thread.length; i++) {
            thread[i] = new Thread(new Runnable() {
                // anonyme innere Klasse (bis Ende geschweifte Klammer)
                // alternativ: new Hello(message)
                @Override
                public void run() {
                    for (int j=0; j<100; j++) {
                        counter.inc();
                    }

                }
            });
        }

        for (int i=0; i<thread.length; i++) {
            thread[i].start();
            // thread läuft los; Methodenaufruf kehrt sofort zurück
        }

        for (int i=0; i<thread.length; i++) {
            thread[i].join();
            // wartet auf die Termination von Thread i.
        }

        long diff = System.currentTimeMillis() - start;
        System.out.println(counter.getCounter());
        System.out.println(diff);
    }
}
