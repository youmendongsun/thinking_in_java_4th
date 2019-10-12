package chapter15._3.coffee;

import java.util.Iterator;
import java.util.Random;

public class CoffeeGenerator implements Generator<Coffee>, Iterable<Coffee> {

    private Class[] types = {Americano.class, Breve.class, Cappuccino.class, Latte.class, Mocha.class};

    private int size;

    private static Random random = new Random(100);

    public CoffeeGenerator() {}

    public CoffeeGenerator(int size) {
        this.size = size;
    }

    @Override
    public Coffee next() {
        try {
            return (Coffee) types[random.nextInt(types.length)].newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    class CoffeeIterator implements Iterator<Coffee> {

        int count = size;

        @Override
        public boolean hasNext() {
            return count > 0;
        }

        @Override
        public Coffee next() {
            count --;
            return CoffeeGenerator.this.next();
        }

        @Override
        public void remove() {

        }

    }

    @Override
    public Iterator<Coffee> iterator() {
        return new CoffeeIterator();
    }

}

class CoffeeGeneratorClient {

    public static void main(String[] args) {
        CoffeeGenerator coffeeGenerator = new CoffeeGenerator();
        for(int i = 0; i < 5; i++)
            System.out.println(coffeeGenerator.next());
        for(Coffee c : new CoffeeGenerator(5))
            System.out.println(c);
    }

}