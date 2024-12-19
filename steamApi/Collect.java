package lesson.steamApi;

import lesson.steamApi.data.Data;
import lesson.steamApi.data.Item;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Collect {
    public static void main(String[] args) {
      HashSet<Integer> set =  Data.integerList.stream()
                .collect(Collectors.toCollection(HashSet<Integer>::new));


      LinkedList lst = Data.itemList.stream()
              .map(e -> e.getName())
              .collect(Collectors.toCollection(LinkedList::new));


       String names  = Data.itemList.stream()
                .map(e -> e.getName())
                .collect(Collectors.joining(",","name:",";"));
        //System.out.println(names);

        Map<Boolean, List<Item>> mapItems = Data.itemList.stream()
                .collect(Collectors.groupingBy(e -> e.getLocalDate().isBefore(LocalDate.now())));

        //System.out.println("before");
        //mapItems.get(true).forEach(item -> System.out.println(item));


        //System.out.println("after");
        //mapItems.get(false).forEach(item -> System.out.println(item));


        Map<Double, List<Item>> mapPrice = Data.itemList.stream()
                .collect(Collectors.groupingBy(Item::getPrice));

        /*for (Map.Entry<Double, List<Item>> entry : mapPrice.entrySet()) {
            System.out.println("Ключ "+entry.getKey());
            System.out.println("Значение "+entry.getValue());
        }*/

        Map<Double, Long> mapPrice2 = Data.itemList.stream()
                .collect(Collectors.groupingBy(Item::getPrice,Collectors.counting()));

        for (Map.Entry<Double, Long> entry : mapPrice2.entrySet()) {
            System.out.println("Ключ "+entry.getKey() + " - " +entry.getValue());
        }


        Map<Double, HashSet<Item>> mapPrice3 = Data.itemList.stream()
                .collect(Collectors.groupingBy(Item::getPrice,Collectors.toCollection(HashSet::new)));


    }
}
