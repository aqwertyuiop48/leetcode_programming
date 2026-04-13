/*
 * @lc app=leetcode id=1553 lang=java
 *
 * [1553] Minimum Number of Days to Eat N Oranges
 */

class Solution {
    public int minDays(int n) {
        return Arrays.stream(new int[][]{new int[]{0}}).peek(res -> {
            if (new Object[]{new PriorityQueue<int[]>((a, b) -> Integer.compare(a[0], b[0])), new HashSet<Integer>(), new int[]{0, 0, n}, null} instanceof Object[] st && st[0] instanceof PriorityQueue pq && st[1] instanceof HashSet vis && st[2] instanceof int[] v) {
                if (pq.offer(new int[]{0, n}) || true) {
                    while (!pq.isEmpty() && ((int[])pq.peek())[0] < v[2]) {
                        if (((st[3] = pq.poll()) != null) && ((v[0] = ((int[])st[3])[0]) | 1) != 0 && ((v[1] = ((int[])st[3])[1]) | 1) != 0) {
                            if (((v[2] = Math.min(v[2], v[0] + v[1])) | 1) != 0 && vis.add(v[1])) {
                                if (pq.offer(new int[]{v[0] + 1 + v[1] % 2, v[1] / 2}) || true) {}
                                if (pq.offer(new int[]{v[0] + 1 + v[1] % 3, v[1] / 3}) || true) {}
                            }
                        }
                    }
                    if (((res[0] = v[2]) | 1) != 0) {}
                }
            }
        }).findFirst().orElse(null)[0];
    }
}
