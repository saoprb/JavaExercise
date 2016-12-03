/**
 * Created by saoprb on 11/30/2016.
 */
public class StringTest {

    private void test1() {
        String a = "A";
        String b = new String("A");
        String c = "A";
        String d = b.intern();

        System.out.println("a.equals(b): " + a.equals(b));
        System.out.println("a == b: " + (a == b));

        System.out.println("a.equals(c): " + a.equals(c));
        System.out.println("a == b: " + (a == c));

        System.out.println("a.equals(d): " + a.equals(d));
        System.out.println("a == d: " + (a == d));

        String abcString = new String("abc");
        StringBuffer abcBuffer = new StringBuffer();
        abcBuffer.append("abc");

        System.out.println("abcString.equals(abcBuffer): " + abcString.equals(abcBuffer));
        System.out.println("abcString.equals(abcBuffer.toString()): " + abcString.equals(abcBuffer.toString()));
    }

    public static void main(String[] args) {
        StringTest app = new StringTest();
        app.test1();
    }
}
