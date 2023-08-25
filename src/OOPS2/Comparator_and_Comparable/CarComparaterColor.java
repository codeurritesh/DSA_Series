package OOPS2.Comparator_and_Comparable;

import java.util.Comparator;

public class CarComparaterColor implements Comparator<Cars> {

    @Override
    public int compare(Cars o1, Cars o2) {
        // TODO Auto-generated method stub
        return o1.color.compareTo(o2.color);
    }


}