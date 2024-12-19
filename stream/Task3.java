package hw.oopTask.stream;

import java.util.Arrays;

//Задача 3
//дан массив
//Integer [] numbers = {13,90,7,2,1,199,919,293,959,988}
//из данного массива нужно получить стрим примитивов
//далее отфильтровать оставив только числа которые меньше 100
//дальше получить только 3 числа и получить в итоге массив
//Вопрос - как получить только несколько элементов?
public class Task3 {
    public static void main(String[] args) {
        Integer [] numbers = {13,90,7,2,1,199,919,293,959,988};
        int [] num = Arrays.stream(numbers)
                .mapToInt(Integer::intValue)
                .filter(p -> p < 100)
                .skip(Arrays.stream(numbers)
                        .mapToInt(Integer::intValue)
                        .filter(p -> p < 100)
                        .toArray().length - 3)
                .toArray();

        for(int n: num){
            System.out.println(n);
        }

    }
}
