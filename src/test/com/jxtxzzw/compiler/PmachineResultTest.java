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
            code.append("\n");
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
            answer.append("\n");
        }
        assert p(answer.toString());
    }

    private static void cx(String code) throws IOException {
        File file = new File("test.cx");
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
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
            sb.append("\n");
        }
        s = sb.toString();
        return s.contains("--> Execution time: ") && s.contains(expected);
    }
}
