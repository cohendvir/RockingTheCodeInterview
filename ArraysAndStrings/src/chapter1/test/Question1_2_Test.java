package chapter1.test;

import chapter1.code.Question1_2;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Dvir on 18/10/2015.
 */
public class Question1_2_Test {

    @Test
    public void reverse() {
        String str = "abcd1234";
        Assert.assertEquals("4321dcba", Question1_2.reverst(str));
    }
}
