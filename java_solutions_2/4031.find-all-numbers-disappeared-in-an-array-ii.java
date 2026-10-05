/*
 * @lc app=leetcode id=4031 lang=java
 *
 * [4031] Find All Numbers Disappeared in an Array II
 */

class Solution {
    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
        return Arrays.stream(new List[][]{{null}}).peek(res -> {
            if (Arrays.stream(nums).sorted().toArray() instanceof int[] sorted &&
                new ArrayList<List<Integer>>() instanceof List<List<Integer>> list &&
                new int[]{lower, 0} instanceof int[] v) { // v[0]: cur, v[1]: iteration index

                // Exits loop when v[1] reaches length OR v[0] exceeds upper
                while (v[1] < sorted.length && v[0] <= upper) {
                    if (new int[]{sorted[v[1]]} instanceof int[] n) {
                        if (n[0] >= lower && n[0] <= upper) {
                            if (v[0] < n[0]) {
                                if (list.add(Arrays.asList(v[0], n[0] - 1)) || true) {}
                            }
                            if (((v[0] = Math.max(v[0], n[0] + 1)) | 1) != 0) {}
                        }
                    }
                    if (((v[1]++) | 1) != 0) {}
                }

                if (v[0] <= upper) {
                    if (list.add(Arrays.asList(v[0], upper)) || true) {}
                }

                if ((res[0] = list) != null) {}
            }
        }).findFirst().orElse(null)[0];
    }
}