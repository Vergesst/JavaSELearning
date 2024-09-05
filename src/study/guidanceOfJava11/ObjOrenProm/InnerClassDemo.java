package study.guidanceOfJava11.ObjOrenProm;

class Outer{
    int outer_x = 100;

    void test(){
        Inner inner = new Inner();
        inner.display();
    }

    //and we will creat the class titled inner here
    class Inner{
        void display(){
            System.out.println("dispaly : out_x = " + outer_x);
        }
    }
}

//the main method is here
public class InnerClassDemo {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test();
    }
}
