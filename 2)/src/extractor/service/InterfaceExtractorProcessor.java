package extractor.service;
import extractor.annotations.ExtractInterface;

import java.beans.ParameterDescriptor;
import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

public class InterfaceExtractorProcessor {
    public static void extract(Class<?> c) throws IOException {
        ExtractInterface extractor = c.getAnnotation(ExtractInterface.class);
        if(extractor != null) {
            BufferedWriter writer = null;
            try {
                writer = new BufferedWriter(
                        new FileWriter("src/extractor/interfaces/"+ extractor.value() + ".java"));
                writer.write("package extractor.interfaces;\n\n");
                writer.write("public interface " + extractor.value() + " {\n");
                for(Method m : c.getDeclaredMethods()) {
                    if(!Modifier.isStatic(m.getModifiers()) && m.canAccess(c.getDeclaredConstructor().newInstance())) {
                        writer.write("      " + m.getReturnType().toString() + " " + m.getName() + "(");
                        Parameter[] p = m.getParameters();
                        for (int i = 0; i < p.length; i++) {
                            if (i != p.length - 1) {
                                writer.write(p[i].toString() + ", ");
                            }
                            else {
                                writer.write(p[i].toString());
                            }
                        }
                        writer.write(");\n");
                    }
                }
                writer.write("}");
            }
            catch(IOException ex) {
                ex.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } finally {
                if(writer != null) {
                    writer.close();
                }
            }
        }
        else {
            throw new IllegalArgumentException("*");
        }
    }
}
