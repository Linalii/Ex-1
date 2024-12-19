package lesson.steamApi;

import lesson.steamApi.data.Data;
import lesson.steamApi.data.Item;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class FilterStream {
    public static void main(String[] args) {
        List<Integer> collect = Data.integerList.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(collect);


        List<Item> items = Data.itemList.stream()
                .filter(item -> item.getPrice() <= 100)
                .collect(Collectors.toList());
        //items.forEach(System.out::println);



        itemExpire(Data.itemList).forEach(System.out::println);
    }

    public static List<Item> itemExpire(List<Item> itemList){
        return itemList.stream()
                .filter(item -> item.getLocalDate().isBefore(LocalDate.now()))
                .collect(Collectors.toList());
    }


}
