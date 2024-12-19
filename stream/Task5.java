package hw.oopTask.stream;

import hw.oopTask.stream.data.Data;
import hw.oopTask.stream.data.User;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Задача 5
//дан лист с 10
//c элементами User (есть имя баллы)
//после отфильтровать оставим только юзеров кол во баллов которых больше 80
//после чего получить стрим только из их баллов
//после чего получить средне арифмитическое баллов этих юзеров
//написать лист строк заполнить его логинами
//написать строковую переменную и заполнить ее пермыми буквами логинов из лсиат
public class Task5 {
    public static void main(String[] args) {
        List<Integer> scores = Data.users.stream().
                filter(p -> p.getScore() > 80)
                .map(User::getScore)
                .toList();
        double avg = Arrays.stream(scores.stream()
                        .mapToInt(Integer::intValue)
                        .toArray()).average().orElse(0);

        //scores.forEach(System.out::println);
        //System.out.println(avg);

        String firstLetters = Data.users.stream()
                .map(User::getName)
                .map(e -> e.substring(0,1))
                .collect(Collectors.joining());

        System.out.println(firstLetters);

    }
}
