package practice;

import org.junit.Assert;
import org.junit.Test;

public class HelloTest {
    Hello hello = new Hello();
    @Test
    public void testAdd() {
        Assert.assertEquals(5, hello.add(2, 3));
    }
}
