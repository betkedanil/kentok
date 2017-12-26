package InterfaceFunctions;

import Exceptions.ArgumentOutside;

public interface FunctionalOfOneArgument <T extends FunctionOfOneArgument> {

    public double functionalOfFunction(T function) throws ArgumentOutside;
}
