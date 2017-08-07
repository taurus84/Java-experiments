import java.util.function.BiFunction;

/**
 * Created by davidtran on 2017-08-03.
 */
public class BiFunctionEx {

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> summation = (Integer integer, Integer integer2) -> integer + integer2;
        System.out.println(summation.apply(4,5));
    }


}
