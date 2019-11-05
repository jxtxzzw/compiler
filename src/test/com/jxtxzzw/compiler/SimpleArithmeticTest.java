package com.jxtxzzw.compiler;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.io.*;
import java.util.ArrayList;


/**
 * Test Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>10ÔÂ 6, 2019</pre>
 */
public class SimpleArithmeticTest {


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
    public void SimpleAdd() throws Exception {
        PmachineResultTest.prepareCode("SimpleAdd");
        Compiler.main(null);
        PmachineResultTest.checkAnswer("SimpleAdd");
    }

    @Test
    public void SimpleSub() throws Exception {
        PmachineResultTest.prepareCode("SimpleSub");
        Compiler.main(null);
        PmachineResultTest.checkAnswer("SimpleSub");
    }

    @Test
    public void SimpleMod() throws Exception {
        PmachineResultTest.prepareCode("SimpleMod");
        Compiler.main(null);
        PmachineResultTest.checkAnswer("SimpleMod");
    }

    @Test
    public void ArithmeticPriority() throws Exception {
        PmachineResultTest.prepareCode("ArithmeticPriority");
        Compiler.main(null);
        PmachineResultTest.checkAnswer("ArithmeticPriority");
    }

    @Test
    public void SimpleOdd() throws Exception {
        PmachineResultTest.prepareCode("SimpleOdd");
        Compiler.main(null);
        PmachineResultTest.checkAnswer("SimpleOdd");
    }

}
