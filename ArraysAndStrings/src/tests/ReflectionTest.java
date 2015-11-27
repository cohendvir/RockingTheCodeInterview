package tests;

/**
 * Created by Dvir on 02/11/2015.
 */
public class ReflectionTest<T> {

    private T field;

    public void printFld() throws NoSuchFieldException {
        System.out.println(getClass().getDeclaredField("field").getType());
    }

    public static void main(String[] args) throws NoSuchFieldException {

        new ReflectionTest<String>().printFld();
        new ReflectionTest<Integer>().printFld();
    }
}
