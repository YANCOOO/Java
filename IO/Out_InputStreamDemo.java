import java.io.*;

public class Out_InputStreamDemo {
    public static void main(String[] args) throws IOException {
//        转换流  charsetName：设置为GBK格式的文件 idea：默认UTF-8（不写charsetName）
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream("F:\\abc\\outstream.txt"),"GBK");
        outputStreamWriter.write("格式GBK");
        outputStreamWriter.close();

        InputStreamDemo();
    }

    private static void InputStreamDemo() throws IOException {
//        文件格式为GBK 默认格式UTF-8 乱码
//        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("F:\\abc\\outstream.txt"));
//        转换读取格式为GBK
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("F:\\abc\\outstream.txt"),"GBK");
        char[] chars = new char[1024];
        int l;
        while ((l = inputStreamReader.read(chars)) != -1){
            System.out.println(new String(chars , 0 , l));
        }
    }
}
