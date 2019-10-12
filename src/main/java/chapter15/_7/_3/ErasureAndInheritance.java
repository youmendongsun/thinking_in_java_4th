package chapter15._7._3;

class GenericBase<T> {
    private T element;

    public void set(T x) {
        this.element = x;
    }

    public T get() {
        return this.element;
    }
}

class Derived1<T> extends GenericBase<T> {}

class Derived2 extends GenericBase {}

// class Derived3 extends GenericBase<?> {} // no wildcard expected

public class ErasureAndInheritance {

    @SuppressWarnings("unckecked")
    public static void main(String[] args) {
        Derived2 d2 = new Derived2();
        Object obj = d2.get();
        d2.set(obj); // Unchecked call to set(T) as a member of raw type
    }

}