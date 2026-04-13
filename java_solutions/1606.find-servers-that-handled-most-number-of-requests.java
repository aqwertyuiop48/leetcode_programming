/*
 * @lc app=leetcode id=1606 lang=java
 *
 * [1606] Find Servers That Handled Most Number of Requests
 */

class Solution {
    public List<Integer> busiestServers(int k, int[] arrival, int[] load) {
        return Arrays.stream(new int[][]{new int[k + 1]}).peek(res -> {
            if (new int[]{0, 0, 0, 0, 0} instanceof int[] v && new int[k] instanceof int[] reqs && new TreeSet<Integer>() instanceof TreeSet free && new PriorityQueue<int[]>((a, b) -> Integer.compare(a[0], b[0])) instanceof PriorityQueue busy) {
                while (v[0] < 4) {
                    if (v[0] == 0) {
                        if (v[1] < k) {
                            if (free.add(v[1]) && ((v[1] += 1) | 1) != 0) {}
                        } else {
                            if (((v[0] = 1) | 1) != 0 && ((v[1] = 0) | 1) != 0) {}
                        }
                    } else if (v[0] == 1) {
                        if (v[1] < arrival.length) {
                            while (!busy.isEmpty() && ((int[])busy.peek())[0] <= arrival[v[1]]) {
                                if (free.add(((int[])busy.poll())[1])) {}
                            }
                            if (!free.isEmpty()) {
                                if (((v[2] = free.ceiling(v[1] % k) != null ? (int)free.ceiling(v[1] % k) : (int)free.first()) | 1) != 0) {
                                    if (free.remove(v[2]) && busy.offer(new int[]{arrival[v[1]] + load[v[1]], v[2]}) && ((reqs[v[2]] += 1) | 1) != 0 && ((v[3] = Math.max(v[3], reqs[v[2]])) | 1) != 0) {}
                                }
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        } else {
                            if (((v[0] = 2) | 1) != 0 && ((v[1] = 0) | 1) != 0) {}
                        }
                    } else if (v[0] == 2) {
                        if (v[1] < k) {
                            if (reqs[v[1]] == v[3]) {
                                if (((res[v[4]] = v[1]) | 1) != 0 && ((v[4] += 1) | 1) != 0) {}
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        } else {
                            if (((res[k] = v[4]) | 1) != 0 && ((v[0] = 10) | 1) != 0) {}
                        }
                    }
                }
            }
        }).map(res -> Arrays.stream(res).limit(res[k]).boxed().toList()).findFirst().orElse(null);
    }
}
