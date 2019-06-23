package lambdasinaction.chap3;

import lambdasinaction.chap3.Sorting.Apple;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortingTest {
    @Test
    public void testSort01() {
        List<Apple> inventory = new ArrayList<>(Arrays.asList(new Apple(80, "green"), new Apple(155, "green"), new Apple(120, "red")));

        inventory.sort(new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return o1.getWeight().compareTo(o2.getWeight());
            }
        });

        inventory.sort((Apple a1, Apple a2) -> a1.getWeight().compareTo(a2.getWeight()));

        inventory.sort((a1, a2) -> a1.getWeight().compareTo(a2.getWeight()));

        inventory.sort(Comparator.comparing((Apple::getWeight)));

        inventory.sort(Comparator.comparing((Apple::getWeight)).reversed().thenComparing(Apple::getColor));


    }
}