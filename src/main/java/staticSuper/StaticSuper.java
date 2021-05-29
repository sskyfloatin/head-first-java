package staticSuper;

public class StaticSuper {
    static {
        System.out.println("Parent static block");
    }

    StaticSuper() {
        System.out.println("Parent constructor");
    }
}
