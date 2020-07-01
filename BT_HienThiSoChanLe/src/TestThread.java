public class TestThread {
    public static void main(String[] args) throws InterruptedException {
        OddThread o = new OddThread();
        EvenThread e = new EvenThread();

        o.start();
        o.join();
        e.start();
        System.out.println("Main Thread Finished");

    }
}
