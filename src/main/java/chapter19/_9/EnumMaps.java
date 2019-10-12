package chapter19._9;

import chapter19._8.AlarmPoints;

import java.util.EnumMap;
import java.util.Map;

import static chapter19._8.AlarmPoints.*;

interface Command {

    void action();

}

public class EnumMaps {

    public static void main(String[] args) {
        EnumMap<AlarmPoints, Command> em = new EnumMap<AlarmPoints, Command>(AlarmPoints.class);

        em.put(KITCHEN, new Command() {
            @Override
            public void action() {
                System.out.println("Kitchen fire!");
            }
        });

        em.put(BATHROOM, new Command() {
            @Override
            public void action() {
                System.out.println("Bathroom alert!");
            }
        });

        for (Map.Entry<AlarmPoints, Command> e : em.entrySet()) {
            System.out.print(e.getKey() + ": ");
            e.getValue().action();
        }

        try {
            em.get(UTILITY).action();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
