package Main;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.*;


public class Polynom2DegreeTest {

    @DataProvider
    public static Object[][] solve() throws Exception {
        return new Object[][]{
                {new Polynom2Degree(1, -4, 4).solvePolynom(), new double[]{2.0, 2.0}, true},
                {new Polynom2Degree(1, -5, 6).solvePolynom(), new double[]{3.0, 2.0}, true},
                {new Polynom2Degree(1, 4, 40).solvePolynom(), new double[0], true}
        };
    }


    @Test(dataProvider = "solve")
    public void solvePolynom(double[] a, double[] b, boolean expected) throws Exception {
       assertEquals(Arrays.equals(a,b), expected);
    }


}