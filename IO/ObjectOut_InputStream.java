import java.io.*;

public class ObjectOut_InputStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        序列化流 可以传递对象
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("F:\\abc\\ObjectOutput.txt"));
//        People 接口Serializable （标记型接口） 不标记报错
        outputStream.writeObject(new People("Blaze",20));
        outputStream.close();

        InputStreamDemo();
    }
//        反序列化 获取文件中对象
//        ClassNotFoundException（当文件不存在异常）
    private static void InputStreamDemo() throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("F:\\abc\\ObjectOutput.txt"));
//       所有对象父类是object
        Object people = objectInputStream.readObject();
        objectInputStream.close();
//       People中重写toString
        System.out.println(people);
    }

}
