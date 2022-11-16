package RegEx;

import java.util.regex.Pattern;

//Regular expression. .(dot) represents a single character
public class Example2 {

    public static void main(String[] args) {

        System.out.println(Pattern.matches(".p", "ap"));
        System.out.println(Pattern.matches(".a", "st"));
        System.out.println(Pattern.matches(".w", "lwr"));
        System.out.println(Pattern.matches("..k", "lok"));
    }
}
