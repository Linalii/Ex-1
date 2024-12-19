package hw.oopTask.stream;

import hw.oopTask.stream.data.Data;

import java.util.Arrays;
import java.util.stream.Collectors;

import static hw.oopTask.stream.data.Data.nums;

//Задача 7 reduce
//напистаь лист id типа Int
//заполнить его
//напистаь лист id2 типа int добавить туда пару id из первого листа
//написать строковую перемнную
//она должно содержать след текст
//Id пользователей (тут все id из листа через запятую(только те id котрые есть и в листе2))
public class Task7 {
    public static void main(String[] args) {
        String ids = "";
        ids = Data.nums.stream()
                .filter(p -> Data.nums2.contains(p))
                .map(p -> p.toString())
                .collect(Collectors.joining(","));

        System.out.println(ids);
    }
}
