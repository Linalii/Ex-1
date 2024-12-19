package hw.oopTask.stream;

import java.util.Arrays;

//дан массив
//Integer [] numbers = {13,90,7,2,1,199,919,293,959,988}
//из данного массива нужно получить стрим примитивов
//отфильтровать оставив только числа которые не заканчиваются на 9
//после ввести среднеарифметическое этих чисел
public class Task4 {
    public static void main(String[] args) {
        Integer [] numbers = {13,90,7,2,1,199,919,293,959,988};
        int [] num = Arrays.stream(numbers)
                .mapToInt(Integer::valueOf)
                .filter(p -> p % 10 != 9)
                .toArray();
        Arrays.stream(num).average().ifPresent(System.out::println);
    }
}
