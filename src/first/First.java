package first;

import java.util.*;
import java.util.regex.Pattern;

public class First {
    public static void main(String[] args) {
        Map<String, Boolean> patterToCheck = new HashMap<>();

        patterToCheck.put("damages", true);
        patterToCheck.put("no damage", false);
        patterToCheck.put("minor damages",true);
        patterToCheck.put("heavy damage", true);

        patterToCheck.forEach(((s, aBoolean) -> runTest(s,aBoolean)));
    }

    private static void runTest(String value, boolean expected) {
        Pattern regex = Pattern.compile("^(?!no)(\\w*)(\\s?)damage(s?)$");
        boolean match = regex.matcher(value).matches();
        String result = expected == match ? "successfully" : "unsuccessfully";
        System.out.println("Test '" + value + "' ran " + result);
    }


}