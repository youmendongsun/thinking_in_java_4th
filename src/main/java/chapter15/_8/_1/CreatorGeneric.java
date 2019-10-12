package chapter15._8._1;

/**
 * 使用模板方法模式实例化泛型成员变量；
 * @param <T>
 */
abstract class GenericWithCreate<T> {

    final T element;

    GenericWithCreate() {
        element = create();
    }

    abstract T create();

}

class X {}

class Creator extends GenericWithCreate<X> {

    @Override
    X create() {
        return new X();
    }

    void f() {
        System.out.println(element.getClass().getSimpleName());
    }

}

public class CreatorGeneric {

    public static void main(String[] args) {
        Creator c = new Creator();
        c.f();
    }

}
