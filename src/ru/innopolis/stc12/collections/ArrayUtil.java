package ru.innopolis.stc12.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class ArrayUtil {
    /**
     * Генератор массива с уникальными значениями
     *
     * @param size - размер массива
     * @return возвращает необходимый массив элементов
     */
    public static int[] generateArray(int size) {
        int rnd;

        Random rand = new Random();
        int[] nums = new int[size];
        boolean[] check = new boolean[size * 10];
        for (int k = 0; k < size; k++) {
            rnd = rand.nextInt(size * 10);

            //Loop for when there number is already chosen
            while (check[rnd]) {
                rnd = rand.nextInt(size);

            }
            //Sets the random unique number to a slot in the array
            nums[k] = rnd;
            check[rnd] = true;

        }

        return nums;
    }

    /**
     * Метод проверяет массив на уникальность элементов. Иначе кидает эксепшен, который мы в мейне отлавливаем
     *
     * @param arr - массив для проверки
     * @throws Exception
     */
    public static void arrayUniqueChecker(int[] arr) throws Exception {
        Set<Integer> foundNumbers = new HashSet<Integer>();
        for (int num : arr) {
            if (foundNumbers.contains(num)) {
                throw new Exception("not unique");
            }
            foundNumbers.add(num);
        }
    }

    /**
     * Конвентрирует int[] массив в Integer[] массив
     * @param arr int[] массив
     * @return Integer[] массив
     */
    public static Integer[] intArrayToIntegerConverter(int[] arr) {
        return Arrays.stream(arr).boxed().toArray(Integer[]::new);
    }
}
