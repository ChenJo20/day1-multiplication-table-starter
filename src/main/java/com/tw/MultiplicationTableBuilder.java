package com.tw;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class MultiplicationTableBuilder {

    public static void main(String[] args) {
        MultiplicationTableBuilder builder = new MultiplicationTableBuilder();
        int start = 2;
        int end = 10;

        String multiplicationTable = generateMultiplicationTable(start, end);
        System.out.println(multiplicationTable);
    }

    private static String generateMultiplicationTable(int start, int end) {
        List<String> tableLines = new ArrayList<>();
        IntStream.range(start, end + 1).forEach(rightNumber ->
                tableLines.add(generateTableLine(start, rightNumber))
        );
        return String.join(System.lineSeparator(), tableLines);
    }

    public static String generateMultiplicationExpression(int leftNumber, int rightNumber) {
        return leftNumber + "*" + rightNumber + "=" + leftNumber * rightNumber;
    }

    public static String generateTableLine(int lineStart, int lineEnd) {
        List<String> expressions = new ArrayList<>();
        IntStream.range(lineStart, lineEnd + 1)
                .forEach(leftNumber -> expressions.add(generateMultiplicationExpression(leftNumber, lineEnd)));
        return String.join(" ", expressions);
    }

    public static boolean isInputInRange(int number) {
        return number >= 1 && number <= 1000;
    }

    public String build(int start, int end) {
        boolean isStartNoGreaterThanEnd = isStartNoGreaterThanEnd(start, end);
        boolean isInputInRange = isInputInRange(start) && isInputInRange(end);
        if (!isInputInRange || !isStartNoGreaterThanEnd) {
            return null;
        }
        return generateMultiplicationTable(start, end) + System.lineSeparator();
    }

    public static boolean isStartNoGreaterThanEnd(int start, int end) {
        return start <= end;
    }


}
