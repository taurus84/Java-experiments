import javax.rmi.CORBA.Util;

/**
 * Created by davidtran on 2017-08-03.
 */
public class Utils {

    public static String transform(String s, StringFunction f) {
        return (f.applyFunction(s));
    }

    public static String makeExciting(String s) {
        return (s + "!!");
    }

    private Utils(){}

    public static void main(String[] args) {
        String s = "Test";

        //Below shows 3 different ways of doing the same thing. Someclass::staticMethod

        String result1 = Utils.transform(s, new StringFunction() {          //anonymous inner class
            @Override
            public String applyFunction(String x) {
                return makeExciting(x);
            }
        });

        String result1b = Utils.transform(s, t -> Utils.makeExciting(t));   //lambda function

        String result1c = Utils.transform(s, Utils::makeExciting);          //method reference


        System.out.println(result1);

        //someObject::instanceMethod
        String prefix = "Blah";
        String result2 = Utils.transform(s, prefix::concat);
        String result2b = Utils.transform(s, t -> prefix.concat(t));        //equivalent lambda function
        String result2c = Utils.transform(s, new StringFunction() {         //eq anonymous function
            @Override
            public String applyFunction(String s) {
                return s.concat(s);
            }
        });
        System.out.println(result2);
        System.out.println(result2b);
        System.out.println(result2c);

        //someclass::instanceMethod
        String result3 = Utils.transform(s, String::toUpperCase);
//        String result3b = Utils.transform(s, new StringFunction() {       //does not work with lambda??
//            @Override
//            public String applyFunction(String s) {
//                s.toUpperCase(s);
//            }
//        });
        System.out.println(result3);

    }
}
