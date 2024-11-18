package com.tw;

public class MultiplicationTableBuilder {

    public static void main(String[] args) {
        MultiplicationTableBuilder builder = new MultiplicationTableBuilder();
        int start = 2;
        int end = 4;
        boolean isStartNoGreaterThanEnd = isStartNoGreaterThanEnd(start, end);
        boolean isInputInRange = isInputInRange(start) && isInputInRange(end);
        String expression = generateMultiplicationExpression(1, 2);
        System.out.println(expression);
//        System.out.println(isInputInRange);
//        System.out.println(isStartNoGreaterThanEnd);
//        String multiplicationTable = builder.build(start, end);
//        System.out.println(multiplicationTable);
    }

    public static String generateMultiplicationExpression(int leftNumber, int rightNumber) {
        return leftNumber + "*" + rightNumber + "=" + leftNumber * rightNumber;
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
