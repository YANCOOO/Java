import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SeverDemo {
    //    创建服务端对象
//    使用SeverSocke 中的getOutputStream()获取网络字节输出流OutputStream对象
//    使用read方法，读取客户器信息
//    getInputStream()获取网络字节输出流InputStream对象
//    使用write方法，向客户器发送信息
//    释放资源
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(6428);
        Socket socket = serverSocket.accept();
        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int l = inputStream.read(bytes);
        System.out.println(new String(bytes, 0, l));
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("这是服务端".getBytes());
        socket.close();
        serverSocket.close();
    }
}
