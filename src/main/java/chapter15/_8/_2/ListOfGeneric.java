package chapter15._8._2;

import java.util.ArrayList;
import java.util.List;

/**
 * 推荐方案：
 * 任何想要创建泛型数组的地方都使用ArrayList。
 * @param <T>
 */
public class ListOfGeneric<T> {

    private List<T> array = new ArrayList<T>();

    public void add(T item) {
        array.add(item);
    }

    public T get(int index) {
        return array.get(index);
    }

}
