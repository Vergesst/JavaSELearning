/*
Java运行时系统在许多方面依赖于线程，并且所有类库在设计时都考虑了多线程。
事实上，Java通过利用多线程使得整个环境能异步执行，这有助于防止浪费CPU时钟周期来提高效率。
通过和单线程环境比较，可以更好的理解多线程环境的价值。单线程系统使用一种被称为轮询事件循环的方法。
在这种模型中，单线程在一个无限循环的控制中运行，轮询一个事件队列决定下一步做什么。一旦轮询返回一个信号，比如准备读取网络文件的信号
事件循环就将控制调度至适当的事件处理程序。在这个事件处理程序返回之前，程序不能进行其他任何工作。
这浪费了CPU时间，并且会导致程序的一部分支配着系统而组织对其他所有部分进行处理。
通常，在单线程环境中，当线程因为等待某些资源而阻塞（即挂起执行）时，整个程序会停止运行。
Java的多线程的优点消除了主循环/轮询机制，可以攒同一个线程而不会停止程序的其他部分。例如，
由于线程从网络读取数据或者等待用户输入造成的空余时间，可以在其他地方得到利用。多线程允许当前激活的循环在两帧之间休眠，而不会造成整个系统的暂停。
当Java中的线程阻塞时，只有阻塞的线程会被暂停，所有其他线程都会继续运行。
 */
package study.guidanceOfJava11.Thread;

//操控主线程
//所有子线程都是从主线程产生的
//通常，主线程都是最后才执行的线程，因为它要执行各种关闭工作
public class CurrentThreadDemo {
    public static void main(String[] args) {
        //通过currentThread()方法获取对主线程的一个引用
        //该方法是Thread类的公有静态成员，一般形式如下：
        //static thread currentThread()
        Thread t =  Thread.currentThread();

        System.out.println("Current thread:" + t);

        //调用现成的引用进行对线程的修改，例如使用setName()方法对现成的名称进行修改
        t.setName("My Thread");

        //显示现成的信息
        //例如名称，优先级，所属的线程组("main")
        System.out.println("After name change:" + t);

        //Thread类中的sleep()方法会导致InterruptedException异常，
        //如果其他线程试图中断这个正在睡眠的线程
        //就会发生这种情况
        try {
            for(int n = 5; n > 0; n--){
                //这里是一个从5开始递减的循环，两次循环之间间隔一秒，
                //暂停是通过sleep()方法实现的
                System.out.println(n);
                //使用sleep()方法让线程暂停，方法中传入的参数以毫秒计算
                //即此时主线程会休眠一秒钟
                Thread.sleep(1000);
            }
        } catch (InterruptedException e){
            System.out.println("Main thread interrupted");
        }
    }
}
