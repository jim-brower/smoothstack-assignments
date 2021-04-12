import java.util.List;
import static java.util.stream.Collectors.toList;

// For questions 2-4

class Functional {

    // question 2
    public static List<Integer> rightDigit(List<Integer> intList) {
        return intList.stream()
                .map((num) -> num % 10)
                .collect(toList());
    }

    // question 3
    public static List<Integer> doubling(List<Integer> intList) {
        return intList.stream()
                .map((num) -> num * 2)
                .collect(toList());
    }

    // question 4
    public static List<String> noX(List<String> stringList) {
        return stringList.stream()
                .map((str) -> str.replace("x", ""))
                .collect(toList());
    }
}


