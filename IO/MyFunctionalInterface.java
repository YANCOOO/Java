//函数式接口：有且只有一个抽象方法 称为函数接口
//
//@FunctionalInterface注解
//作用：可以检测接口是否是一个函数接口
//    是 编译成功
//    否 编译失败

@FunctionalInterface
public interface MyFunctionalInterface {
    public abstract void  method();
}

