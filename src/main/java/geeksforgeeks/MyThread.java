package geeksforgeeks;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread is running....");
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}

class RunnableClass implements Runnable{

    @Override
    public void run() {
        System.out.println("Runnable is running");
    }

    public static void main(String[] args) {
        RunnableClass runnableClass = new RunnableClass();
        Thread thread = new Thread(runnableClass, "MyThread");

        thread.start();
        System.out.println("Run by : "+ thread.getName());
    }
}
