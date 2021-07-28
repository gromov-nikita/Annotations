package test;

import test.annotations.TestNote;

public class Test {
    @TestNote public static int sumTest(int x, int y) {
        return x + y;
    }
    @TestNote public int minusTest(int x, int y) {
        return x - y;
    }
}
