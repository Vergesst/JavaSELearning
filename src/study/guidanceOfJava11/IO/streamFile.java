package study.guidanceOfJava11.IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class streamFile {
    public static void main(String[] args) throws IOException {
        //创建对象
        FileOutputStream fos = new FileOutputStream("D:\\JavaSEProject\\Java01\\src\\study\\guidanceOfJava11\\IO\\a.txt");
        //写入数据
        fos.write(97);
        //释放资源
        fos.close();
    }
}

