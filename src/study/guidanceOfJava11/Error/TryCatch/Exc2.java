package study.guidanceOfJava11.Error.TryCatch;

public class Exc2 {
    public static void main(String[] args) {
        int a,d;

        try{
            //这里使用try来监视一段语句
            d = 0;
            a = 42 / d;
            System.out.println("This will never be printed...");
        }catch(ArithmeticException e){
            //捕捉ArithmeticException错误
            System.out.println("Division by zero");
        }
        System.out.println("After catch statement.");
    }
    //此处try语句中的println()永远不会执行，一旦抛出异常，程序控制就会从try转向catch语句
    // 换句话说，这里不是调用catch语句，所以永远不会回到try语句中去。
    //try块和catch块构成了一个单元。大部分设计良好的catch语句块都能及时的分辨出异常情况，然后继续执行，好像错误根本没发生过一样。
    //就像后面的Exc3.java
}
