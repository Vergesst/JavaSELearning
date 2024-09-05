package study.guidanceOfTSUJava.Error;

class Resource implements AutoCloseable {
    void doTask(){
        System.out.println("开始执行任务");
    }

    //重写AutoClosable类中的close方法
    @Override
    public void close() throws Exception {
        System.out.println("关闭资源");
    }
}

public class test1 {
    public static void main(String[] args) {
        //try...with...resources语句能够很容易的关闭在try-catch语句中调用的资源
        //这些资源是指在程序运行结束后，必须关闭的对象。
        //也就是说，try-with-resources语句保证了每个资源在程序运行结束后都会被关闭。
        try (Resource r = new Resource()){
            //如果一个资源对象是在try-with-resources中声明的，
            // 那么AutoResources接口中的close()方法会自动执行。
            //也就是说，JVM会自动调用close()方法关闭该资源。
            r.doTask();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
