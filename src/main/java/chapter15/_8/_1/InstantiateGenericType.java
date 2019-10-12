package chapter15._8._1;

/**
 * 这种方式实例化泛型成员变量并不被官方推荐，
 * 因为无法确定T有默认无参构造方法。
 * @param <T>
 */
class ClassAsFactory<T> {

    // 类型标签，是最便利的工厂对象
    T x;

    public ClassAsFactory(Class<T> kind) {
        try {
            x = kind.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}

class Employee {}

public class InstantiateGenericType {

    public static void main(String[] args) {
        ClassAsFactory<Employee> fe = new ClassAsFactory<Employee>(Employee.class);
        System.out.println("ClassAsFactory<Employee> succeeded.");

        try {
            ClassAsFactory<Integer> fi = new ClassAsFactory<Integer>(Integer.class);
        } catch (Exception e) {
            // Integer没有无参构造函数
            System.out.println("ClassAsFactory<Integer> failed.");
        }
    }

}
