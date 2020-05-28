package Upload_down;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientDemo1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("F:\\Client\\Music\\Andy Mineo,Lecrae - Coming In Hot.ncm");
        Socket socket = new Socket("192.168.1.104", 6428);
        OutputStream outputStream = socket.getOutputStream();
        byte[] bytes = new byte[1024];
        int l = 0;
        while ((l = fileInputStream.read(bytes)) != -1) {
            outputStream.write(bytes, 0, l);
        }
        socket.shutdownOutput();

        InputStream inputStream = socket.getInputStream();
        while ((l = inputStream.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, l));
        }

        fileInputStream.close();
        socket.close();


    }


}
