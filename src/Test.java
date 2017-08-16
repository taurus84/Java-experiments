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
        StringBuffer fb= new StringBuffer("one two one");
        System.out.println(fb.length());
        int i, j ;
        i= fb.indexOf("one");
        System.out.println(i);
        j= fb.lastIndexOf("one");
        System.out.println(j);
    }
}
