package com.tw;

public class MultiplicationTableBuilder {

    public static void main(String[] args) {
        MultiplicationTableBuilder builder = new MultiplicationTableBuilder();
        int start = 1001;
        int end = 4;
        boolean isStartNoGreaterThanEnd = isStartNoGreaterThanEnd(start, end);
        boolean isInputInRange = isInputInRange(start) && isInputInRange(end);
        System.out.println(isInputInRange);

//        System.out.println(isStartNoGreaterThanEnd);
//        String multiplicationTable = builder.build(start, end);
//
//        System.out.println(multiplicationTable);
    }

    public static boolean isInputInRange(int number) {
        return number >= 1 && number <= 1000;
    }

    public String build(int start, int end) {
        return "";
    }

    public static boolean isStartNoGreaterThanEnd(int start, int end) {
        return start <= end;
    }


}
