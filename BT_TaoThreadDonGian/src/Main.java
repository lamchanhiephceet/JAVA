public class Main {
    public static void main(String[] args) {
        NumberGenerator th = new NumberGenerator();
        Thread2 th2 = new Thread2();

        Thread t1 = new Thread(th);
        Thread t2 = new Thread(th2);

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
    }
}
