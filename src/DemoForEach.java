import java.util.Arrays;
import java.util.List;

/**
 * Created by davidtran on 2017-08-02.
 */
public class DemoForEach {
    public static void main(String args[]) {

        //External loops
        List<Integer> values = Arrays.asList(4,5,6,7,8);
//        List<String> values = Arrays.asList("a", "b","c");
//        for(int i = 0; i < values.size(); i++) {
//            System.out.println(values.get(i));
//        }

//        for(int i : values) {
//            System.out.println(i);
//        }
        //Internal loops
        values.forEach(i -> System.out.println(i));     //Lambda
        values.forEach(System.out::println);     //Lambda
    }

}
