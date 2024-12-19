package hw.oopTask.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//дан массив
//int [] numbers = {103,80,76,23,19,19,19,23,95,88}
//из данного массива нужно получить стрим ссылочных
//Integer после получить List
public class Task1 {
    public static void main(String[] args) {
        int [] numbers = {103,80,76,23,19,19,19,23,95,88};
        IntStream numStream = Arrays.stream(numbers);
        List<Integer> list = numStream.boxed().toList();
        System.out.println(list);
    }
}
