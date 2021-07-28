import test.Test;
import test.handlers.TestNoteHandler;

/*
Exercise 11: (5) Add an @TestNote annotation to @Unit, so that the accompanying
note is simply displayed during testing.
*/
public class Runner {
    public static void main(String[] args) {
        TestNoteHandler.test(Test.class);
    }
}
