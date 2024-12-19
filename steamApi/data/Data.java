package lesson.steamApi.data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Data {
    static public List<Integer> integerList = new ArrayList<>();
    static public int [] arrayInt = {1,2,3,4,5,6,7,8,9,10};

    public static List<Item> itemList = new ArrayList<>();

    static {
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        integerList.add(6);
        integerList.add(7);
        integerList.add(8);
        integerList.add(9);
        integerList.add(10);
        integerList.add(17);
        integerList.add(77);

        itemList.add(new Item(1,"item1",15.2, LocalDate.of(2024,11,20)));
        itemList.add(new Item(2,"item2",115.2, LocalDate.of(2024,12,6)));
        itemList.add(new Item(3,"item3",315.2, LocalDate.of(2024,11,30)));
        itemList.add(new Item(34,"Ztem34",315.2, LocalDate.of(2024,11,30)));
        itemList.add(new Item(33,"Atem33",315.2, LocalDate.of(2024,11,30)));
        itemList.add(new Item(356,"Btem356",315.2, LocalDate.of(2024,11,30)));
        itemList.add(new Item(355,"item355",515, LocalDate.of(2024,1,30)));
        itemList.add(new Item(4,"item4",515.2, LocalDate.of(2024,12,27)));
        itemList.add(new Item(5,"item5",65.2, LocalDate.of(2024,12,29)));
    }
}
