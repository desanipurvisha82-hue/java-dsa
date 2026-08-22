public class MyThread implements Runnable {

    private static int count = 0;

    public synchronized void increment() {
        count++;
    }

    public void run() {

        for (int i = 0; i < 1000; i++) {
            increment();
        }
    }

    public static void main(String[] args) {

        MyThread task = new MyThread();

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final count: " + count);
    }
}

// public class MyThread extends Thread  {
//     public void run()
//     {
//         System.out.println("Thread  is runiing");
//     }

//     public static void main(String[] args) {
//         MyThread t = new MyThread();
//         t.start();
//         System.out.println(t.getName());
//     }
// }
