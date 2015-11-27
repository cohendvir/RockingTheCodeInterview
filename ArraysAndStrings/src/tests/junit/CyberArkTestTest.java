package tests.junit;

import org.junit.Assert;
import org.junit.Test;
import tests.CyberArkTest;
import tests.CyberArkTest2;

/**
 * Created by Dvir on 13/11/2015.
 */
public class CyberArkTestTest {

    @Test
    public void testSolution() throws Exception {
        Assert.assertEquals(76, new CyberArkTest2().solution("13+62*7+*"));
    }

    @Test
    public void testSolution2() throws Exception {
        Assert.assertEquals(487, new CyberArkTest2().solution("25*86**7+"));
    }

    @Test
    public void testSolution3() throws Exception {
        Assert.assertEquals(487, new CyberArkTest2().solution("25*86**7-"));
    }
}