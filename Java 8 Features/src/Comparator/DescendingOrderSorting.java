package Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DescendingOrderSorting {
    public void SortingUsingLambdaExpression() {
        List<Integer> list = new ArrayList<>();
        list.add(13);
        list.add(5);
        list.add(4);
        list.add(12);
        System.out.println("Original List : "+list);
         Collections.sort(list,(a , b) -> b - a);
        System.out.println("Descending : "+list);
    }
}
