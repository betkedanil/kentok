package Functions;

import Exceptions.ArgumentOutside;
import InterfaceFunctions.FunctionOfOneArgument;

public class SinxFunction implements FunctionOfOneArgument {
    //function of the form f(x) = A*sin(Bx);

    private double coefA;
    private double coefB;

    //LineSegment [a,b];
    private double a;
    private double b;


    /**
     *
     * @param A coefA f(x) = -->A*sin(Bx);
     * @param B coefb f(x) = A*sin(-->Bx);
     * @param a [-->a, b]
     * @param b [a, -->b]
     * if(a > b) ==> this.a = b; this.b = a;
     */
    public SinxFunction(double A, double B, double a, double b){
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

        return coefA * Math.sin(argument * coefB);
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
