package MainScript;

import Exp.NoSolve;
import Main.Polynom2Degree;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.*;

public class PolynomProcessorTest {

    private Polynom2Degree polynom2Degree;

    @BeforeTest
    public void setUp() throws Exception {
        polynom2Degree = new Polynom2Degree(1, 5, 30);
    }

    @DataProvider
    public static Object[][] solve() throws Exception {
        return new Object[][]{
                {new PolynomProcessor(new Polynom2Degree(1, -4, 4)).getMaxRoot(), 2.0},
                {new PolynomProcessor(new Polynom2Degree(1, -5, 6)).getMaxRoot(), 3.0},
                //{new Polynom2Degree(1, 4, 40).solvePolynom(), new double[0], true}
        };
    }


    @Test(dataProvider = "solve")
    public void solvePolynom(double a, double b) throws Exception {
        assertEquals(a, b);
    }

    @Test(expectedExceptions = NoSolve.class)
    public void getException() throws NoSolve{
       PolynomProcessor res = new PolynomProcessor(polynom2Degree);
       res.getMaxRoot();
    }



}