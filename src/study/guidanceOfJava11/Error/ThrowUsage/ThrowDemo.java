package study.guidanceOfJava11.Error.ThrowUsage;

//显示抛出异常
public class ThrowDemo {
    static void demoproc() {
        // throw语句一般处理非检查性异常，即一般不由编译器检查的异常
        // 比如NullPointerException和ClassCastException是常见的非检查性异常
        // 检查性异常一般由try catch语句或者throws关键字进行处理，
        // 否则编译器会报错；非检查性异常一般由代码写的不够严谨造成，一般可以规避
        // 所有的非检查性异常都继承自 java.lang.RuntimeException
        try {
            // 创建一个异常的实例，并且使用throw关键字抛出这个实例
            throw new NullPointerException("demo");
        } catch (NullPointerException e) {
            System.out.println("Caught inside demoproc.");
            // rethrow the expression.
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            demoproc();
        } catch (NullPointerException e) {
            System.out.println("Recaught: " + e);
        }
    }
}
