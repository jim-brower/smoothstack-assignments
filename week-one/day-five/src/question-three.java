import java.util.List;
import java.util.stream.Collectors;

class FilterStrings {
    public static List<String> filterStrings(List<String> stringList) {
        return stringList.stream()
                .filter((str)->str.charAt(0) == 'a' && str.length() == 3)
                .collect(Collectors.toList());
    }
}