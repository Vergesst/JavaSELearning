package study.guidanceOfJava11.Error.TryCatch;
/*This program contains an error

A subclass must come before its superclass in a series of
catch statements. If not, an un reachable code will
be created and a compile-time error will result
 */
public class SuperSubCatch {
    public static void main(String[] args) {
        try{
            int a = 0;
            int b = 42 / a;
        }
//        catch(Exception e){
//            System.out.println("Generic Exception catch.");
//        }
        //The above catch will never be approached because ArithmeticException is
        //the subclass of exception
        catch (ArithmeticException e){
            System.out.println("This is never approached.");
        }
    }
}
