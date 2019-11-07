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
public class ArrayTest {


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
    public void ArrayDefinition() throws Exception {
        PmachineResultTest.prepareCode("ArrayDefinition");
        Compiler.main(null);
        PmachineResultTest.checkAnswer("ArrayDefinition");
    }

//    @Test
    public void ArrayDefinitionWithInitialization() throws Exception {
        PmachineResultTest.prepareCode("ArrayDefinitionWithInitialization");
        Compiler.main(null);
        PmachineResultTest.checkAnswer("ArrayDefinitionWithInitialization");
    }

    @Test
    public void ArrayRightValue() throws Exception {
        PmachineResultTest.prepareCode("ArrayRightValue");
        Compiler.main(null);
        PmachineResultTest.checkAnswer("ArrayRightValue");
    }
    @Test
    public void ArrayLeftValue() throws Exception {
        PmachineResultTest.prepareCode("ArrayLeftValue");
        Compiler.main(null);
        PmachineResultTest.checkAnswer("ArrayLeftValue");
    }

//    @Test
    public void ArrayBoundaryCheck() throws Exception {
        PmachineResultTest.prepareCode("ArrayBoundaryCheck");
        Compiler.main(null);
        PmachineResultTest.checkAnswer("ArrayBoundaryCheck");
    }


}
