public class OddThread extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            if(i%2 != 0)
            System.out.println("Thread_odd: " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException ie) {
                System.err.println(ie.toString());
            }
        }
    }

}
