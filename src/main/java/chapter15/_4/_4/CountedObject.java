package chapter15._4._4;

public class CountedObject {

    public static long count = 0;
    private final long id = count++;

    public long id() {
        return id;
    }

    public String toString() {
        return "CountedObject_" + id;
    }

}
