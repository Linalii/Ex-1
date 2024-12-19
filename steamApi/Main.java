package lesson.steamApi;

import lesson.steamApi.data.Data;
import lesson.steamApi.data.Item;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //skip
        /*Data.integerList.stream()
                .skip(3)
                .forEach(System.out::println);*/
        //limit
        /*Data.integerList.stream()
                .filter(integer -> integer % 10 == 7)
                .limit(2)
                .forEach(System.out::println);*/
        //peek
        /*Data.integerList.stream()
                .filter(integer -> integer % 10 == 7)
                .peek(p -> System.out.println("peek "+p))
                .forEach(e -> System.out.println("for "+e));*/

        //count
        /*Long countLong = Data.integerList.stream()
                .filter(integer -> integer % 10 == 7)
                .peek(p -> System.out.println("peek "+p))
                .count();
        System.out.println(countLong);*/

        //concat
        /*Stream.concat(Data.integerList.stream(),Stream.of(1,23,4,54,54,56,45,4))
                .toList();*/

        Map<Double, Map<Character, List<Item>>> map4 = Data.itemList.stream()
                .collect(Collectors.groupingBy(
                        Item::getPrice,
                        Collectors.groupingBy(item -> item.getName().charAt(0))
                        )
                );

        map4.forEach((key,valueMap) ->{
            System.out.println(key);
            valueMap.forEach((key2,valueMap2)-> {
                System.out.println(key2);
                valueMap2.forEach(System.out::println);
            });

        });


    }
}
