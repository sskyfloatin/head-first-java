package testExceptions;
class MyEx2 extends Exception {}

public class ExTestDrive2 {

    public static void main(String[]args){
        String test = args[0];
        try {
            System.out.println("t");
            doRisky(test);
            System.out.print("o");

        } catch (MyEx2 ex2) {
            System.out.print("a");
        } finally {
            System.out.print("w");
        }
        System.out.print("s");
    }

        static void doRisky(String t) throws MyEx2 {
            System.out.print("h");
            if("yes".equals(t)) {
                throw new MyEx2();
            }
            System.out.print("r");
        }
}
