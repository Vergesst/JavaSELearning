package study.guidanceOfJava11.Error.TryCatch;

class Exc0 {
    public static void main(String[] args) {
        int d = 0;
        int a = 42 / d;
    }
    //由于在程序中出现了除以0这种不合法的语句，Java会抛出错误，并将错误包含到堆栈踪迹中
    //此外仍需注意：异常的类型是 Exception的子类ArithmeticException，这样就能更加具体的描述错误出现的类型
    // Java提供了比较丰富的内置异常类型，和可能生成的各种错误类型相匹配
}
