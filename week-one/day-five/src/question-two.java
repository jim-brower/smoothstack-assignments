import java.util.List;
import java.util.stream.Collectors;

class IntsToStrings {
    public static String intsToStrings(List<Integer> intList) {
        return intList.stream()
                .map(num -> ((num % 2 > 0) ? 'o' : 'e') + num.toString())
                .collect(Collectors.joining(","));
    }
}