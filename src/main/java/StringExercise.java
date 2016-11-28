/**
 * Created by saoprb on 11/26/2016.
 */
public class StringExercise {

    public String replace(String text, Character original, Character replace) {
        StringBuilder newString = new StringBuilder();
        for (int index = 0; index < text.length(); index++) {
            if (original.equals(text.charAt(index))) {
                newString.append(replace);
            } else {
                newString.append(text.charAt(index));
            }
        }
        return newString.toString();
    }

    public String replaceRecursive(String text, Character original, Character replace) {
        return replaceRecursive(text, original, replace, new String());
    }

    public String replaceRecursive(String text, Character original, Character replace, String newText) {
        if (0 == text.length()) {
            return newText;
        }
        if (original.equals(text.charAt(0))) {
            newText += replace;
        } else {
            newText += text.charAt(0);
        }
        return replaceRecursive(text.substring(1, text.length()), original, replace, newText);
    }

    public static void main(String[] args) {
        final String test = "The quick brown fox jumps over the lazy dog";
        final StringExercise app = new StringExercise();

        System.out.format("%s %s%n",test, app.replace(test,'o','T'));
        System.out.format("%s %s%n",test, app.replaceRecursive(test,'o','T'));
    }
}
