package lambdasinaction.common;

public class BaseLambdaTest {
    public static void main(String[] args) {
        BaseLambdaTest test = new BaseLambdaTest();
        MathOperation addition = Integer::sum;
        System.out.println(test.operate(1, 2, addition));

        System.out.println();

        StringOperation operation = System.out::println;
        operation.sayHello("asdasda");

        int i = 111;
        Convert<Integer, String> s = (param) -> System.out.println((param + i));
        s.convert(1000);
    }

    interface Convert<T1, T2> {
        void convert(T1 i);
    }

    interface StringOperation {
        void sayHello(String msg);
    }

    interface MathOperation {
        int operation(int a, int b);
    }

    private int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }


}
