package chapter15._5;

import chapter15._4._3.Generators;

import java.util.*;

public class BankTeller {

    public static void serve(Teller t, Customer c) {
        System.out.println(t + " serves " + c);
    }

    public static void main(String[] args) {
        Random random = new Random(47);

        Queue<Customer> line = new LinkedList<Customer>();
        Generators.fill(line, Customer.generator(), 15);

        List<Teller> tellers = new ArrayList<Teller>();
        Generators.fill(tellers, Teller.generator, 4);

        for(Customer c : line)
            serve(tellers.get(random.nextInt(tellers.size())), c);
    }
}
