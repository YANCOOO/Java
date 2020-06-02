import java.util.function.Supplier;

public class supplierDemo {
//    生产型接口
//    用来获取一个泛型参数指定类型的对象数据
    public static <T> T getT(Supplier<T> sup) {
        return sup.get();
    }

    public static void main(String[] args) {
        String s = getT(() -> {
            return "lambda";
        });
        System.out.println(s);

        int inter = getT(() -> {
            return 6;
        });
        System.out.println(inter);

        boolean boo = getT(()->true);
        if(boo){
            System.out.println("true");
        }
    }
}
