package ru.innopolis.stc12.collections;


import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        int size = 2;   //размер массива
        int[] inputNumbers = ArrayUtil.generateArray(size);
        //int[] inputNumbers = {10,10,34,36,17}; //для проверки дублей

        try {
            ArrayUtil.arrayUniqueChecker(inputNumbers);
        } catch (Exception e) {
            System.out.println(e);
        }
        Integer[] inputArray = ArrayUtil.intArrayToIntegerConverter(inputNumbers);

        System.out.println("Выводим нагенерённый массив: ");
        for (int i : inputArray) {
            System.out.print(i + " ");
        }

        MathBox mathBox = new MathBox(inputArray);

        System.out.println("\nВыводим toString:");
        System.out.println(mathBox);

        System.out.println("Выводим summator:");
        System.out.println(mathBox.summator());

        System.out.println("Выводим splitter:");
        System.out.println(mathBox.splitter(2));

        System.out.println("Выводим predator:");
        System.out.println(mathBox.predator(10));

    }
}
