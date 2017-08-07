/**
 * Created by davidtran on 2017-08-03.
 */
public class Number {
    private double num;

    public Number setNum(double x) {
        this.num = x;
        return this;
    }
    public Number multiply() {
        this.num = num*num;
        return this;
    }

    public Number divide() {
        this.num = num/2;
        return this;
    }

    public double getNum() {
        return this.num;
    }

    public static void main(String[] args) {
        Number n = new Number();
        System.out.println(n.setNum(5).multiply().divide().getNum());
    }
}
