package hw.oopTask.stream;

import hw.oopTask.stream.data.Data;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Задача 6 reduce
//напистаь лист id типа Int
//заполнить его
//написать строковую перемнную
//она должно содержать след текст
//Id пользователей (тут все id из листа через запятую)
public class Task6 {
    public static void main(String[] args) {
        String ids = "";
        ids = Data.nums.stream()
                .map(element -> element.toString())
                .collect(Collectors.joining(","));
        System.out.println(ids);
    }
}
