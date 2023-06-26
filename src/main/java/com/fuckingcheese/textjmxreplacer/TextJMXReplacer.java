/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.fuckingcheese.textjmxreplacer;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;

/**
 *
 * @author kubasya
 */
public class TextJMXReplacer {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        //replaceSelected("C:\\TEST SOFT\\OfficialMemoHars\\ToTextReplacer\\Saved\\"+"$FiNality$"+".jmx");
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReplacerApp().setVisible(true);
            }
        });
    }

//    public static void replaceSelected(String path,String inpath,String name) {
//        try {
//            // input the file content to the StringBuffer "input"
//            BufferedReader file = new BufferedReader(new FileReader(path));
//            StringBuffer inputBuffer = new StringBuffer();
//            String line;
//
//            while ((line = file.readLine()) != null) {
//                inputBuffer.append(line);
//                inputBuffer.append('\n');
//            }
//            file.close();
//            String inputStr = inputBuffer.toString();
//
//            System.out.println(inputStr); // display the original file for debugging
//
//            // logic to replace lines in the string (could use regex here to be generic)
//            /*if (type.equals("0")) {
//                inputStr = inputStr.replace(replaceWith + "1", replaceWith + "0");
//            } else if (type.equals("1")) {
//                inputStr = inputStr.replace(replaceWith + "0", replaceWith + "1");
//            }*/
//            inputStr = replaceRows(inputStr);
//
//            // display the new file for debugging
//            System.out.println("----------------------------------\n");
//
//            // write the new string with the replaced line OVER the same file
//            FileOutputStream fileOut = new FileOutputStream(inpath+"$"+name+"$.jmx");
//            fileOut.write(inputStr.getBytes());
//            fileOut.close();
//
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    }

//    public static String replaceRows(String s) {
//        if (s.contains("<stringProp name=\"Header.value\">192.168.140.16</stringProp>")) {
//            s = s.replaceAll("<stringProp name=\"Header.value\">192.168.140.16</stringProp>", "<stringProp name=\"Header.value\">\\${host}</stringProp>");
//            System.out.println("url has replaced");
//        }
//
//        if (s.contains("<stringProp name=\"HTTPSampler.domain\">192.168.140.16</stringProp>")) {
//            s = s.replaceAll("<stringProp name=\"HTTPSampler.domain\">192.168.140.16</stringProp>", "<stringProp name=\"HTTPSampler.domain\">\\${host}</stringProp>");
//            System.out.println("host has replaced");
//        }
//
//        if (s.contains("<stringProp name=\"HTTPSampler.port\"></stringProp>")) {
//            s = s.replaceAll("<stringProp name=\"HTTPSampler.port\"></stringProp>", "<stringProp name=\"HTTPSampler.port\">\\${port}</stringProp>");
//            System.out.println("port has replaced");
//        }
//
//        if (s.contains("<stringProp name=\"HTTPSampler.protocol\">https</stringProp>")) {
//            s = s.replaceAll("<stringProp name=\"HTTPSampler.protocol\">https</stringProp>", "<stringProp name=\"HTTPSampler.protocol\">\\${protocol}</stringProp>");
//            System.out.println("protocol has replaced");
//        }
//        if (s.contains("<stringProp name=\"HTTPSampler.contentEncoding\"></stringProp>")) {
//            s = s.replaceAll("<stringProp name=\"HTTPSampler.contentEncoding\"></stringProp>", "<stringProp name=\"HTTPSampler.contentEncoding\">utf-8</stringProp>");
//            System.out.println("encoding has replaced");
//        }
//
//        if (s.contains("<stringProp name=\"HTTPSampler.path\">loadtest")) {
//            s = s.replaceAll("<stringProp name=\"HTTPSampler.path\">loadtest", "<stringProp name=\"HTTPSampler.path\">\\${appName}");
//            System.out.println("path has replaced");
//        }
//
//        if (s.contains("<stringProp name=\"Header.value\">&lt;session id=&quot;")) {
//            s = s.replaceAll("(?s)<stringProp name=\"Header.value\">&lt;session id=&quot;.{1,183}", "<stringProp name=\"Header.value\">&lt;\\${Tessa-Session}/&gt;</stringProp>");
//            System.out.println("session has replaced");
//        }
//
//        return s;
//    }
}
