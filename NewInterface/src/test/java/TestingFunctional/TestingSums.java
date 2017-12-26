package TestingFunctional;

import Exceptions.ArgumentOutside;
import Exceptions.UncorrectedData;
import Functionals.FunctionalSums;
import Functions.FunctionOfExp;
import Functions.FunctionWithDivision;
import Functions.LinearFunction;
import Functions.SinxFunction;
import org.testng.Assert;
import org.testng.annotations.Test;
import static java.lang.Math.*;

public class TestingSums {

    @Test
    public void testingLinearFunctionalMethods() throws ArgumentOutside {
        LinearFunction linearFunction = new LinearFunction(5,4,1,2);
        FunctionalSums functionalSums = new FunctionalSums();

        Assert.assertEquals(functionalSums.functionalOfFunction(linearFunction), 34.5);
    }

    @Test
    public void testingSinxFunctionalMethods() throws ArgumentOutside {
        SinxFunction sinxFunction = new SinxFunction(1,2,2,4);
        FunctionalSums functionalSums = new FunctionalSums();

        Assert.assertEquals(functionalSums.functionalOfFunction(sinxFunction), sin(4) + sin(6) + sin(8) );
    }

    @Test
    public void testingFunctionalOfExp() throws ArgumentOutside {
        FunctionOfExp functionOfExp = new FunctionOfExp(2, 1, 0,2);
        FunctionalSums functionalSums = new FunctionalSums();
        Assert.assertEquals(functionalSums.functionalOfFunction(functionOfExp), 3 + Math.exp(2) * 2 + 1 + Math.exp(1)*2 + 1);
    }

    @Test
    public void FunctionalWithDivision() throws ArgumentOutside, UncorrectedData {
        FunctionWithDivision functionWithDivision = new FunctionWithDivision(1, 2, 2, 4, 1,3);
        FunctionalSums functionalSums = new FunctionalSums();
        Assert.assertEquals(functionalSums.functionalOfFunction(functionWithDivision), 1.5);

    }


}
