package study.guidanceOfJava11.Thread;

//创建一个新线程
class NewThread implements Runnable{

    Thread t;

    NewThread(){
        t = new Thread(this, "Demo Thread");
        System.out.println("Child thread: " + t);
    }

    @Override
    //这是第二个线程的入口
    public void run() {
        try{
            for(int i = 5;i > 0;i--){
                System.out.println("Child Thread: " + i);
                Thread.sleep(500);
            }
        }catch (InterruptedException e){
            System.out.println("Child Interrupted.");
        }
        System.out.println("Exiting child thread.");
    }
}

class ThreadDemo{
    public static void main(String[] args) {
        //创建一个新线程
        NewThread nt = new NewThread();

        //开始这个线程
        nt.t.start();

        try {
            for(int i = 5;i > 0;i--){
                System.out.println("Main Thread: " + i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Main thread exiting.");
    }
}
