package chapter15._3.fibonacci;

import chapter15._3.coffee.Generator;

public class Fibonacci implements Generator<Integer> {

    private int count = 0;

    private int fab(int n) {
        if (n < 2)
            return 1;
        return fab(n - 2) + fab(n - 1);
    }

    @Override
    public Integer next() {
        return fab(count++);
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        for (int i = 0; i < 18; i++)
            System.out.print(fibonacci.next() + " ");
    }

}
