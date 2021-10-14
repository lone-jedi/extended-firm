package test;

import employee.Employee;

public class Test {
    public void printPassed(String testId) {
        System.out.printf("\u001B[30m" + "\u001B[42m" + "TEST PASSED!" + "\u001B[0m" + "\t" + testId + "\n");
    }

    public void printFailed(String testId, String expected) {
        System.out.printf("\u001B[41m" + "TEST FAILED!" + "\u001B[0m" + "\t" + testId + " " + expected + "\n");
    }

//    public void assertEquals(String testId, Employee expected, Employee actual) {
//        if(expected == null && actual == null) {
//            printPassed(testId);
//            return;
//        }
//
//        if(expected.equals(actual)) {
//            printPassed(testId);
//            return;
//        }
//        printFailed(testId, "Expected:" + expected + " actual:" + actual);
//    }

    public void assertEquals(String testId, String expected, String actual) {
        if(expected.equals(actual)) {
            printPassed(testId);
            return;
        }
        printFailed(testId, "Expected:" + expected + " actual:" + actual);
    }

    public void assertEquals(String testId, int expected, int actual) {
        if(expected == actual) {
            printPassed(testId);
            return;
        }
        printFailed(testId, "Expected:" + expected + " actual:" + actual);
    }

    public void assertEquals(String testId, Employee expected, Employee actual) {
        if(expected.equals(actual)) {
            printPassed(testId);
            return;
        }
        printFailed(testId, "Expected:" + expected +
                "\n\t\t\t\t\t\t\t\t\tActual:" + actual);
    }

    public void assertEquals(String testId, Employee[] expected, Employee[] actual) {
        if(expected.length != actual.length) {
            printFailed(testId, "Arrays don`t have a same length");
            return;
        }

        for (int i = 0; i < expected.length; i++) {
            if(expected.equals(actual)) {
                printFailed(testId, "Index: " + i + " Expected:" + expected +
                        "\n\t\t\t\t\t\t\t\t\tActual:" + actual);
                return;
            }
        }

        printPassed(testId);
    }
}
