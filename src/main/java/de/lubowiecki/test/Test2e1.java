package de.lubowiecki.test;

public class Test2e1 {

    public static String stringTest (String s){
        return s.replace('h', 's');
    }

    public static void stringBuilderTest (StringBuilder s) {
        s.append("o");
    }

    public static void main(String[] args){
        String s = "hell";
        StringBuilder sb = new StringBuilder("well");
        s = stringTest(s);
        stringBuilderTest(sb);
        System.out.println(s + sb);
    }
}
