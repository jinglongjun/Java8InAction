package lambdasinaction.chap5;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReducingTest {

    @Test
    public void test01() {

        List<Integer> numbers = Arrays.asList(3, 4, 5, 1, 2);
        int sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println(sum);

        Optional<Integer> a = numbers.stream().reduce(Integer::max);
        System.out.println(a.get());
    }
}
