package string;

import java.util.Locale;

/**
 * Created by redr on 22/04/2016.
 */
public class LocaleBeware {
    static {
        Locale.setDefault(Locale.forLanguageTag("tr"));
    }
    public static void main(String[] args) {
        String userInput = "<script>";
        System.out.println(userInput.toUpperCase().equals("<SCRIPT>"));
        System.out.println(userInput.toUpperCase());
    }
}
