import java.util.Objects;
import java.util.function.Consumer;

public class consumerDemo {
    public static void main(String[] args) {
        String[] arr = {"A,1", "B,2", "C,3", "D,4"};
        printInfo(arr, (message) -> {
            String letter = message.split(",")[0];
            System.out.print("字母" + letter);
        }, (message) -> {
            String number = message.split(",")[1];
            System.out.println("数字" + number);
        });
    }

    public static void printInfo(String[] arr, Consumer<String> consumer1, Consumer<String> consumer2) {
        for (String message : arr) {
//            andThen 源码
//            default Consumer<T> andThen(Consumer<? super T> after) {
//                Objects.requireNonNull(after);
//                return (T t) -> { accept(t); after.accept(t); };
//            }
            consumer1.andThen(consumer2).accept(message);
        }

    }
}
