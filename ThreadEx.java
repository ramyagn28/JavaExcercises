package ex;

public class ThreadEx implements Runnable {
    public static void main(String[] args) {
        Thread t = new Thread(new ThreadEx());
        t.start();
    }
    public void run() {
        System.out.println("test");
    }
}