package chapter15._7._1;

class Manipulator<T> {

    private T obj;

    public Manipulator(T x) {
        this.obj = x;
    }

    public void manipulate() {
        // obj.f();     Cannot resolve method f()
    }

}

public class Manipulation {

    public static void main(String[] args) {
        HasF hf = new HasF();
        Manipulator<HasF> manipulator = new Manipulator<HasF>(hf);
        manipulator.manipulate();
    }

}