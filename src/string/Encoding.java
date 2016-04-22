package string;

import java.text.Normalizer;

/**
 * Created by redr on 22/04/2016.
 */
public class Encoding {
    public static void main(String[] args) {
        String LEFT_ANGLE_BRACKET = "〈"; // U+3008
        String LEFT_SINGLE_QUOTE = "‹"; // U+2039
        String LEFT_POINTING_BRAKET = "〈"; // U+2329
        String MATH_LEFT_BRACKET = "⟨"; // U+27E8

        String SMALL_LESS_THAN_SIGN = "﹤"; // U+FE64
        String SMALL_GREATER_THAN_SIGN = "﹥"; // U+FE65

        System.out.println(Normalizer.normalize(LEFT_ANGLE_BRACKET, Normalizer.Form.NFC).equals("<"));
        System.out.println(LEFT_ANGLE_BRACKET.equals("<"));
        System.out.println(LEFT_SINGLE_QUOTE.equals("<"));
        System.out.println(LEFT_POINTING_BRAKET.equals("<"));
        System.out.println(MATH_LEFT_BRACKET.equals("<"));
        System.out.println(SMALL_LESS_THAN_SIGN.equals("<"));

        System.out.println(Normalizer.normalize(SMALL_LESS_THAN_SIGN, Normalizer.Form.NFKC).equals("<"));
        System.out.println(Normalizer.normalize(MATH_LEFT_BRACKET, Normalizer.Form.NFKC).equals("<"));
    }
}
