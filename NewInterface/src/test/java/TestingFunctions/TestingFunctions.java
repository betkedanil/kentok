package TestingFunctions;

import Exceptions.ArgumentOutside;
import Exceptions.UncorrectedData;
import Functions.FunctionOfExp;
import Functions.FunctionWithDivision;
import Functions.LinearFunction;
import Functions.SinxFunction;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestingFunctions {

    @Test
    public void testingLinearFunctionMethods() throws ArgumentOutside {
        LinearFunction linearFunction = new LinearFunction(5,4,1,7);
        Assert.assertEquals(linearFunction.calculateValue(4), 24.0);
    }

    @Test
    public void testingSinxFunctionMethods() throws ArgumentOutside {
        SinxFunction sinxFunction = new SinxFunction(5,4,-1,7);
        Assert.assertEquals(sinxFunction.calculateValue(Math.PI), 0.0, 1e-10);
    }

    @Test
    public void testingFunctionOfExp() throws ArgumentOutside {
        FunctionOfExp functionOfExp = new FunctionOfExp(3, 4, 1,8);
        Assert.assertEquals(functionOfExp.calculateValue(1), 3 * Math.exp(1) + 4);
    }

    @Test
    public void FunctionWithDivision() throws ArgumentOutside, UncorrectedData {
        FunctionWithDivision functionWithDivision = new FunctionWithDivision(5, 2, 3, 4, 1,7);
        Assert.assertEquals(functionWithDivision.calculateValue(1), 1.0);

    }

}
