/*
 * @lc app=leetcode id=4031 lang=java
 *
 * [4031] Find All Numbers Disappeared in an Array II
 */

class Solution {
    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
        int[] sorted = Arrays.stream(nums)
                             .filter(n -> n >= lower && n <= upper)
                             .distinct()
                             .sorted()
                             .toArray();

        // Accumulate missing ranges: record state is (current_lower_bound, result_list)
        return Arrays.stream(sorted)
                .boxed()
                .reduce(
                    new AbstractMap.SimpleEntry<>(lower, new ArrayList<List<Integer>>()),
                    (acc, num) -> {
                        if (acc.getKey() < num) {
                            acc.getValue().add(Arrays.asList(acc.getKey(), num - 1));
                        }
                        return new AbstractMap.SimpleEntry<>(Math.max(acc.getKey(), num + 1), acc.getValue());
                    },
                    (a, b) -> a
                )
                .map(finalAcc -> {
                    if (finalAcc.getKey() <= upper) {
                        finalAcc.getValue().add(Arrays.asList(finalAcc.getKey(), upper));
                    }
                    return finalAcc.getValue();
                });
    }
}
