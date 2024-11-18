package com.tw;

public class MultiplicationTableBuilder {

    public static void main(String[] args) {
        MultiplicationTableBuilder builder = new MultiplicationTableBuilder();
        int start = 5;
        int end = 4;
        boolean isStartNoGreaterThanEnd = builder.isStartNoGreaterThanEnd(start, end);
        System.out.println(isStartNoGreaterThanEnd);
//        String multiplicationTable = builder.build(start, end);
//
//        System.out.println(multiplicationTable);
    }

    public String build(int start, int end) {
        return "";
    }

    public static boolean isStartNoGreaterThanEnd(int start, int end){
        return start <= end;
    }

}
