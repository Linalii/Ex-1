package hw.oopTask.stream.data;

import java.util.ArrayList;
import java.util.List;

public class Data {
    static public List<User> users = new ArrayList<User>();
    static public List<Integer> nums = new ArrayList<>();
    static public List<Integer> nums2 = new ArrayList<>();
    static {
        users.add(new User("Alex",3));
        users.add(new User("Bob",2));
        users.add(new User("Dan",1));
        users.add(new User("Jack",1));
        users.add(new User("Mary",100));
        users.add(new User("Michael",1));
        users.add(new User("John",1));
        users.add(new User("Jane",90));
        users.add(new User("Jack",1));
        users.add(new User("Jane",1));
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6);
        nums2.add(1);
        nums2.add(2);
        nums2.add(3);
        nums2.add(40);
        nums2.add(50);
        nums2.add(60);
        nums2.add(7);
        nums2.add(8);
        nums2.add(9);
        nums2.add(10);

    }

}
