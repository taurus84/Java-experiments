import java.util.function.Predicate;

/**
 * Created by davidtran on 2017-08-04.
 */
public interface TwoElementPredicate<T1,T2> {
    boolean doSomeThing(T1 t1, T2 t2);
}
