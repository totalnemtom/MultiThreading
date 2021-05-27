package multithreading;

class Tasker extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Other thread: " + i);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {

            }
        }
    }
}

public class MultiThreading {
    public static void main(String[] args) {
        Tasker run1 = new Tasker();
        run1.start();
        Tasker run2 = new Tasker();
        run2.start();
    }
}
