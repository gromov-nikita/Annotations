package test.handlers;
import test.Test;
import test.annotations.TestNote;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestNoteHandler {
    public static void test(Class<?> testClass) {
        Method[] methods = testClass.getMethods();
        for(Method m : methods) {
            if(m.isAnnotationPresent(TestNote.class)) {
                TestNote test = m.getAnnotation(TestNote.class);
                try {
                    System.out.println("TestNote " + m.invoke(testClass.getDeclaredConstructor().newInstance(),
                            new Object[]{4, 5}));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
