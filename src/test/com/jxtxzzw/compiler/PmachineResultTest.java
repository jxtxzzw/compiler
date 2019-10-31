package com.jxtxzzw.compiler;

import java.io.*;

class PmachineResultTest {

    private static final String DIR = "./src/test/resources/";

    public static void prepareCode(String fileName) throws Exception {
        fileName = DIR + fileName + ".cx";
        BufferedReader br = new BufferedReader(new FileReader(new File(fileName)));
        StringBuilder code = new StringBuilder();
        String s;
        while ((s = br.readLine()) != null) {
            code.append(s);
        }
        cx(code.toString());
    }

    public static void checkAnswer(String fileName) throws Exception {
        fileName = DIR + fileName + ".ans";
        BufferedReader br = new BufferedReader(new FileReader(new File(fileName)));
        StringBuilder answer = new StringBuilder();
        String s;
        while ((s = br.readLine()) != null) {
            answer.append(s);
        }
        assert p(answer.toString());
    }

    private static void cx(String code) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(new File("test.cx")));
        bw.write(code);
        bw.close();
    }

    private static boolean p(String expected) throws IOException {
        Process p = Runtime.getRuntime().exec("Pmachine.exe test.p");
        BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
        StringBuilder sb = new StringBuilder();
        String s;
        while ((s = br.readLine()) != null) {
            sb.append(s);
        }
        s = sb.toString();
        return s.contains("--> Execution time: ") && s.contains(expected);
    }
}
