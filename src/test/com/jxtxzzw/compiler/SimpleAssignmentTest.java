package com.jxtxzzw.compiler;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


/**
 * Test Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>10ÔÂ 6, 2019</pre>
 */
public class SimpleAssignmentTest {

    @Before
    public void before() throws Exception {
        StringBuilder code = new StringBuilder();
        code.append("y = 3 + 4\n x = 1 + 2 + 3");
        PmachineResultTest.cx(code);
    }

    @After
    public void after() throws Exception {
        String expected = "7";
        assert PmachineResultTest.p(expected);
    }

    /**
     * Method: main(String[] args)
     */
    @Test
    public void testMain() throws Exception {
        Compiler.main(null);
    }

} 
