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
public class RealProblemTest {

    @Before
    public void before() {

    }

    @After
    public void after() {
    }


    /**
     * Method: main(String[] args)
     */
    @Test
    public void GCD_EA() throws Exception {
        PmachineResultTest.prepareCode("GCD_EA");
        Compiler.main(null);
        PmachineResultTest.checkAnswer("GCD_EA");
    }

    @Test
    public void GCD_Recursive() throws Exception {
        PmachineResultTest.prepareCode("GCD_Recursive");
        Compiler.main(null);
        PmachineResultTest.checkAnswer("GCD_Recursive");
    }


    @Test
    public void Factorial_Recursive() throws Exception {
        PmachineResultTest.prepareCode("Factorial_Recursive");
        Compiler.main(null);
        PmachineResultTest.checkAnswer("Factorial_Recursive");
    }

    @Test
    public void Prime() throws Exception {
        PmachineResultTest.prepareCode("Prime");
        Compiler.main(null);
        PmachineResultTest.checkAnswer("Prime");
    }

    @Test
    public void LCM() throws Exception {
        PmachineResultTest.prepareCode("LCM");
        Compiler.main(null);
        PmachineResultTest.checkAnswer("LCM");
    }


}
