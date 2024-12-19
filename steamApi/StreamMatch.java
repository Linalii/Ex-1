package lesson.steamApi;

import lesson.steamApi.data.Data;

public class StreamMatch {
    public static void main(String[] args) {

        boolean b = Data.integerList.stream()
                .map(e->e+10)
                .allMatch(integer -> integer > 10);

        System.out.println(b);

        System.out.println(Data.integerList.stream().anyMatch(integer -> integer > 7));


        boolean december = Data.itemList.stream()
                .anyMatch(item -> item.getLocalDate().getMonth().getValue() == 12 && item.getLocalDate().getYear() == 2024  );

        System.out.println(december);
    }

}
