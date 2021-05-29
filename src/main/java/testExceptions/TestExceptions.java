package testExceptions;

import com.sun.org.apache.xerces.internal.impl.dv.xs.SchemaDateTimeException;

public class TestExceptions {
    public static void main(String[] args) {
        String test = "yes";
        try {
            System.out.println("try");
            doRisky(test);
            System.out.println("End");
        }
        catch (SchemaDateTimeException se) {
            System.out.println("Exception");
        } finally {
            System.out.println("finally");
        }
        System.out.println("End main");
    }

    static void doRisky(String test) throws SchemaDateTimeException {
        System.out.println("Start");
        if("yes".equals(test)) {
            throw new SchemaDateTimeException();
        }
        System.out.println("The end");
        return;
    }
}
