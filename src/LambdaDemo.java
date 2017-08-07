/**
 * Created by davidtran on 2017-08-02.
 */

interface A {
    void show(int i);
}

//class Xyz implements A {
//    public void show() {
//        System.out.println("Hello");
//    }
//}
public class LambdaDemo {

    public static void main(String[] args) {
        A obj;
//        obj = new Xyz();
//        obj = new A() {
//            public void show() {
//                System.out.println("Hello");
//            }
//        };

//        obj = () -> {
//            System.out.println("Hello");
//        };

        obj = (i) -> System.out.println("hej" + i);
        obj.show(6);
    }
}
