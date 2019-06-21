package lambdasinaction.chap1;

import lambdasinaction.chap1.FilteringApples.Apple;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class FilteringApplesTest {

    @Test
    public void testLambda() {
        List<Apple> inventory = Arrays.asList(
                new Apple(80, "green"),
                new Apple(155, "green"),
                new Apple(120, "red"));
        List<Apple> result = FilteringApples.filterApples(inventory,
                (Apple apple) -> "red".equals(apple.getColor()));
        System.out.println(result.size());
    }
}