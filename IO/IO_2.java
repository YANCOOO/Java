import java.io.*;

public class IO_2 {
    //文件复制
    public static void main(String[] args) throws IOException {
//        FileInputStream fileInputStream = new FileInputStream("F:\\abc\\IO.txt");
//        FileOutputStream fileOutputStream = new FileOutputStream("F:\\abc\\IO2.txt");
//        FileOutputStream fileOutputStream1 = new FileOutputStream("F:\\abc\\IO3.txt");

//        单字节复制
//        int l = 0;
//
//        while ((l = fileInputStream.read()) != -1) {
//            fileOutputStream.write(l);
//        }

        /*------------------------------------------------------*/
//        long a = System.currentTimeMillis();
//        多字节复制,数组缓冲
//        byte[] bytes = new byte[1024];
//
//        while ((fileInputStream.read(bytes) != -1)) {
//            fileOutputStream1.write(bytes);
//        }
//        fileOutputStream1.close();
//        fileInputStream.close();
//        long b = System.currentTimeMillis();
        /*------------------------------------------------------*/


//        字符流FileReader / FileWrite
        FileReader fileReader = new FileReader("F:\\abc\\IO.txt");
        char[] a = new char[1024];
        int l = 0;
        while ((l = fileReader.read(a)) != -1) {
            System.out.println(new String(a, 0, l));

        }
        fileReader.close();

    }


}
