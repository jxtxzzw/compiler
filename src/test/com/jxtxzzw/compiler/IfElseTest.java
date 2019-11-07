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
public class IfElseTest {


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
    public void IfStmt() throws Exception {
        PmachineResultTest.prepareCode("IfStmt");
        Compiler.main(null);
        PmachineResultTest.checkAnswer("IfStmt");
    }

    @Test
    public void IfEmptyStmt() throws Exception {
        PmachineResultTest.prepareCode("IfEmptyStmt");
        Compiler.main(null);
        PmachineResultTest.checkAnswer("IfEmptyStmt");
    }

    @Test
    public void IfElseStmt() throws Exception {
        PmachineResultTest.prepareCode("IfElseStmt");
        Compiler.main(null);
        PmachineResultTest.checkAnswer("IfElseStmt");
    }

    @Test
    public void IfElseScope() throws Exception {
        PmachineResultTest.prepareCode("IfElseScope");
        Compiler.main(null);
        PmachineResultTest.checkAnswer("IfElseScope");
    }

    @Test
    public void TrailingElse() throws Exception {
        PmachineResultTest.prepareCode("TrailingElse");
        Compiler.main(null);
        PmachineResultTest.checkAnswer("TrailingElse");
    }

}
