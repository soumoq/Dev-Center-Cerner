import java.util.Arrays;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        List<Integer> val = Arrays.asList(1,2,3,4,5);
//        for (int i : val){
//            System.out.println(i);
//        }

        final int[] a = new int[1];
        val.forEach(i -> {
            if (i == 1){
                a[0] =i;
            }
        });

        System.out.println(a[0]);
    }
}
