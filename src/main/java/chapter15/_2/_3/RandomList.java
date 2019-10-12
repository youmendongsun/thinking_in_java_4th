package chapter15._2._3;

import java.util.ArrayList;
import java.util.Random;

public class RandomList<T> {

    private ArrayList<T> storage = new ArrayList<T>();
    private Random random = new Random(47);

    public void add(T item) {
        storage.add(item);
    }

    public T select() {
        return storage.get(random.nextInt(storage.size()));
    }

    public static void main(String[] args) {
        RandomList<String> rs = new RandomList<String>();
        for(String s : "The quick brown fox jumped over the lazy dog".split(" "))
            rs.add(s);
        for(int i = 0; i < 10; i++)
            System.out.print(rs.select() + " ");

    }

}
