package chapter1.code;

/**
 * Created by Dvir on 18/10/2015.
 */
public class Question1_5 {

    public static String compress(String str) {

        int curCount = 1;
        StringBuilder compressed = new StringBuilder();

        for (int i = 1; i < str.length(); i++) {
            char previousChar = str.charAt(i - 1);
            char currentChar = str.charAt(i);
            if (previousChar != currentChar) {
                compressed.append(previousChar).append(curCount);
                curCount = 1;
            }
            else {
                curCount++;
            }

            if ((i + 1) == str.length()) {
                compressed.append(currentChar).append(curCount);
            }
        }

        return compressed.length() >= str.length() ? str : compressed.toString();
    }
}
