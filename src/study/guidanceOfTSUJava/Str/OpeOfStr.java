package study.guidanceOfTSUJava.Str;

public class OpeOfStr {
    public static void main(String[] args) {
        String str = "Zhuni huogai,diyu wei ni kai";
        //该方法用于返回指定起点直至末尾的字串
        String substr1 = str.substring(6);
        //获得结果查看效果
        System.out.println(substr1);

        //该方法用于获取指定开头和结尾的字串
        String substr2 = str.substring(0,5);

        //该方法用于字符串中空格的去除
        String str1 = str.trim();
        //该方法可用于替换字符串，语法为str.replace(CharSequence target, CharSequence replacement)
        String str2 = str.replace('i', 'v');

        //startsWith()和endsWith()方法，返回布尔值，用于判断字符串是否以目标字符串开始或结尾
        boolean bol1 = str.startsWith("Zhu");
        boolean bol2 = str.endsWith("ni");

        //判断两个字符串是否相等：equals()方法和equalIgnoreCase()方法，前者判断是否完全相等，后者判断在忽略大小写的情况下是否相等
        boolean bol3 = substr2.equalsIgnoreCase("zhuni");

        //比较字符串在字典中的先后位置
        String str3 = "b";
        String str4 = "c";
        String str5 = "a";
        System.out.println("3 compareTo 4 :" + str3.compareTo(str4));
        System.out.println("3 compareTo 5 :" + str3.compareTo(str5));

        //toUpperCase/toLowerCase方法，将字符串中的字符全部转化成大写或小写

    }
}
