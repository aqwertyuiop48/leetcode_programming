/*
 * @lc app=leetcode id=1675 lang=java
 *
 * [1675] Minimize Deviation in Array
 */

class Solution {
    public int minimumDeviation(int[] nums) {
        return Arrays.stream(new int[][]{new int[1]}).peek(res -> {
            if (new int[]{0, Integer.MAX_VALUE, Integer.MAX_VALUE, 0} instanceof int[] v && new PriorityQueue<Integer>((a, b) -> Integer.compare(b, a)) instanceof PriorityQueue pq) {
                while (v[0] < 2) {
                    if (v[0] == 0) {
                        if (v[3] < nums.length) {
                            if (((nums[v[3]] = nums[v[3]] % 2 == 1 ? nums[v[3]] * 2 : nums[v[3]]) | 1) != 0 && (pq.offer(nums[v[3]]) || true) && ((v[1] = Math.min(v[1], nums[v[3]])) | 1) != 0 && ((v[3] += 1) | 1) != 0) {}
                        } else {
                            if (((v[0] = 1) | 1) != 0) {}
                        }
                    } else if (v[0] == 1) {
                        if (((v[3] = (int)pq.poll()) | 1) != 0 && ((v[2] = Math.min(v[2], v[3] - v[1])) | 1) != 0) {
                            if (v[3] % 2 == 1) {
                                if (((res[0] = v[2]) | 1) != 0 && ((v[0] = 2) | 1) != 0) {}
                            } else {
                                if (((v[3] = v[3] / 2) | 1) != 0 && ((v[1] = Math.min(v[1], v[3])) | 1) != 0 && (pq.offer(v[3]) || true)) {}
                            }
                        }
                    }
                }
            }
        }).findFirst().orElse(null)[0];
    }
}
