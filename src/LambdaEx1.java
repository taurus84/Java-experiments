/**
 * Created by davidtran on 2017-08-03.
 */
public class LambdaEx1 {

    //UserFactory is an Functional interface since it only has one abstract
    //method, called createUser. This is a mockup, the interface is not in package

    //without functional interface you can not have lambda expressions or method references

    public static void main(String[] args) {
        UserFactory userFactory = User::new;
        System.out.println(userFactory.createUser(1,"David"));
    }
}
