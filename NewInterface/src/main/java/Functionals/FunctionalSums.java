package Functionals;

import Exceptions.ArgumentOutside;
import InterfaceFunctions.FunctionOfOneArgument;
import InterfaceFunctions.FunctionalOfOneArgument;

public class FunctionalSums implements FunctionalOfOneArgument {

    @Override
    public double functionalOfFunction(FunctionOfOneArgument function) throws ArgumentOutside {
        return function.calculateValue(function.getStart()) +
               function.calculateValue(function.getEnd()) +
               function.calculateValue((function.getStart() + function.getEnd())/2);
    }
}
