package Upload_down;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class SeverDemo1 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(6428);
        while (true) {
            Socket socket = serverSocket.accept();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        File file = new File("F:\\Sever\\Music");
                        String MName = System.currentTimeMillis() + new Random().nextInt(99999) + ".ncm";
                        InputStream inputStream = socket.getInputStream();
                        byte[] bytes = new byte[1024];
                        int l = 0;
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        FileOutputStream fileOutputStream = new FileOutputStream(file + "\\" + MName);
                        while ((l = inputStream.read(bytes)) != -1) {
                            fileOutputStream.write(bytes, 0, l);
                        }
                        socket.getOutputStream().write("Sever Get".getBytes());
                        socket.shutdownOutput();

                        fileOutputStream.close();
                    } catch (IOException io) {
                        System.out.println("服务器异常");
                    }
                }
            }).start();
        }

//        serverSocket.close();

    }
}
