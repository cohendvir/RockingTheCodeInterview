package tests;

/**
 * Created by Dvir on 28/10/2015.
 */
public class Finally {

    public static void main(String[] args) {

        System.out.println(method2());
    }

    private static int method2() {
        try {
            method();
        } catch (Exception e) {
            return -1;
        }
        finally {
            System.out.println("Finally");
        }
        return 1;
    }

    private static void method() throws Exception {
        throw new Exception();
    }



}
