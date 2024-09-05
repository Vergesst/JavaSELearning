package study.guidanceOfJava11.Thread;
/*
这里和之前一个程序最大的区别在于前一个是直接通过Thread类进行实例化的，
这里是通过Thread的子类NovaThread进行的实例化

注意NovaThread类中对super方法的调用，这会调用以下形式的Thread方法进行构造:
public Thread(String threadName)

 */
class NovaThread extends Thread{
    NovaThread(){
        //创建一个新的，第二个线程
        super("Demo Thread");
        System.out.println("Child thread : " + this);
    }

    public void run() {
        try {
            for(int i = 0;i < 5;i++){
                System.out.println("Child thread : " + i);
                Thread.sleep(500);
            }
        }catch (InterruptedException e){
            System.out.println("Child thread interrupted.");
        }
        System.out.println("Exiting Child thread.");
    }
}

public class ExtendThread {
    public static void main(String[] args) {
        NovaThread nt = new NovaThread();

        nt.start();

        try {
            for (int i = 0;i < 5;i++){
                System.out.println("Main thread : " + i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Exiting main thread.");
    }
}
