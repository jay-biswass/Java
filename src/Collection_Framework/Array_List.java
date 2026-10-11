package Collection_Framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class Array_List {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

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

//        sort
        ArrayList<Integer> list4 = new ArrayList<>();
        list4.add(44);
        list4.add(11);
        list4.add(22);
        list4.add(99);
        list4.add(66);
        System.out.println("list4: "+list4);

        Collections.sort(list4);
        System.out.println(list4);

//        sort in descending order

        Collections.sort(list4, Collections.reverseOrder());
//        Collections.reverse(list4);
        System.out.println(list4);


//        cloning
        ArrayList<Integer> newList = (ArrayList<Integer>) list4.clone();
        System.out.println("Cloned newList: "+newList);

        ArrayList<Integer> marks = new ArrayList<>();
        marks.ensureCapacity(100);

        System.out.println(newList.isEmpty());
        System.out.println("is marks AL empty?? "+marks.isEmpty());

    }
}
