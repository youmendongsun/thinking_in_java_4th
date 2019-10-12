package chapter15._5;

import chapter15._3.coffee.Generator;

public class Teller {

    private static long counter = 1;

    private final long id = counter++;

    private Teller() {}

    @Override
    public String toString() {
        return "Teller{" +
                "id=" + id +
                '}';
    }

    public static Generator<Teller> generator = new Generator<Teller>() {
        @Override
        public Teller next() {
            return new Teller();
        }
    };

}
