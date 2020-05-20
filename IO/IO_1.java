import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO_1 {
    public static void main(String[] args) throws IOException {
//        FileOutputStream file = new FileOutputStream("F:\\abc\\IO.txt");
//        file.write(97);

//        //追加写.txt
//        FileOutputStream file = new FileOutputStream("F:\\abc\\IO.txt",true);
//        for(int i = 0 ; i<=10; i++) {
//            file.write("测试".getBytes());
//        //换行
//            file.write("\r\n".getBytes());
//        }
//        file.close();

        //FileInputStream 数据读取流
//        java->jvm->os->os读取数据方法
//        FileInputStream fileInputStream = new FileInputStream("F:\\abc\\IO.txt");
////        读取文件一个字节,读到结尾返回-1,read读完当前字节，指针指向下一个字节
//        int a = 0;
//        while((a = fileInputStream.read()) != -1){
//            System.out.println(a);
//        }
//
//        fileInputStream.close();

//        String类的方法
//        1.Strimg(byte[] bytes):把字节数组转换为字符串
//        1.Strimg(byte[] bytes,int offset , int length): offset:数组开始的索引,length:转换的字节个数

//        字节流读取多个
//        .read(byte[] byte) 从输出流读取一定量的字节，存储在缓冲区数组byte
//        byte[]作用:缓冲每次读取的字节,1024（1kb）  返回值:每次读取到的有效个数 末尾-1

        FileInputStream fileInputStream = new FileInputStream("F:\\abc\\IO.txt");

        byte[] bytes = new byte[1024];
        int l = 0;
        while ((l = fileInputStream.read(bytes)) != -1) {
//            System.out.println(new String(bytes));
            System.out.println(new String(bytes, 0, l));
        }
        fileInputStream.close();
    }
}