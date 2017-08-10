package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by davidtran on 2017-08-09.
 */
public class StringExamples {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("one","two","three","four");

        List<String> list = new ArrayList<>(strings);
        list.add("five");

        list.forEach(String::toUpperCase);

        System.out.println(
                list.stream().collect(Collectors.joining(", "))
        );
    }
}
