package com.jxtxzzw.compiler;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


/**
 * Test Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>10ÔÂ 6, 2019</pre>
 */
public class SimpleAssignment {

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
    public void SimpleVar() throws Exception {
        PmachineResultTest.prepareCode("SimpleVar");
        Compiler.main(null);
        PmachineResultTest.checkAnswer("SimpleVar");
    }

    @Test
    public void SimpleVarDefAndExpr() throws Exception {
        PmachineResultTest.prepareCode("SimpleVarDefAndExpr");
        Compiler.main(null);
        PmachineResultTest.checkAnswer("SimpleVarDefAndExpr");
    }



}
