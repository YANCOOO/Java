import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferDemo2 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("F:\\abc\\buffer.txt"));
        String buf;
//        .readline 每次读取一行
        while ((buf = bufferedReader.readLine()) != null) {
            System.out.println(buf);
        }
        bufferedReader.close();
    }
}
