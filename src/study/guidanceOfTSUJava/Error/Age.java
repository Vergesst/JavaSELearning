package study.guidanceOfTSUJava.Error;
//注意  printStackTrace
import java.util.Scanner;

public class Age {
    public static void main(String[] args) {

        //从键盘中读取字符串输入
        Scanner sc = new Scanner(System.in);

        //错误捕获和处理
        try {
            String str = sc.next();
            int age = Integer.parseInt("20L");
        }catch (Exception e){
            //printStackTrace一般适用于调试中，在实际上产中应当删去
            e.printStackTrace();
        }
    }
}
