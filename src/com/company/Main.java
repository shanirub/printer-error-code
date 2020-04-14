package com.company;

public class Main {

    public static String errorcode(String code) {
        long numOfErrors = code.chars().filter(c -> c >= 97 && c <=109).count();

        return ( String.valueOf(numOfErrors) + "/" + code.length());
    }

    public static void main(String[] args) {

        String s = "amamamamam";

        System.out.println(s + " returns: " + errorcode(s));

        s = "mmxx";
        System.out.println(s + " returns: " + errorcode(s));


    }
}
