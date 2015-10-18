package chapter1;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Dvir on 18/10/2015.
 */
public class Question1_1 {

    public static boolean allUnique(String string) {

        Set<Character> chars = new HashSet<Character>();

        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);

            if (chars.contains(c)) {
                return false;
            }

            chars.add(c);
        }

        return true;
    }
}
