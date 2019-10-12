package chapter15._7._1;

class Manipulator2<T extends HasF> {

    private T obj;

    public Manipulator2(T x) {
        this.obj = x;
    }

    public void manipulate() {
        obj.f();
    }

}

public class Manipulation2 {

    public static void main(String[] args) {
        HasF hf = new HasF();
        Manipulator2<HasF> manipulator2 = new Manipulator2<HasF>(hf);
        manipulator2.manipulate();
    }

}