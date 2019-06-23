package lambdasinaction.chap5;

import lambdasinaction.chap4.Dish;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilteringTest {

    List<Dish> menu = Arrays.asList(
            new Dish("pork", false, 800, Dish.Type.MEAT),
            new Dish("chicken", false, 400, Dish.Type.MEAT),
            new Dish("beef", false, 700, Dish.Type.MEAT),
            new Dish("french fries", true, 530, Dish.Type.OTHER),
            new Dish("rice", true, 350, Dish.Type.OTHER),
            new Dish("season fruit", true, 120, Dish.Type.OTHER),
            new Dish("pizza", true, 550, Dish.Type.OTHER),
            new Dish("prawns", false, 300, Dish.Type.FISH),
            new Dish("salmon", false, 450, Dish.Type.FISH));

    @Test
    public void test01() {

        List<Dish> vegetarianMenu = menu.stream().filter(Dish::isVegetarian)
                .collect(Collectors.toList());

        System.out.println(vegetarianMenu);
    }

    @Test
    public void test02() {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 4, 2, 1);
        List<Integer> evenNumbers = numbers.stream()
                .filter(i -> i % 2 == 0)
                .distinct()
                .collect(Collectors.toList());

        System.out.println(evenNumbers);
    }

    @Test
    public void test03() {
        System.out.println(menu.stream()
                .filter(d -> d.getCalories() > 300)
                .limit(2)
                .collect(Collectors.toList()));
    }

    @Test
    public void test04() {
        System.out.println(menu.stream()
                .filter(d -> d.getCalories() > 300)
                .skip(1)
                .limit(2)
                .collect(Collectors.toList()));
    }


    @Test
    public void test05() {
        System.out.println(menu.stream()
                .filter(d -> d.getType().equals(Dish.Type.MEAT))
                .limit(2)
                .collect(Collectors.toList()));
    }


}
