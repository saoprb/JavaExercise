/**
 * Created by saoprb on 11/30/2016.
 */
public class ThisTest {
    private void test1(ThisTest thisTest) {
        thisTest.foo();
    }

    private static void foo() {
        System.out.println("foo");
    }

    public static void bar() {
        System.out.println("bar");
    }

    public static String barBar() {
        return "bar bar";
    }

    public void fooBar() {
        System.out.format("%s: foobar", this.getClass().getName());
    }

    public static void main(String[] args) {
        ThisTest app = new ThisTest();
        app.test1(null);
        ThisTest.bar();
        app.fooBar();
        ThisTest nullApp = null;
        System.out.println(nullApp.barBar());
    }
}
