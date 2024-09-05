package study.guidanceOfTSUJava.Str;

import java.util.Date;

public class dateFormat {
    public static void main(String[] args) {
        String[] s = new String[11];
        Date date = new Date();
        //字符串的格式化：得到日期
        s[0] = String.format("%te", date);
        //月份简称
        s[1] = String.format("%tb", date);
        //指定语言环境的月份全称
        s[2] = String.format("%tB", date);
        //指定语言环境的星期全称
        s[3] = String.format("%tA", date);
        //指定语言环境中的星期简称
        s[4] = String.format("%ta", date);
        //包括全部日期和时间信息
        s[5] = String.format("%tc", date);
        //年份
        s[6] = String.format("%ty", date);
        //两位的年份
        s[7] = String.format("%tY", date);
        //一年中的第几天
        s[8] = String.format("%tj", date);
        //月份
        s[9] = String.format("%tm", date);
        //一个月中的第几天
        s[10] = String.format("%td", date);

        for (int i = 0;i < 11;i++){
            System.out.println(s[i]);
        }
    }
}