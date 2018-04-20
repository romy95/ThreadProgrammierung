package sem01;

import java.lang.Thread;

class ThreadTest {
    public static void main(String[] args) throws InterruptedException {
        Thread[] thread = new Thread[8];
        for (int i=0; i<thread.length; i++) {
            final String message = "Hello from thread " +i;
            thread[i] = new Thread(new Runnable() {
                // anonyme innere Klasse (bis Ende geschweifte Klammer)
                // alternativ: new Hello(message)
                @Override
                public void run() {
                    for (int j=0; j<message.length(); j++) {
                        System.out.print(message.charAt(j));
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
    }
}