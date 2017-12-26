package Functions;

import Exceptions.ArgumentOutside;
import InterfaceFunctions.FunctionOfOneArgument;

public class FunctionOfExp implements FunctionOfOneArgument {

    //function of the form f(x) = A*exp(x) + B;
    private double coefA;
    private double coefB;

    //LineSegment [a,b];
    private double a;
    private double b;

    public FunctionOfExp(double A, double B, double a, double b){
        this.coefA = A;
        this.coefB = B;

        if(a > b) {
            this.b = a;
            this.a = b;
        } else {
            this.a = a;
            this.b = b;
        }
    }
    @Override
    public double calculateValue(double argument) throws ArgumentOutside {
        if(argument < a || argument > b) throw new ArgumentOutside("Argument outside [a,b]");

        return (coefA * Math.exp(argument) + coefB);
    }

    @Override
    public double getStart() {
        return a;
    }

    @Override
    public double getEnd() {
        return b;
    }
}
