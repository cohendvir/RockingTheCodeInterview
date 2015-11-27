package tests;

/**
 * Created by Dvir on 28/10/2015.
 */
public class NotNull {
    public static void main(String[] args) {

        if (method() != null) {

        }
    }

    @com.sun.istack.internal.NotNull
    private static Object method() {
        return 1;
    }


}
