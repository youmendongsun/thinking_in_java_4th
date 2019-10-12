package chapter15._8._2;

public class ArrayOfGeneric {

    static final int SIZE = 100;
    static Generic<Integer>[] gia;

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        // gia = (Generic<Integer>[]) new Object[SIZE]; // 可以编译，但是不能运行，会产生ClassCastException
        gia = (Generic<Integer>[]) new Generic[SIZE];
        System.out.println(gia.getClass().getSimpleName());
        gia[0] = new Generic<Integer>();
        // gia[1] = new Object(); // Compile-time error
        // gia[2] = new Generic<Double>(); // Discover type mismatch at compile time
    }

}
