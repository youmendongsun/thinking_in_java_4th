package chapter15._8._1;

interface FactoryI<T> {
    T create();
}

class Foo2<T> {

    private T x;

    public <F extends FactoryI<T>> Foo2(F factory) {
        x = factory.create();
    }

}

/**
 * 相较于Class是Java中的内建工厂对象，通过创建显示的工厂对象，
 * 获得编译期检查。
 */
class IntegerFactory implements FactoryI<Integer> {

    @Override
    public Integer create() {
        return new Integer(0);
    }

}

class Widget {

    public static class Factory implements FactoryI<Widget> {
        @Override
        public Widget create() {
            return new Widget();
        }
    }

}

public class FactoryConstraint {

    public static void main(String[] args) {
        new Foo2<Integer>(new IntegerFactory());
        new Foo2<Widget>(new Widget.Factory());
    }

}
