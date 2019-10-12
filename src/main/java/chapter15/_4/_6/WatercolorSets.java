package chapter15._4._6;

import java.util.EnumSet;
import java.util.Set;

import static chapter15._4._6.Sets.*;
import static chapter15._4._6.Watercolors.*;


public class WatercolorSets {

    public static void main(String[] args) {
        Set<Watercolors> set1 = EnumSet.range(BRILLIANT_RED, VIRIDIAN_HUE);
        Set<Watercolors> set2 = EnumSet.range(CERULEAN_BLUE_HUE, BURNT_UMBER);
        System.out.println("set1: " + set1); // 11个
        System.out.println("set1: " + set2); // 11个

        System.out.println("union(set1, set2): " + union(set1, set2)); // 15ge

        Set<Watercolors> subset = intersection(set1, set2);
        System.out.println("intersection(set1, set2): " + subset); //6个

        System.out.println("difference(set1, subset): " + difference(set1, subset)); // 5个
        System.out.println("difference(set2, subset): " + difference(set2, subset)); // 5个
        System.out.println("difference(set1, sub2): " + difference(set1, set2)); // 5个
        System.out.println("complement(set1, set2): " + complement(set1, set2)); // 10个
    }

}
