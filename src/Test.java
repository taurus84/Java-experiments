import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by davidtran on 2017-08-09.
 */
public class Test {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Hej","du","där","borta");
//        strings.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });

        strings.forEach(System.out::println);

//        Comparator<Integer> c = (i1, i2) -> Integer.compare(i1,i2);

        List<Integer> ints = Arrays.asList(3,5,7,87,45,10);
        ints.sort((i1, i2) -> Integer.compare(i1,i2));



        ints.forEach(System.out::println);
    }
}
