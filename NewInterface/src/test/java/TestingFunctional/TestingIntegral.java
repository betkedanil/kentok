package TestingFunctional;

import Exceptions.ArgumentOutside;
import Exceptions.UncorrectedData;
import Functionals.FunctionalIntegral;
import Functionals.FunctionalSums;
import Functions.FunctionOfExp;
import Functions.FunctionWithDivision;
import Functions.LinearFunction;
import Functions.SinxFunction;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestingIntegral {

    @Test
    public void testingLinearFunctionalMethods() throws ArgumentOutside {
        LinearFunction linearFunction = new LinearFunction(4,4,-1,2);
        FunctionalIntegral functionalIntegral = new FunctionalIntegral(0,1);

        Assert.assertEquals(functionalIntegral.functionalOfFunction(linearFunction), 6.0, 1e-4);
    }

   @Test
    public void testingSinxFunctionalMethods() throws ArgumentOutside {
        SinxFunction sinxFunction = new SinxFunction(1,1, -1, 6);
       FunctionalIntegral functionalIntegral = new FunctionalIntegral(0,5);

        Assert.assertEquals(functionalIntegral.functionalOfFunction(sinxFunction), 1-Math.cos(5), 1e-3);
    }


    @Test
    public void testingFunctionalOfExp() throws ArgumentOutside {
        FunctionOfExp functionOfExp = new FunctionOfExp(2, 1, 0,2);
        FunctionalIntegral functionalIntegral = new FunctionalIntegral(0,1);

        Assert.assertEquals(functionalIntegral.functionalOfFunction(functionOfExp),  2 * Math.exp(1) - 1, 1e-3);
    }



    @Test
    public void testingFunctionalWithDivision() throws ArgumentOutside, UncorrectedData {
        FunctionWithDivision functionWithDivision = new FunctionWithDivision(1, 2, 2, 4, 0,3);
        FunctionalIntegral functionalIntegral = new FunctionalIntegral(0,1);

        Assert.assertEquals(functionalIntegral.functionalOfFunction(functionWithDivision), 0.5, 1e-4);

    }

    @Test
    public void testingFunctional() throws ArgumentOutside, UncorrectedData {
        FunctionWithDivision functionWithDivision = new FunctionWithDivision(1, 2, 2, 4, 0,3);
        FunctionalIntegral functionalIntegral = new FunctionalIntegral(1,1);

        Assert.assertEquals(functionalIntegral.functionalOfFunction(functionWithDivision), 0, 1e-4);

    }

    @Test(expectedExceptions = ArgumentOutside.class)
    public void FunctionalExepction() throws ArgumentOutside, UncorrectedData {
        FunctionWithDivision functionWithDivision = new FunctionWithDivision(1, 2, 2, 4, 0,3);
        FunctionalIntegral functionalIntegral = new FunctionalIntegral(5,5);
        functionalIntegral.functionalOfFunction(functionWithDivision);
        //Assert.assertEquals(functionalIntegral.functionalOfFunction(functionWithDivision), 0, 1e-4);
    }
}
