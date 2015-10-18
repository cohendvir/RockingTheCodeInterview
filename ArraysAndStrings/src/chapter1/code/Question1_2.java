package chapter1.code;

/**
 * Created by Dvir on 18/10/2015.
 */
public class Question1_2 {

    public static String reverst(String string) {

        StringBuilder sb = new StringBuilder();

        for (int i = string.length() - 1; i >= 0; i--) {
            sb.append(string.charAt(i));
        }

        return sb.toString();
    }
}
