package BS_Sever;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class severBS {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8080);
        int i = 0;
        while (true) {
            Socket socket = serverSocket.accept();
            System.out.println("=======================" + i++);
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        InputStream inputStream = socket.getInputStream();
                        byte[] bytes = new byte[1024];
                        int l = 0;
//
//                      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
//                      String firstLine = bufferedReader.readLine();
//                      System.out.println(firstLine);
//                      while ((l = inputStream.read(bytes)) != -1) {
//                          System.out.println(new String(bytes, 0, l));
//                      }
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                        String firstLine = bufferedReader.readLine();
                        System.out.println(firstLine);
                        String[] arr = firstLine.split(" ");
                        String htmlPath = arr[1].substring(1);

                        FileInputStream fileInputStream = new FileInputStream(htmlPath);
                        OutputStream outputStream = socket.getOutputStream();
                        outputStream.write("HTTP/1.1 200 OK\r\n".getBytes());
                        outputStream.write("Content-Type:text/html\r\n".getBytes());
                        outputStream.write("\r\n".getBytes());

                        int len = 0;
                        byte[] bytes1 = new byte[1024];
                        while ((len = fileInputStream.read(bytes1)) != -1) {
                            outputStream.write(bytes1, 0, len);
                        }
                        fileInputStream.close();
                        socket.close();
                    } catch (IOException e) {

                    }

                }
            }).start();
//            serverSocket.close();
        }
    }
}
