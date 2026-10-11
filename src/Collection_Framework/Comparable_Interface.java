package Collection_Framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparable_Interface {
    static void main(String[] args) {

        List<Chhatra> chhatra = new ArrayList<>();

        chhatra.add(new Chhatra(23,"Jay",72));
        chhatra.add(new Chhatra(39,"Love",87));
        chhatra.add(new Chhatra(3,"Tillu",13));
        chhatra.add(new Chhatra(13,"Ankit",47));
        chhatra.add(new Chhatra(3,"Billu",13));

        System.out.println(chhatra);
        System.out.println();
        System.out.println();

//        Collections.sort(chhatra, new Comparator<Chhatra>() {
//            @Override
//            public int compare(Chhatra o1, Chhatra o2) {
//                if (o1.weight== o2.weight){
//                    return o1.name.compareTo(o2.name);
//                }
//                return o1.weight - o2.weight;
//            }
//        });

        Collections.sort(chhatra,new WeightComparator());

        System.out.println(chhatra);














//
//        List<Integer> list = new ArrayList<>();
//        list.add(15);
//        list.add(8);
//        list.add(2);
//        list.add(90);
//        System.out.println(list);
//
//        Collections.sort(list);
//        System.out.println("Sorted list: "+list);



    }
}
