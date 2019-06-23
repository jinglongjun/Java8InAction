package lambdasinaction.chap4;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDishTest {

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

        List<String> threeHighCaloricDishName =
                menu.stream().filter(d -> d.getCalories() > 300)
                        .map(Dish::getName)
                        .limit(3)//limit 只是简单的截取，不会做任何排序
                        .collect(Collectors.toList());
        System.out.println(threeHighCaloricDishName);
    }

    @Test(expected = IllegalStateException.class)
    public void test02() {
        List<String> title = Arrays.asList("Java8", "In", "Action");
        Stream<String> s = title.stream();
        s.forEach(System.out::println);
        s.forEach(System.out::println);
    }

    @Test
    public void test03() {

        List<String> names = menu.stream()
                .filter(d -> {
                    System.out.println("filter:" + d.getName());
                    return d.getCalories() > 300;
                })
                .map(d -> {
                    System.out.println("map:" + d.getName());
                    return d.getName();
                })
                .limit(3)
                .collect(Collectors.toList());
    }

    @Test
    public void test04(){
        long count = menu.stream()
                .filter(d -> d.getCalories() > 300)
                .distinct()
                .limit(3)
                .count();
        System.out.println(count);
    }


}