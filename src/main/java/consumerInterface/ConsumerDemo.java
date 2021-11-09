package consumerInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        List<Integer> val = Arrays.asList(1, 2, 3, 4, 5, 10);
        Consumer<Integer> c = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };
        val.forEach(c);


        Consumer<Integer> consumer = (i) -> doubleIt(i);
        val.forEach(consumer);

        val.forEach(ConsumerDemo::doubleIt);//Method reference
    }

    public static void doubleIt(int i) {
        System.out.println(i * 2);
    }
}
