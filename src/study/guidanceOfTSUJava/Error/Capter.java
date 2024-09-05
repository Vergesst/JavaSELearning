package study.guidanceOfTSUJava.Error;

class MException extends Exception{
    //定义属性message
    String message;
    //父类方法
    public MException(String ErrorMessage){
        message = ErrorMessage;
    }

    //覆盖get方法
    public String getMessage(){
        return message;
    }
}

public class Capter {
    static int quotient(int x, int y) throws MException{
        if(y < 0){
            throw new MException("除数不能是负数");
        }
        return x/y;
    }
    public static void main(String[] args) {
        try{
            int result = quotient(3,-1);
            System.out.println(result);
        }catch (MException e){
            System.out.println(e.getMessage());
        }catch (ArithmeticException e){
            System.out.println(e);
        }catch (Exception e){
            System.out.println("发生了其他异常");
        }finally {
            System.out.println("程序结束运行...");
        }
    }
}
