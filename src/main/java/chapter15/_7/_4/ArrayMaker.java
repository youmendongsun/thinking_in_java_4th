package chapter15._7._4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayMaker<T> {

    private Class<T> kind;

    public ArrayMaker(Class<T> kind) {
        this.kind = kind;
    }

    T[] create(int size) {
        /**
         * 这里如果不强转的话会报错，编译期kind的类型是Object，
         * 故Array.newInstance(kind, size)创建的是Object[],
         * 而方法的返回类型是T[]；
         */
        return (T[])Array.newInstance(kind, size);
    }

    public static void main(String[] args) {
        ArrayMaker<String> stringMaker = new ArrayMaker(String.class);
        String[] stringArray = stringMaker.create(9);
        System.out.println(Arrays.toString(stringArray));
    }

}
