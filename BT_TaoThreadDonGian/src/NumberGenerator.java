public class NumberGenerator implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Thread_1: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ie) {
                System.err.println(ie.toString());
            }
        }
    }

}
