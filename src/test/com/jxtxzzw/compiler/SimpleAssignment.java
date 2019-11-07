package com.jxtxzzw.compiler;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

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
    public void after() {
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

    @Test
    public void DeclarationWithInitialization() throws Exception {
        PmachineResultTest.prepareCode("DeclarationWithInitialization");
        Compiler.main(null);
        PmachineResultTest.checkAnswer("DeclarationWithInitialization");
    }

    @Test
    public void DeclarationAnywhere() throws Exception {
        PmachineResultTest.prepareCode("DeclarationAnywhere");
        Compiler.main(null);
        PmachineResultTest.checkAnswer("DeclarationAnywhere");
    }

    @Test
    public void Constant() throws Exception {
        PmachineResultTest.prepareCode("Constant");
        Compiler.main(null);
        PmachineResultTest.checkAnswer("Constant");
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void ConstantWithoutInitialValueExceptionExpected() throws Exception {
        PmachineResultTest.prepareCode("ConstantWithoutInitialValueExceptionExpected");
        thrown.expect(Exception.class);
        Compiler.main(null);
        System.exit(0);
    }

    @Test
    public void DuplicatedVarExceptionExpected() throws Exception {
        PmachineResultTest.prepareCode("DuplicatedVarExceptionExpected");
        thrown.expect(Exception.class);
        Compiler.main(null);
        System.exit(0);
    }

    @Test
    public void ConstAssignExceptionExpected() throws Exception {
        PmachineResultTest.prepareCode("ConstAssignExceptionExpected");
        thrown.expect(Exception.class);
        Compiler.main(null);
        System.exit(0);
    }

}
