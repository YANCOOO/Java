import java.io.Serializable;

public class People implements Serializable {
    private String name;
//    transient关键字 使修饰的对象不可序列化
//    static关键字 也可以使修饰的对象不可序列化 但是静态优先于非静态加载到内存
//    private transient int age;
//    serialVersionUID 自定义序列号 使用默认序列号当对象属性改变 报错
    private static final long serialVersionUID = 1L;
    private  int age;

    public People() {
    }

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
