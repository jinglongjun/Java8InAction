package lambdasinaction.chap6;

import lambdasinaction.chap4.Dish;
import lambdasinaction.chap5.MenuTest;
import org.junit.Test;

import java.util.stream.Collectors;

public class SummarizingTest extends MenuTest {

    @Test
    public void test01() {

        int totalCalories = menu.stream().mapToInt(Dish::getCalories).sum();
        System.out.println(totalCalories);
    }
    @Test
    public void test02() {

        String result = menu.stream().map(Dish::getName).collect(Collectors.joining());
        System.out.println(result);
    }

}