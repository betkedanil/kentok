package MainScript;

import Main.Polynom2Degree;
import Exception.InvalidValue;
import Exp.NoSolve;

public class PolynomProcessor {
    private Polynom2Degree polynom;

    public PolynomProcessor(Polynom2Degree polynom){
        this.polynom = new Polynom2Degree(polynom);
    }

    public double getMaxRoot() throws NoSolve{
        if(polynom.solvePolynom().length == 0){
            throw new NoSolve("Polynom doesn't have roots");
        }
        return (polynom.solvePolynom()[0] > polynom.solvePolynom()[1] ? polynom.solvePolynom()[0] : polynom.solvePolynom()[1]);
    }

}
