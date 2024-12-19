package lesson.steamApi;

import lesson.steamApi.data.Data;
import lesson.steamApi.data.Item;

import java.util.*;
import java.util.stream.Collectors;


public class BoxedStream {
    public static void main(String[] args) {

        double avgPrice = Data.itemList.stream()
                .mapToDouble(Item::getPrice)
                .average()
                .orElse(0);

        System.out.println(avgPrice);


        List<Item> itemAvgList = Data.itemList.stream()
                .filter(e -> {
                    return e.getPrice() >
                            //avg price
                            Data.itemList.stream()
                            .mapToDouble(Item::getPrice)
                            .average()
                            .orElse(0);

                })
                .toList();

        itemAvgList.forEach(System.out::println);




        double sumD = Data.itemList.stream()
                .map(Item::getPrice)
                .mapToDouble(Double::doubleValue)
                .sum();

        System.out.println(sumD);


        // Получаем из примитивного массива list(boxed)
        List<Integer> list = Arrays.stream(Data.arrayInt)
                .boxed()
                .toList();


        //Получаем из list массив примитивов
        int[] array = Data.integerList.stream()
                .mapToInt(Integer::intValue)
                .toArray();


        double[] doubles = {19.3, 12.3, 12.4, 12.3};

        double v = Arrays.stream(doubles).average().orElse(0);
        System.out.println(v);


        double sum = Arrays.stream(doubles).sum();


        double[] doubles1 = Arrays.stream(doubles)
                .boxed()
                .collect(Collectors.toSet())
                .stream()
                .mapToDouble(Double::doubleValue)
                .toArray();
        System.out.println(Arrays.toString(array));

        double[] doubles2 = Arrays.stream(doubles)
                .distinct()
                .toArray();


        Optional<Integer> optionalInteger = Data.integerList.stream()
                .reduce((a, e) -> a + e);

        if (optionalInteger.isPresent()) {
            Integer i = optionalInteger.get();
            System.out.println(i);
        }

        //Data.integerList.clear();
        Integer sum2 = Data.integerList.stream()
                .reduce((a, e) -> a + e).orElseThrow(() -> new RuntimeException("Sum Error"));

        //System.out.println(sum2);

        int sum3 = Data.integerList.stream()
                .filter(e -> e != null)
                .mapToInt(Integer::intValue)
                .sum();


        double max = Arrays.stream(doubles)
                .max().orElse(0);


        int min = list.stream()
                .mapToInt(Integer::intValue)
                .min()
                .orElse(0);


        System.out.println(min);


        //System.out.println(Arrays.toString(array));

    }
}
