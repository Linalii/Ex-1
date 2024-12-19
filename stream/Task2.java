package hw.oopTask.stream;

import java.util.Arrays;

//дан массив
//Integer [] numbers = {13,90,7,2,1,199,919,293,959,988}
//из данного массива нужно получить стрим примитивов
//далее получить сумму всех чисел
public class Task2 {
    public static void main(String[] args) {
        Integer[] numbers = {13, 90, 7, 2, 1, 199, 919, 293, 959, 988};
        int[] num = Arrays.stream(numbers)
                .mapToInt(Integer::intValue)
                .toArray();
    }

}