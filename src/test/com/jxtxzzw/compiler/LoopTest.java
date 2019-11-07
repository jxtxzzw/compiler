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
public class LoopTest {


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
    public void SimpleWhile() throws Exception {
        PmachineResultTest.prepareCode("SimpleWhile");
        Compiler.main(null);
        PmachineResultTest.checkAnswer("SimpleWhile");
    }

    @Test
    public void SimpleFor() throws Exception {
        PmachineResultTest.prepareCode("SimpleFor");
        Compiler.main(null);
        PmachineResultTest.checkAnswer("SimpleFor");
    }

    @Test
    public void SimpleDoWhile() throws Exception {
        PmachineResultTest.prepareCode("SimpleDoWhile");
        Compiler.main(null);
        PmachineResultTest.checkAnswer("SimpleDoWhile");
    }

    @Test
    public void SimpleRepeat() throws Exception {
        PmachineResultTest.prepareCode("SimpleRepeat");
        Compiler.main(null);
        PmachineResultTest.checkAnswer("SimpleRepeat");
    }

    @Test
    public void LoopScope() throws Exception {
        PmachineResultTest.prepareCode("LoopScope");
        Compiler.main(null);
        PmachineResultTest.checkAnswer("LoopScope");
    }

}
