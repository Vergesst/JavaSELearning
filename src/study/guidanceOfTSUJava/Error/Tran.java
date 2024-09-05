package study.guidanceOfTSUJava.Error;

class MyException extends Exception{
    public MyException(String ErrorMessage){
        //父类构造方法（？）
        super(ErrorMessage);
    }
}

public class Tran {

    //定义方法，抛出错误
    //此处使用throws关键字指定将要抛出的错误
    static int avg(int num1, int num2) throws MException {

        //根据定义的错误的先后进行判断
        if (num1 > 100||num2 > 100){
            throw new MException("数据太大了");
        }
        if (num1 < 0||num2 < 0){
            throw new MException("不可以使用负数");
        }
        //方法返回结果
        return (num1 + num2)/2;
    }

    public static void main(String[] args) {
        try {
            int result = avg(102, -50);
            System.out.println(result);
        } catch (MException e){

            //由于此时先定义的错误是数据是否越界，于是会显示数据过大的错误
            System.out.println(e);
        }
    }
}
