package ArrayList;

import java.util.*;

public class Basic {
    public static void main(String[] args) {
        //Add O(1)
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        //remove O(n)
        list.remove(1);

        //set O(n)
        list.set(0, 1);

        //contains O(n);
        System.out.println(list.contains(2));

        //size
        System.out.println(list.size());
    }
}
