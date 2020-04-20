package com.breakyizhan.web;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.*;

@SpringBootTest
class WebApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public static void main(String[] args) throws IOException {

        //输入流
      //  FileReader fr = new FileReader("C:\\Users\\Administrator\\Desktop\\0203\\aa.txt");
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Administrator\\Desktop\\0203\\aa.txt"));

        //输出流
       // FileWriter fw = new FileWriter("C:\\Users\\Administrator\\Desktop\\0203\\aaCopy.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Administrator\\Desktop\\0203\\aaCopy.txt"));

        char[] cha = new char[1024];
        int len;

       while ((len = fr.read(cha)) != -1){
            System.err.println(new String(cha,0,len));
       }
        bw.close();
        br.close();



    }

}
