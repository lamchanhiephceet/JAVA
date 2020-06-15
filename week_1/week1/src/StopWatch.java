import java.time.LocalTime;
public class StopWatch {
    private LocalTime startTime;
    private LocalTime endTime;

    public LocalTime getStartTime(LocalTime startTime) {
        return startTime;
    }
    public LocalTime getEndTime(LocalTime endTime) {
        return endTime;
    }
    StopWatch() {
        startTime = LocalTime.now();
    }
    public void start() {
        this.startTime = LocalTime.now();
        getStartTime(startTime);
    }
    public void stop() {
        this.endTime = LocalTime.now();
        getEndTime(endTime);
    }
    public void getElapsedTime() {
        int ElapsedTime = ((endTime.getHour()-startTime.getHour())*3600000 + (endTime.getMinute()-startTime.getMinute())*60000 + (endTime.getSecond()-startTime.getSecond())*1000);
        System.out.println("So mili giay dem duoc: " +ElapsedTime);
    }

    public static int[] selectionSort(int...a) {
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++) {
                if(a[j]<a[i]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int []a = new int [100000];
        for (int i = 0; i < 100000; i++) {
            a[i]=(int)Math.floor(Math.random()*100000);
        }

        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        System.out.println("Dang dem thoi gian...");
        a = selectionSort(a);
        for(int x : a) {
            System.out.println(x);
        }
            stopWatch.stop();
            stopWatch.getElapsedTime();
    }
}
