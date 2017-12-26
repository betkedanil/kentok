package InterfaceFunctions;

import Exceptions.ArgumentOutside;

public interface FunctionOfOneArgument {

    public double calculateValue(double argument) throws ArgumentOutside;

    public  double getStart();
    public  double getEnd();

}
