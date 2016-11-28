/**
 * Created by saoprb on 11/26/2016.
 */
public class ReverseString {

    public String reverse(String text) {
        String reverseString = "";
        for (int index = text.length()-1; index >= 0; index--) {
            reverseString += text.charAt(index);
        }
        return reverseString;
    }

    public String reverseRecursive(String text, String reverseText) {
        if (text.length() == 0) {
            return reverseText;
        }
        reverseText += text.charAt(text.length()-1);
        return reverseRecursive(text.substring(0, text.length()-1), reverseText);
    }

    public static void main(String[] args) {
        ReverseString app = new ReverseString();
        String word = "Joy to the world";
        System.out.format("String %s reversed %s%n", word, app.reverse(word));
        System.out.format("String %s reversed %s%n", word, app.reverseRecursive(word, new String()));
    }
}
