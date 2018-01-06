package de.dani.javatest.prog;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


public class SumApp {

    public static void main(String[] args) {
        System.out.println("Dani lernt Java");

        for (int n = 0; n < 10; n++) {
            System.out.println(n);
        }

        boolean b = true;

        int z = 1;
        float f = 1.7038529f;


        long l = 1_000_000_000;
        double d = 1.345345433463462434234234235357;

        String s = "ich bin ein string";


        if (z == 1) {
            System.out.println("drinnen");
        }

        List<String> names = new ArrayList<>();
        names.add("Ardi");

        List<Integer> numbers = new LinkedList<>();

        Map<String, Integer> map = new HashMap<>();
        map.put("Ardi", 1);
        map.put("Dani", 1);
        map.put("Hermi", 2);
        map.put("Dani", 2);
        System.out.println(map);

    }


}
