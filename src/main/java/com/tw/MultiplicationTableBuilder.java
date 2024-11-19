package com.tw;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MultiplicationTableBuilder {

    public static int MIN_RANGE = 1;
    public static int MAX_RANGE = 1000;
    public static String BLACK_SPACE = " ";

    public static void main(String[] args) {
        MultiplicationTableBuilder builder = new MultiplicationTableBuilder();
        int start = 2;
        int end = 10;

        String multiplicationTable = generateMultiplicationTable(start, end);
        System.out.println(multiplicationTable);
    }

    private static String generateMultiplicationTable(int start, int end) {
        return String.format("%s%s", IntStream.rangeClosed(start, end)
                .mapToObj(rightNumber -> generateTableLine(start, rightNumber))
                .collect(Collectors.joining(System.lineSeparator())), System.lineSeparator());
    }

    public static String generateMultiplicationExpression(int leftNumber, int rightNumber) {
        return String.format("%s*%s=%s", leftNumber, rightNumber, leftNumber * rightNumber);
    }

    public static String generateTableLine(int lineStart, int lineEnd) {
        return IntStream.rangeClosed(lineStart, lineEnd)
                .mapToObj(leftNumber -> generateMultiplicationExpression(leftNumber, lineEnd))
                .collect(Collectors.joining(BLACK_SPACE));
    }

    public static boolean isInputInRange(int number) {
        return number >= MIN_RANGE && number <= MAX_RANGE;
    }

    public String build(int start, int end) {
        boolean isStartNoGreaterThanEnd = isStartNoGreaterThanEnd(start, end);
        boolean isInputInRange = isInputInRange(start) && isInputInRange(end);
        if (!isInputInRange || !isStartNoGreaterThanEnd) {
            return null;
        }
        return generateMultiplicationTable(start, end);
    }

    public static boolean isStartNoGreaterThanEnd(int start, int end) {
        return start <= end;
    }


}
