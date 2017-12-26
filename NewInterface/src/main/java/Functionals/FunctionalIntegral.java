package Functionals;

import Exceptions.ArgumentOutside;
import InterfaceFunctions.FunctionOfOneArgument;
import InterfaceFunctions.FunctionalOfOneArgument;

public class FunctionalIntegral implements FunctionalOfOneArgument {

    private static final long splitting = 10000000;
    //Line Segment for integral
    private double downIntegrationLimit;
    private double upperIntegrationLimit;
    private int replace;


    public FunctionalIntegral(double a, double b){
        if(a > b){
            this.downIntegrationLimit = a;
            this.upperIntegrationLimit = b;
            replace = -1;
        } else {
            this.downIntegrationLimit = a;
            this.upperIntegrationLimit = b;
            replace =1;
        }
    }

    @Override
    public double functionalOfFunction(FunctionOfOneArgument function) throws ArgumentOutside {
        if(downIntegrationLimit <  function.getStart() || upperIntegrationLimit > function.getEnd()) throw new ArgumentOutside("out of the function definition area");

        double result = function.calculateValue(downIntegrationLimit)* (upperIntegrationLimit - downIntegrationLimit)/splitting;

        for(double i = downIntegrationLimit; i < upperIntegrationLimit; i+= Math.abs(upperIntegrationLimit - downIntegrationLimit)/splitting){
            result+= function.calculateValue(i)* ((upperIntegrationLimit - downIntegrationLimit)/splitting);
        }

        result+= function.calculateValue(upperIntegrationLimit)* (upperIntegrationLimit - downIntegrationLimit)/splitting;

        return result * replace;
        //return function.calculateValue((function.getStart() + function.getEnd()) / 2) * (this.b - this.a);

    }

}
