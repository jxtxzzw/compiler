package com.jxtxzzw.compiler;

import java.io.*;

class PmachineResultTest {

    static void cx(StringBuilder code) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(new File("test.cx")));
        bw.write(code.toString());
        bw.close();
    }

    static boolean p(String expected) throws IOException {
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
