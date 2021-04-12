import java.util.List;
import static java.util.stream.Collectors.toList;

// For questions 2-4

class Functional {

    // question 2
    // params: A list of integers
    // return: a new list of integers with only the 10s place digit of the old integers
    public static List<Integer> rightDigit(List<Integer> intList) {
        return intList.stream()
                .map((num) -> num % 10)
                .collect(toList());
    }

    // question 3
    // params: a list of integers
    // return: a new list of integers with all initial values doubled
    public static List<Integer> doubling(List<Integer> intList) {
        return intList.stream()
                .map((num) -> num * 2)
                .collect(toList());
    }

    // question 4
    // params: a list of strings
    // return: a new list of strings with all 'x' characters removed from initial strings
    public static List<String> noX(List<String> stringList) {
        return stringList.stream()
                .map((str) -> str.replace("x", ""))
                .collect(toList());
    }
}


