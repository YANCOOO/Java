import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientDemo {
//    创建客户端对象
//    使用Socket 中的getOutputStream()获取网络字节输出流OutputStream对象
//    使用write方法，向服务器发送信息
//    getInputStream()获取网络字节输出流InputStream对象
//    使用read方法，读取服务器信息
//    释放资源

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("192.168.1.103", 6428);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("这是客户端".getBytes());
        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int l = inputStream.read(bytes);
        System.out.println(new String(bytes, 0, l));
        socket.close();
    }

}
