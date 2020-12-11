import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestAddTest {

    @Test
    public void myObjectEqualsTest(){

        TestAdd expectedEmpObj = new TestAdd(1, "Lukanyo", 15000);
        assertEquals(expectedEmpObj, TestAdd.getHighestPaidEmployee().getHighestPaidEmployee());
    }
}