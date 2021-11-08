import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class FilterExample {
    public static void main(String[] args) {
        List<Integer> val = Arrays.asList(1, 2, 3, 4, 5, 10);
//        Iterator<Integer> i = val.iterator();
//
//        while (i.hasNext()) {
//            System.out.println(i.next());
//        }

        val.forEach(j -> System.out.println(j));

    }
}
