package study.guidanceOfTSUJava.Str;

public class StrCreate {
    public static void main(String[] args) {

        char a[] = {'H','o','l','i',' ','S','h','i','t'};
        //String的构造方法1 String(char a[])
        String str1 = new String(a);
        //String的构造方法2 String(char a[], int offset, int length),offset代表起始位置
        String str2 = new String(a,5,4);

//使用符号+可以合并字符串，在后面的sout语句中的+号用来合并被视作字符串的char和前后两个字符串
        System.out.println(str1 + ' ' +str2);
    }
}