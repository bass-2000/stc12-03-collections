package ru.innopolis.stc12.collections;

import java.util.*;

public class MathBox {
    private TreeSet<Integer> enterSet;

    /**
     * Элементы массива внутри конструктора раскладываются в подходящую коллекцию (выбрать самостоятельно),
     * являющуюся полем MathBox. Элементы должны отсортироваться
     *
     * @param args Конструктор на вход получает массив Integer. Элементы не могут повторяться
     */
    public MathBox(Integer args[]) {
        List<Integer> list = Arrays.asList(args);
        this.enterSet = new TreeSet<Integer>(list);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MathBox mathBox = (MathBox) o;
        return Objects.equals(enterSet, mathBox.enterSet);
    }

    @Override
    public int hashCode() {

        return Objects.hash(enterSet);
    }

    @Override
    public String toString() {
        return "MathBox{" +
                "enterSet=" + enterSet +
                '}';
    }

    /**
     * возвращающий сумму всех элементов коллекции
     *
     * @return
     */
    public int summator() {
        int result = 0;
        for (int num : enterSet) {
            result += num;
        }
        return result;
    }

    /**
     * выполняющий поочередное деление всех хранящихся в объекте элементов на делитель,
     * являющийся аргументом метода. Метод возвращает коллекцию с результатами деления.
     * Коллекция внутри mathbox при этом не меняется
     *
     * @param divider делитель
     * @return коллекция с результатом деления
     */
    public TreeSet<Integer> splitter(int divider) {
        TreeSet<Integer> result = new TreeSet<Integer>();
        for (int num : enterSet) {
            result.add(num / divider);
        }
        return result;
    }

    /**
     * метод, который получает на вход Integer и если такое значение есть в коллекции, удаляет его
     *
     * @param numToDel
     * @return коллекция с результатом
     */
    public TreeSet<Integer> predator(int numToDel) {
        TreeSet<Integer> result = new TreeSet<Integer>();
        for (int num : enterSet) {
            if (num != numToDel) result.add(num);
            else System.out.println("ATTENTION!!!\nОбнаружено число " + numToDel + " в массиве на удаление.\n");
        }
        return result;
    }

}
