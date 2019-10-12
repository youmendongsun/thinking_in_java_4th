package chapter15._10._2;

import java.util.List;

class Fruit{}

class Apple extends Fruit {}

class Jonathan extends Apple {}

class Orange extends Fruit {}

public class SuperTypeWildcards {

    static void writeTo(List<? super Apple> apples) {
        apples.add(new Apple());
        apples.add(new Jonathan());
//        apples.add(new Fruit());
    }

}
