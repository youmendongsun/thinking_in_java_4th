package chapter15._2._1;

public class FiveTuple<A, B, C, D, E> extends FourTuple<A, B, C, D> {

    public final E fifth;

    public FiveTuple(A a, B b, C c, D d, E e) {
        super(a, b, c, d);
        fifth = e;
    }

    @Override
    public String toString() {
        return "FiveTuple{" +
                "fifth=" + fifth +
                ", fourth=" + fourth +
                ", third=" + third +
                ", first=" + first +
                ", second=" + second +
                '}';
    }
}
