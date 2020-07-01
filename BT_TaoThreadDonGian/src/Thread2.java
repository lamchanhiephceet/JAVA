public class Thread2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 9; i++) {
            System.out.println("Thread_2: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ie) {
                System.err.println(ie.toString());
            }
        }
    }

}
