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
public class Comment {

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
    public void Comment() throws Exception {
        PmachineResultTest.prepareCode("Comment");
        Compiler.main(null);
        PmachineResultTest.checkAnswer("Comment");
    }


}
