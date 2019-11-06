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
public class IO {

    @Before
    public void before() {

    }

    @After
    public void after(){
    }


    /**
     * Method: main(String[] args)
     */
//    @Test
    public void Read() throws Exception {
        PmachineResultTest.prepareCode("Read");
        Compiler.main(null);
        PmachineResultTest.checkAnswer("Read");
    }

    @Test
    public void Write() throws Exception {
        PmachineResultTest.prepareCode("Write");
        Compiler.main(null);
        PmachineResultTest.checkAnswer("Write");
    }


    @Test
    public void Writeln() throws Exception {
        PmachineResultTest.prepareCode("Writeln");
        Compiler.main(null);
        PmachineResultTest.checkAnswer("Writeln");
    }

}
