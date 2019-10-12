package chapter15._7._4;

import java.util.ArrayList;
import java.util.List;

public class ListMaker<T> {

    // 这里 new ArrayList<T>() 中的T不能少，否则会有警告；
    List<T> create() {
        return new ArrayList<T>();
    }

    public static void main(String[] args) {
        ListMaker<String> stringMaker = new ListMaker<String>();
        List<String> stringList = stringMaker.create();
    }

}
