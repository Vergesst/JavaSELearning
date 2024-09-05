package study.guidanceOfTSUJava.Str;

public class InfOfStr {
    public static void main(String[] args) {
        int a[] = new int[10];

        String str1 = "We are students";
        //indexOf(substr) 方法用于返回字符串s在指定字符串中首次出现的位置
        a[0] = (char) str1.indexOf('a');
        //该方法用于返回指定字符串最后一次出现的位置，若未找到指定字符串，则返回-1
        //值得注意的是，若传入的是""(中间没有空格)，则返回字符串的长度
        a[1] = (char) str1.lastIndexOf('s');
        //使用charAt方法获取指定位置处的字符
        char ch = str1.charAt(5);

        for(int i = 0;i < 10;i++){
            System.out.println(a[i]);
        }
        System.out.println(ch);
    }
}
