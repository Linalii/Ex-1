package lesson.steamApi;

import lesson.steamApi.data.Data;
import lesson.steamApi.data.Item;

import java.util.List;
import java.util.stream.Collectors;

public class MapStream {
    public static void main(String[] args) {
        List<String> collect = Data.integerList.stream()
                .map(n -> String.valueOf(n))
                .collect(Collectors.toList());


        List<Integer> items = Data.itemList.stream()
                .map(item -> item.getId())
                .collect(Collectors.toList());

        //items.stream().forEach(System.out::println);


        List<Item> list = Data.itemList.stream()
                .map(item -> {
                    item.setPrice(item.getPrice() * 0.7);
                    return item;
                })
                .toList();

        list.stream().forEach(System.out::println);

    }
}
