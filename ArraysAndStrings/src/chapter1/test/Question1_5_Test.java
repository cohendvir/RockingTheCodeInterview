package chapter1.test;

import chapter1.code.Question1_5;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Dvir on 18/10/2015.
 */
public class Question1_5_Test {

    @Test
    public void compressReturnNewString() {
        String toCompress = "abbcccdddde";
        Assert.assertEquals("a1b2c3d4e1", Question1_5.compress(toCompress));
    }

    @Test
    public void compressReturnOldString() {
        String toCompress = "abb";
        Assert.assertEquals("abb", Question1_5.compress(toCompress));
    }
}