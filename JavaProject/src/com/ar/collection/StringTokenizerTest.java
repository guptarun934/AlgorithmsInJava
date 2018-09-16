//A String broken into pieces at space
package com.ar.collection;

import java.util.StringTokenizer;

public class StringTokenizerTest {
    public static void main (String[] args) {
        String str = "Hi, I am Arun Kumar.";
        StringTokenizer stringTokenizer = new StringTokenizer(str," ");
        System.out.println("The Token are::");
        while (stringTokenizer.hasMoreTokens()){
            String s = stringTokenizer.nextToken();
            System.out.println(s);
        }

    }
}
