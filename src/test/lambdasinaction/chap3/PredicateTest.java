package lambdasinaction.chap3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {

    public static void main(String[] args) {

        List<String> listString = Arrays.asList("1", "2", "", "4");
        List<String> empyString = filter(listString, (String s) -> !s.isEmpty());
        System.out.println(empyString);
    }

    public static <T> List<T> filter(List<T> list, Predicate<T> p) {
        List<T> results = new ArrayList<>();
        for (T s : list) {
            if (p.test(s)) {
                results.add(s);
            }
        }
        return results;
    }
}
