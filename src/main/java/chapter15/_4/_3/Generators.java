package chapter15._4._3;

import chapter15._3.coffee.Coffee;
import chapter15._3.coffee.CoffeeGenerator;
import chapter15._3.coffee.Generator;
import chapter15._3.fibonacci.Fibonacci;

import java.util.ArrayList;
import java.util.Collection;

public class Generators {

    public static <T> Collection<T> fill(Collection<T> coll, Generator<T> gen, int n) {
        for(int i = 0; i < n; i++)
            coll.add(gen.next());
        return coll;
    }

    public static void main(String[] args) {
        Collection<Coffee> coffees = fill(new ArrayList<Coffee>(), new CoffeeGenerator(), 3);
        for (Coffee c : coffees)
            System.out.println(c);

        Collection<Integer> fnumbers = fill(new ArrayList<Integer>(), new Fibonacci(), 5);
        for (Integer f : fnumbers)
            System.out.println(f);
    }

}
