import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class AcceptDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket socket = new ServerSocket(6003);
        Socket socket1 = socket.accept();
        InputStream inputStream = socket1.getInputStream();
        byte[] bytes = new byte[1024];
        int l = inputStream.read(bytes);
        System.out.println(new String(bytes, 0, l));
        socket.close();
    }
}
