package study.guidanceOfJava11.ObjOrenProm;

//父类
class A{
    int i,j;
    void showValueOfij(){
        System.out.println("i and j:" + i + " " + j);
    }
}

//子类
class B extends A{
    int k;

    void showValueOfk(){
        System.out.println("k is:" + k);
    }
    void showSum(){
        System.out.println("i+j+k:" + (i+j+k));
    }
}
public class SimpleInheritance {
    public static void main(String[] args) {
        A superObj = new A();
        B subObj = new B();

        superObj.i = 1;
        superObj.j = 2;
        superObj.showValueOfij();

        subObj.i = 3;
        subObj.j = 4;
        subObj.k = 5;
        subObj.showValueOfij();
        subObj.showValueOfk();
        subObj.showSum();
    }
}
