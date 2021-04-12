import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

class Recursion {

    /*
        Outer function, sum parameter is unused, but I wanted to adhere to the
        spec provided by the assignment.

        This function aggregates same value adjacent values in the array all
        into a list, then passes that list to a recursive function for finding
        the sum
     */
    public static boolean groupSumClump(int sum, int[] nums, int target) {
        List<Tuple> adjSummed = new ArrayList<>();
        for (int num : nums) {
            if (adjSummed.isEmpty()) {
                adjSummed.add(new Tuple(num, num));
            } else {
                Tuple prev = adjSummed.get(adjSummed.size() - 1);
                if (prev.init == num) {
                    prev.sum += num;
                } else {
                    adjSummed.add(new Tuple(num, num));
                }
            }
        }
        List<Integer> formatted =
                adjSummed.stream().map((tup) -> tup.sum).collect(toList());
        return sumRec(sum, formatted, target);
    }

    /*
        Recursive function for finding if target value can be found as the
        sum of list elements
     */
    private static boolean sumRec(int sum, List<Integer> nums, int target) {
        if (sum == target) {
            return true;
        }
        for (int i = 0; i < nums.size(); ++i) {
            List<Integer> listCurrRemoved = new ArrayList<>(nums);
            listCurrRemoved.remove(i);
            if (sumRec(sum + nums.get(i), listCurrRemoved, target)) {
                return true;
            }
        }
        return false;
    }
}

// This is a POD class used for aggregating adjacent values.
class Tuple {
    int sum, init;

    public Tuple(int sum, int init) {
        this.sum = sum;
        this.init = init;
    }
}
