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

    @Test
    public void FunctionCallWithNoParams() throws Exception {
        PmachineResultTest.prepareCode("FunctionCallWithNoParams");
        Compiler.main(null);
        PmachineResultTest.checkAnswer("FunctionCallWithNoParams");
    }

    @Test
    public void FunctionCallWithParams() throws Exception {
        PmachineResultTest.prepareCode("FunctionCallWithParams");
        Compiler.main(null);
        PmachineResultTest.checkAnswer("FunctionCallWithParams");
    }

    @Test
    public void FunctionCallWithReturnValue() throws Exception {
        PmachineResultTest.prepareCode("FunctionCallWithReturnValue");
        Compiler.main(null);
        PmachineResultTest.checkAnswer("FunctionCallWithReturnValue");
    }

    @Test
    public void RecursivelyCall() throws Exception {
        PmachineResultTest.prepareCode("RecursivelyCall");
        Compiler.main(null);
        PmachineResultTest.checkAnswer("RecursivelyCall");
    }

    @Test
    public void FunctionScope() throws Exception {
        PmachineResultTest.prepareCode("FunctionScope");
        Compiler.main(null);
        PmachineResultTest.checkAnswer("FunctionScope");
    }

}
