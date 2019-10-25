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
public class SimpleAddTest {


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

}
