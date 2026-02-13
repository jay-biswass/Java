package Array;

import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(45);
        arr.add(35);
        arr.add(25);
        arr.add(15);
        arr.add(5);

        System.out.println(arr.get(2));
        arr.set(3,50);

        System.out.println(arr);
    }
}
