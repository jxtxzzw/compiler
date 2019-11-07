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
public class ComparisonAndLogicTest {


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
    public void Comparison() throws Exception {
        PmachineResultTest.prepareCode("Comparison");
        Compiler.main(null);
        PmachineResultTest.checkAnswer("Comparison");
    }

    @Test
    public void Logic() throws Exception {
        PmachineResultTest.prepareCode("Logic");
        Compiler.main(null);
        PmachineResultTest.checkAnswer("Logic");
    }

    @Test
    public void ComparisonAndLogic() throws Exception {
        PmachineResultTest.prepareCode("ComparisonAndLogic");
        Compiler.main(null);
        PmachineResultTest.checkAnswer("ComparisonAndLogic");
    }

}
