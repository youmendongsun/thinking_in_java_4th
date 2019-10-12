package chapter15._8._2;

class Generic<T> {}

public class ArrayOfGenericReference {

    /**
     * 引用这样定义没有问题，但是该确切类型的数组将永远无法创建；
     */
    static Generic<Integer>[] gia;

}
