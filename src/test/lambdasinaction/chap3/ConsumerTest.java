package lambdasinaction.chap3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest {

    public static <T> void forEeah(List<T> list, Consumer<T> c) {
        for (T t : list) {
            c.accept(t);
        }
    }
    public static void main(String[] args) {
        forEeah(Arrays.asList(1, 2, 3, 4, 5, 6), (Integer i) -> System.out.println(i));
    }
}
