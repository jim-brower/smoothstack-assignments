import java.util.Arrays;

class LambdaExamples {
    private static final String[] words = {"efg", "cd", "b", "astart", "estart"};

    static String[] sortByLength() {
        String[] words = LambdaExamples.words.clone();
        Arrays.sort(words, (w1, w2) -> w1.length() - w2.length());
        return words;
    }

    static String[] sortByReverseLength() {
        String[] words = LambdaExamples.words.clone();
        Arrays.sort(words, (w1, w2) -> w2.length() - w1.length());
        return words;
    }

    static String[] sortByFirstChar() {
        String[] words = LambdaExamples.words.clone();
        Arrays.sort(words, (w1, w2) -> w1.charAt(0) - w2.charAt(0));
        Arrays.stream(words).forEach((word) -> System.out.print(word + " "));
        return words;
    }

    static String[] sortByEChar() {
        String[] words = LambdaExamples.words.clone();
        Arrays.sort(words, (w1, w2) -> {
            int v1 = w1.charAt(0) == 'e' ? -1 : 1;
            int v2 = w2.charAt(0) == 'e' ? -1 : 1;
            return v1 - v2;
        });
        Arrays.stream(words).forEach((word) -> System.out.print(word + " "));
        return words;
    }

    static String[] sortByECharHelper() {
        String[] words = LambdaExamples.words.clone();
        Arrays.sort(words, (w1, w2) -> Utils.helper(w1, w2));
        Arrays.stream(words).forEach((word) -> System.out.print(word + " "));
        return words;
    }


}

class Utils {
    public static int helper(String l, String r) {
        int v1 = l.charAt(0) == 'e' ? -1 : 1;
        int v2 = r.charAt(0) == 'e' ? -1 : 1;
        return v1 - v2;
    }
}
