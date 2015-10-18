package test.chapter1;

import chapter1.Question1_1;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Dvir on 18/10/2015.
 */
public class Question1_1_Test {

    @Test
    public void uniqueWithDS() {

        String allUnique = "abcdefg1";
        Assert.assertTrue(Question1_1.allUnique(allUnique));
    }

    public void notUniqueWithDS() {

        String notUnique = "abcag33";
        Assert.assertFalse(Question1_1.allUnique(notUnique));
    }
}
