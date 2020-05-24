import java.io.*;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo2 {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.setProperty("一", "1");
        properties.setProperty("二", "2");
        properties.setProperty("三", "3");

        FileWriter fileWriter = new FileWriter("F:\\abc\\prop.txt");

//        创建字符流(可以中文) 目的地：fileWriter 备注：save data
//        字节流不可以中文
        properties.store(fileWriter, "save data");
//匿名内部类不用关流
//        properties.store(new FileOutputStream("F:\\abc\\prop.txt"),"save data");
        fileWriter.close();

        prop();
    }

//    .load读取集合使用
    public static void prop() throws IOException {
        Properties properties1 = new Properties();
        properties1.load(new FileReader("F:\\abc\\prop.txt"));
        Set<String> prop = properties1.stringPropertyNames();
        for (String k : prop) {
            System.out.println(k + " = " + properties1.getProperty(k));
        }
    }
}
