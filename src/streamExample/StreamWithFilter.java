package streamExample;

import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Created by davidtran on 2017-08-09.
 */
public class StreamWithFilter {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("one","two","three","four","five");

//        Predicate<String> p1 = new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                return s.length() > 3;
//            }
//        };

        Predicate<String> p1Lambda = s -> s.length() > 3;

        Predicate<String> p2 = Predicate.isEqual("two");
        Predicate<String> p3 = Predicate.isEqual("three");

        stream
                .peek(System.out::println)
                .filter(p2.or(p3).and(p1Lambda))
                .forEach(System.out::println);
    }
}
