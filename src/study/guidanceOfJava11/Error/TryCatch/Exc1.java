package study.guidanceOfJava11.Error.TryCatch;

//这里对Exc0类进行了修改，在其中设计了一个错误的除以零的方法
class Exc1 {

    //构造一个含有错误的方法
    static void subroutine(){
        int d = 0;
        int a = 42 / d;
    }

    public static void main(String[] args) {
        Exc1.subroutine();
    }
    //默认异常处理程序生成的堆栈踪迹会清晰的呈现整的堆栈调用过程
}
