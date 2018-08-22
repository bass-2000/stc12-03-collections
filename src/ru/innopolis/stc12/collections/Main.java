package ru.innopolis.stc12.collections;


import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> random = new HashSet<Integer>();
        for (int i = 0; i < 10; i++) {
            random.add((int) (Math.random() * 100));
        }
        MathBox mathBox = new MathBox(random);
        System.out.println(mathBox);
    }
}
