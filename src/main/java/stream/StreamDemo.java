package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> val = Arrays.asList(1, 2, 3, 4, 5, 10, 8);

        //find even number from list
        ArrayList<Integer> evenList = new ArrayList<>();
        for (int i : val) {
            if (i % 2 == 0) {
                evenList.add(i);
            }
        }
        System.out.println(evenList);

        //find even number from list (Using stream api)
        Stream<Integer> stream = val.stream();
        List<Integer> streamList = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(streamList);

        //Using stream api in array
        String[] name = {"designPattern.Abc", "Bca", "ERA"};
        Stream<String> streamArr = Stream.of(name);
        streamArr.forEach(e -> System.out.println(e));

        //Filter string which start with 'e'
        List<String> stringList = Arrays.asList("ele", "eoe", "esr", "abc");
        System.out.println(stringList.stream().filter(e -> e.startsWith("e")).collect(Collectors.toList()));

        //find all square value from list
        System.out.println(val.stream().map(i -> i * i).collect(Collectors.toList()));

        //Sorting a list
        val.stream().sorted().forEach(System.out::println);

        //Find small number from list
        System.out.println("MIN: " + val.stream().min((o1, o2) -> o1.compareTo(o2)).get());

        //Sum of all list value
        Optional<Integer> sum = val.stream().reduce((m, n) -> (m + n));
        System.out.println("SUM" + sum.get());


    }
}
