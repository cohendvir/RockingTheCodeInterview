package tests;

/**
 * Created by Dvir on 02/11/2015.
 */
public class SyncTest {

    public synchronized void test1() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("test1()");
    }

    public void test2() {
        synchronized (this) {
            System.out.println("test2()");
        }
    }

    public static void main(String[] args) {
        final SyncTest syncTest = new SyncTest();

        new Thread(new Runnable() {
            @Override
            public void run() {
                syncTest.test1();
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                syncTest.test2();
            }
        }).start();

    }
}
