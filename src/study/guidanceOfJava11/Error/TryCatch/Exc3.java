package study.guidanceOfJava11.Error.TryCatch;

import java.util.Random;

//Handle an exception and move on
public class Exc3 {
    public static void main(String[] args) {
        int a = 0,b = 0,c = 0;
        Random r = new Random();

        for (int i = 0;i < 32000;i++){
            try{
                b = r.nextInt();
                c = r.nextInt();
                a = 12345/(b/c);
            }catch (ArithmeticException e){
                System.out.println("Exception: " + e);
                System.out.println("Division by zero.");
                //将a设为0然后继续
                a = 0;
            }
            System.out.println("a:" + a);
        }
        //We can see that the program continues to run after finding the exception
    }
}