package Functions;

import Exceptions.ArgumentOutside;
import Exceptions.UncorrectedData;
import InterfaceFunctions.FunctionOfOneArgument;
import jdk.nashorn.internal.objects.annotations.Function;

public class FunctionWithDivision implements FunctionOfOneArgument {
    //function of the form f(x) = (A*x + B)/(C*x + B);
    private double coefA;
    private double coefB;
    private double coefC;
    private double coefD;

    //LineSegment [a,b];
    private double a;
    private double b;

    public FunctionWithDivision(double A, double B, double C, double D, double a, double b) throws UncorrectedData {
        if(C == 0 && D == 0) throw new UncorrectedData("Division by 0");

        this.coefA = A;
        this.coefB = B;
        this.coefC = C;
        this.coefD = D;

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
        if(argument < a || argument > b || (coefC * argument + coefD == 0.0)) throw new ArgumentOutside("Argument outside [a,b]");
        //Maybe divison by zero, but we can't throw expection. How can i do it??
        return ((coefA * argument + coefB)/ (coefC * argument + coefD));
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
