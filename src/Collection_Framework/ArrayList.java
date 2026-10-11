package Collection_Framework;

import java.util.Iterator;
import java.util.List;


public class ArrayList {
    public static void main(String[] args) {

        java.util.ArrayList<Integer> list = new java.util.ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        list.add(40);
        list.add(50);
        System.out.println(list);

        list.remove(1);
        System.out.println(list);

//        addAll
        List<Integer> list2 = new java.util.ArrayList<>();
        list2.add(101);
        list2.add(102);
        list2.add(30);

        list.addAll(list2);
        System.out.println(list);

        list.removeAll(list2);
        System.out.println(list);

        System.out.println(list.size());

        System.out.println("list2 elements: "+list2);
        System.out.println("list2 size: "+list2.size());

        list2.clear();
        System.out.println("list2 elements after clear: "+list2);
        System.out.println("list2 size after clear: "+list2.size());

//        Traversing list using Iteratoe

        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println("Element: "+iterator.next());
        }


        List<Integer> list3 = new java.util.ArrayList<>();
        list3.add(11);
        list3.add(12);
        list3.add(13);
        list3.add(14);
        System.out.println("Before set: "+list3);
        System.out.println(list3.get(2));

        list3.set(0,100);
        System.out.println("After set: "+list3);


//        toArray

        Object[] arr = list3.toArray();
        for (Object obj: arr){
            System.out.println("toArray: "+obj);
        }

//        contains

        System.out.println(list3.contains(100));
        System.out.println(list3.contains(1010));


    }
}
