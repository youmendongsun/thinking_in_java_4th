package chapter15._3.coffee;

public class Coffee {

    private static long counter = 0;
    private final long id = counter++;

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + id;
    }

    public static void main(String[] args) {

        System.out.println(new Coffee());
        System.out.println(new Coffee());
        System.out.println(new Coffee());
        System.out.println(new Coffee());
    }

}
