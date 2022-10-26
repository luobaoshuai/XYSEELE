package com.xy.seele.application.test;

import org.junit.Test;

import java.io.*;

public class test1 {
    @Test
    public void Io() throws IOException {
        File file = new File("D:\\Users\\Desktop\\新建文本文档.txt");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), "UTF-8");
        char[] buf = new char[1024];
        outputStreamWriter.write(buf);
        outputStreamWriter.close();
    }
}
