import com.sun.deploy.util.ArrayUtil;
import com.sun.tools.javac.util.ArrayUtils;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by davidtran on 2017-08-03.
 */
public class LambdaExSortStrings {

    interface Append {
        String app(String str);
    }

    public static int myMethod(String s1, String s2) {
        return s2.indexOf('e')-s1.indexOf('e');
    }

    public static void main(String[] args) {
        String[] testStrings = {"David", "Helen", "Benjamin","Gabriel", "Joa","Henrik","Sven","Olof"};
//        Arrays.sort(testStrings, (s1,s2) -> s1.length() - s2.length());     //1.a sort shortest to longest
//        Arrays.sort(testStrings, (s1,s2) -> s2.length() - s1.length());     //1.b longest to shortest
//        Arrays.sort(testStrings, (s1,s2) -> s1.charAt(0)-s2.charAt(0));        //1.c alphabetically by first character only
//        Arrays.sort(testStrings, (s1,s2) -> s2.indexOf('e')-s1.indexOf('e'));     //1.d. strings that contain 'e' first
        Arrays.sort(testStrings, (s1,s2) -> LambdaExSortStrings.myMethod(s1,s2));
        for(String s : testStrings) System.out.println(s);

    }
}
