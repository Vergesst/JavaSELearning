package study.guidanceOfJava11.Thread;

class RenoThread implements Runnable{
    String name;
    Thread t;

    RenoThread(String threadname){
        name = threadname;
        t = new Thread(this, name);
        System.out.println("New thread : " + t);
    }

    //这是线程的入口
    @Override
    public void run() {
        try {
            for (int i = 5;i > 0;i--){
                System.out.println(name + i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println("Thread interrupted : " + e);
        }
        System.out.println(name + " : Exiting");
    }
}

public class MultiThreadDemo {
    public static void main(String[] args) {
        RenoThread t1 = new RenoThread("First");
        RenoThread t2 = new RenoThread("Second");
        RenoThread t3 = new RenoThread("Third");

        //开始所有线程的生命周期
        //这里需要通过RenoThread中内含的Thread对象间接调用start()方法（哭死）
        t1.t.start();
        t2.t.start();
        t3.t.start();

        try {
            //等待其他线程结束
            Thread.sleep(10000);
        }catch (InterruptedException e){
            System.out.println("Main Thread Interrupted.");
        }
        System.out.println("Main Thread Exiting.");
    }
}
