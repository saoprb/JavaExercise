/**
 * Created by saoprb on 11/30/2016.
 */
public class OverloadingTest {
    public void foo(String string) {
        System.out.println("foo(String)");
    }

    public void foo(StringBuffer stringBuffer) {
        System.out.println("foo(StringBuffer)");
    }

    public static void main(String[] args) {
        OverloadingTest test = new OverloadingTest();
        test.foo("bar");
        //test.foo(null);
    }
}
