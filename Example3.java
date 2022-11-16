package RegEx;

import java.util.regex.Pattern;

//Character classes example
public class Example3 {

    public static void main(String[] args) {

        System.out.println(Pattern.matches("[ab]", "abcd"));
        System.out.println(Pattern.matches("[abc]", "a"));
        System.out.println(Pattern.matches("[abc]", "abcdef"));
    }
}
