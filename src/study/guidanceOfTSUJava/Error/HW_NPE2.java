package study.guidanceOfTSUJava.Error;



public class HW_NPE2 {
    class CarKey{
    public void show(){
        System.out.println("车门已开");
    }
}
    public static void ex(CarKey carKey) throws NullPointerException{
        carKey.show();
    }

    public static void main(String[] args) {
        try {
            CarKey ck = null;
            ex(ck);
        } catch (NullPointerException e){
            System.out.println("引用所指向的对象为空！");
        }
    }
}
