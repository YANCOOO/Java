import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {
//    Properties集合 继承 hashtable 接口map<k,v>
//    表是一个持久的属性集 可以保存在流中或从流中加载
//    是唯一和IO流相结合的集合
//    双列集合 默认字符串

    public static void main(String[] args) {
        Properties properties = new Properties();
//把集合中的临时的数据，持久化写入到硬盘中存储
        properties.setProperty("a", "1");
        properties.setProperty("b", "2");
        properties.setProperty("c", "3");
//获取所有的key
        Set<String> set = properties.stringPropertyNames();
//        System.out.printf(String.valueOf(set));
        for (String s : set) {
//把硬盘中保存的文件（键值对） 读取到集合使用
            System.out.println(s + " = " + properties.getProperty(s));
        }
    }
}
