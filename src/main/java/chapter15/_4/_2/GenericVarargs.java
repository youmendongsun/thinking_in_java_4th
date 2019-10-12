package chapter15._4._2;

import java.util.ArrayList;
import java.util.List;

/**
 * 可变参数与泛型方法
 */
public class GenericVarargs {

    public static <T> List<T> makeList(T... args) {
        List<T> result = new ArrayList<T>();
        for(T item : args)
            result.add(item);
        return result;
    }

    public static void main(String[] args) {
        List<String> ls = makeList("A");
        System.out.println(ls);

        ls = makeList("A", "B", "C");
        System.out.println(ls);

        ls = makeList("QWERTYUIOP".split(""));
        System.out.println(ls);
    }

}
