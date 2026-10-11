package Collection_Framework;

import java.util.Comparator;

public class WeightComparator implements Comparator<Chhatra> {


    @Override
    public int compare(Chhatra o1, Chhatra o2) {
        if (o1.weight== o2.weight){
            return o1.name.compareTo(o2.name);
        }
        return o1.weight - o2.weight;
    }
}
