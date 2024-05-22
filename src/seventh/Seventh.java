package seventh;

public class Seventh {
    public static void main(String[] args) {
        System.out.println( testString(true));
        System.out.println( testString(false));
        System.out.println( testString(null));

    }

    public static String testString(Boolean condition) {

        if (condition == null) {
            return "a";
        }

        if (!condition) {
            return "b";
        }

        return "c";
    }
}
