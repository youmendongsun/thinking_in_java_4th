package chapter15._8;

public class Erased<T> {

    private final int SIZE = 100;

    public static void f(Object arg) {
        // if (arg instanceof T) {} // error
        // T var = new T(); // error
        // T[] array = new T[SIZE]; // error
        // T[] array = (T)new Object[SIZE]; // error
    }

}
