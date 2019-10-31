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
public class FunctionCall {

    @Before
    public void before() {

    }

    @After
    public void after(){
    }


    /**
     * Method: main(String[] args)
     */
    @Test
    public void UnusedFunction() throws Exception {
        PmachineResultTest.prepareCode("UnusedFunction");
        Compiler.main(null);
        PmachineResultTest.checkAnswer("UnusedFunction");
    }
}
