/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javaapplication1.MyUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 *
 */
public class MyUnitTest {

    public MyUnitTest() {
    }

    @Before
    public void setUp() {

    }

    @After
    public void tearDown() {

    }

    @Test
    public void testAdd() {
        MyUnit myUnit = new MyUnit();
        int num1 = 30, num2 = 30, result;

        result = myUnit.add(num1, num2);
        assertEquals(60, result);

    }

    @Test
    public void test_divid_Exeption() {
        MyUnit myUnit = new MyUnit();
        int num1 = 30, num2 = 2, result;
        result = myUnit.divid(num1, num2);
//        assertEquals(15, result);
        assertThrows(Exception.class, () -> {
            myUnit.divid(4, 0)
        });

    }

}
