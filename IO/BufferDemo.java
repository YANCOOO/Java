import java.io.*;

public class BufferDemo {

    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("F:\\abc\\buffer.txt");
//把数据写入缓存区 再传递 提高效率 字节缓存输出流
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        bufferedOutputStream.write("abc".getBytes());
//必须flush 把缓存区刷新到文件中
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
        buff();

    }

    //字节缓存输出流
    public static void buff() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("F:\\abc\\buffer.txt");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        int buf = 0;
//        while ((buf = bufferedInputStream.read()) != -1) {
//            System.out.println(buf);
//        }
        byte[] bytes = new byte[1024];
        while ((buf = bufferedInputStream.read(bytes)) != -1) {
            System.out.println(new String(bytes,0,buf));
        }
        bufferedInputStream.close();

    }

//    .newLine()换行
}
