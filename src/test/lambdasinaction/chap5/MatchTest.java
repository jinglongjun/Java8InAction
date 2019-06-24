package lambdasinaction.chap5;

import lambdasinaction.chap4.Dish;
import org.junit.Test;

public class MatchTest extends MenuTest {

    @Test
    public void test01() {
        if (menu.stream().anyMatch(Dish::isVegetarian)) {
            System.out.println(menu);
        }

        if (menu.stream().allMatch(dish -> dish.getCalories() < 1000)) {
            System.out.println(menu);
        }

        if (menu.stream().noneMatch(dish -> dish.getCalories() < 1000)) {
            System.out.println(menu);
        }
    }

    @Test
    public void test02() {
        menu.stream()
                .filter(Dish::isVegetarian)
                .findAny()
                .ifPresent(d -> System.out.println(d.getName()));

    }

    @Test
    public void test03() {
        menu.stream()
                .filter(Dish::isVegetarian)
                .findFirst()
        .ifPresent(dish -> System.out.println(dish.getName()));

    }
}
