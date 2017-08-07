import java.util.function.Predicate;

/**
 * Created by davidtran on 2017-08-04.
 */
public class StringUtils {


    public static String betterString(String s1, String s2, TwoStringPredicate ts) {
        if(ts.doSomething(s1,s2)) return s1;
        else return s2;
    }

    public static void main(String[] args) {
        String string1 = "Davi", string2 = "Benjamin";

//        String better = StringUtils.betterString(string1, string2, new TwoStringPredicate() {
//            @Override
//            public boolean doSomething(String s1, String s2) {
//                if((s1.length()-s2.length())>0) return true;
//                else return false;
//            }
//        });

        String better = StringUtils.betterString(string1, string2,(s1,s2)->true);
        System.out.println(better);
    }
}
