package lambdasinaction.chap5;

import lambdasinaction.chap4.Dish;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MappingTest extends MenuTest {

    @Test
    public void test01() {
        List<String> dishNames = menu.stream().map(Dish::getName).collect(Collectors.toList());
        System.out.println(dishNames);
    }

    @Test
    public void test02() {
        List<Integer> dishLength = menu.stream()
                .map(Dish::getName)
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println(dishLength);
    }

    @Test
    public void test03() {
        List<String> words = Arrays.asList("hello", "world");

        List<String[]> result = words.stream().map(word -> word.split(""))
                .collect(Collectors.toList());
        System.out.println(result);
    }

    @Test
    public void test04() {
        String[] arrayOfWords = {"Goodbye", "World"};

        List<Stream<String>> result = Arrays.stream(arrayOfWords)
                .map(word -> word.split(""))
                .map(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());

        System.out.println(result);
    }

    @Test
    public void test05() {
        String[] arrayOfWords = {"Goodbye", "World"};


        List<String> result = Arrays.stream(arrayOfWords).map(s -> s.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());

        System.out.println(result);
    }

    @Test
    public void test06() {
        Integer[] arrayOfWords = {1, 2, 3, 4, 5};


        List<Integer> result = Arrays.stream(arrayOfWords)
                .map(s -> s * s)
                .collect(Collectors.toList());

        System.out.println(result);
    }

    @Test
    public void test07() {
        List<Integer> numbers1 = Arrays.asList(1, 2, 3);
        List<Integer> numbers2 = Arrays.asList(4, 5);

        List<int[]> result = numbers1.stream()
                .flatMap(i -> numbers2.stream().map(j -> new int[]{i, j}))
                .collect(Collectors.toList());


        System.out.println(result);
    }

}
