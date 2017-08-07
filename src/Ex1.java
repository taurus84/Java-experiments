import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by davidtran on 2017-08-04.
 */
public class Ex1 {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);

        numbers.forEach((Integer i) -> {if(i >= 3) System.out.println(i);});


    }

}
