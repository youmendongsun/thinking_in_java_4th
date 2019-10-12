package chapter15._10._1;

public class Holder<T> {

    private T value;

    public Holder() {}

    public Holder(T value) {
        this.value = value;
    }

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return this.value;
    }

    public boolean equals(Object object) {
        return this.value.equals(object);
    }

    public static void main(String[] args) {
        Holder<Apple> appleHolder = new Holder<Apple>(new Apple());
        Apple d = appleHolder.get();
        appleHolder.set(d);

//        Holder<Fruit> fruitHolder = appleHolder;
        Holder<? extends Fruit> fruitHolder = appleHolder;
        Fruit p = fruitHolder.get();
        d = (Apple) fruitHolder.get();

        try {
            Orange c = (Orange) fruitHolder.get();
        } catch (Exception e) {
            System.out.println(e);
        }

//        fruitHolder.set(new Apple());
//        fruitHolder.set(new Fruit());

        System.out.println(fruitHolder.equals(d));
    }

}
