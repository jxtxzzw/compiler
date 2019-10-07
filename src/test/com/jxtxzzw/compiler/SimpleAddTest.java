package com.jxtxzzw.compiler;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.io.*;


/**
 * Test Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>10ÔÂ 6, 2019</pre>
 */
public class SimpleAddTest {

    @Before
    public void before() throws Exception {
        StringBuilder code = new StringBuilder();
        code.append("111+222+333");
        PmachineResultTest.cx(code);
    }

    @After
    public void after() throws Exception {
        String expected = "666";
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
