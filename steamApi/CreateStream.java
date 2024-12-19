package lesson.steamApi;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreateStream {
    public static void main(String[] args) {
        //1
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        Stream<Integer> stream = list.stream();

        //2
        Stream<String> stream2 = Stream.of("a","b","c","d");

        //3
        int [] array = {1,2,3,4,5};
        IntStream stream1 = Arrays.stream(array);

        //4
        String str = "String \nSring2 \nString3";
        Stream<String> lines = str.lines();
        //lines.forEach(System.out::println);


        //5
        Path path = Path.of("C:\\Users\\Linali\\TestMap\\JavaCoreLesson\\src\\main\\java\\hw\\oopTask\\steamApi\\users.csv");

        try {
            Stream<String> lines1 = Files.lines(path);
            lines1.forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }






    }
}
