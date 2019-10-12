package chapter15._10;

import java.util.ArrayList;
import java.util.List;

public class GenericsAndCovariance {

    public static void main(String[] args) {
        List<? extends Fruit> fList = new ArrayList<Apple>();
//        fList.add(new Apple());
//        fList.add(new Fruit());
//        fList.add(new Object());
        fList.add(null);
        Fruit f = fList.get(0);
    }

}
