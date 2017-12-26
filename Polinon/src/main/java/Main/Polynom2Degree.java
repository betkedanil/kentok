package Main;
import Exception.InvalidValue;

public class Polynom2Degree {

    //a*x^2 + b*x + c;
    private double a;
    private double b;
    private double c;

    /**
     *
     * @param a coef of degree x^2
     * @param b coef of degree x
     * @param c free coef
     */
    public Polynom2Degree(double a, double b, double c) throws InvalidValue{
        if(a == 0) throw new InvalidValue("It's not Polynom2Degree");

        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Polynom2Degree(Polynom2Degree a){
        this.a = a.getA();
        this.b = a.getB();
        this.c = a.getC();
    }



    public double[] solvePolynom() {
        double discriminant = b * b - 4 * a * c;

        if(discriminant < 0){
            return new double[0];
        }

        return new double[]{
                (-b+Math.sqrt(discriminant))/(2*a),
                (-b-Math.sqrt(discriminant))/(2*a)
        };
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
}
