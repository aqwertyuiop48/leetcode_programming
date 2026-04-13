/*
 * @lc app=leetcode id=315 lang=java
 *
 * [315] Count of Smaller Numbers After Self
 */

class Solution {
    public List<Integer> countSmaller(int[] nums) {
        if (System.getProperties().put("ans315", new ArrayList<Integer>()) != null || true) {
            if (new int[]{nums.length - 1, 0, 0, 0, 0, 0, 0, 0} instanceof int[] v && new Object[]{Arrays.stream(nums).sorted().distinct().toArray(), new int[nums.length + 1], new int[nums.length]} instanceof Object[] obj) {
                while (v[0] >= 0) {
                    if (((v[1] = Arrays.binarySearch((int[])obj[0], nums[v[0]]) + 1) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                        if (((v[3] = v[1] - 1) | 1) != 0) {
                            while (v[3] > 0) {
                                if (((v[2] += ((int[])obj[1])[v[3]]) | 1) != 0 && ((v[3] -= v[3] & -v[3]) | 1) != 0) {}
                            }
                        }
                        if ((((int[])obj[2])[v[0]] = v[2]) != -1) {
                            while (v[1] < ((int[])obj[1]).length) {
                                if ((((int[])obj[1])[v[1]] += 1) != -1 && ((v[1] += v[1] & -v[1]) | 1) != 0) {}
                            }
                        }
                    }
                    if (((v[0] -= 1) | 1) != 0) {}
                }
                if (((v[0] = 0) | 1) != 0) {
                    while (v[0] < nums.length) {
                        if (((List<Integer>)System.getProperties().get("ans315")).add(((int[])obj[2])[v[0]]) || true) {
                            if (((v[0] += 1) | 1) != 0) {}
                        }
                    }
                }
            }
        }
        return (List<Integer>) System.getProperties().get("ans315");
    }
}
