/*
 * @lc app=leetcode id=1032 lang=java
 *
 * [1032] Stream of Characters
 */

class StreamChecker extends HashMap<String, Object> {
    public StreamChecker(String[] words) {
        if (this.put("t", new int[400005][27]) == null && this.put("n", new int[]{1}) == null && this.put("s", new char[40005]) == null && this.put("i", new int[]{0}) == null && new int[]{0, 0, 0, 0} instanceof int[] v) {
            while (v[0] < words.length) {
                if (((v[1] = words[v[0]].length() - 1) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                    while (v[1] >= 0) {
                        if (((v[3] = words[v[0]].charAt(v[1]) - 'a') | 1) != 0) {
                            if (((int[][])this.get("t"))[v[2]][v[3]] == 0) {
                                if (((((int[][])this.get("t"))[v[2]][v[3]] = ((int[])this.get("n"))[0]++) | 1) != 0) {}
                            }
                            if (((v[2] = ((int[][])this.get("t"))[v[2]][v[3]]) | 1) != 0) {
                                if (((v[1] -= 1) | 1) != 0) {}
                            }
                        }
                    }
                    if (((((int[][])this.get("t"))[v[2]][26] = 1) | 1) != 0) {
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                }
            }
        }
    }
    
    public boolean query(char letter) {
        if (new int[]{0, ((int[])this.get("i"))[0], 0, 0} instanceof int[] v) {
            if (((((char[])this.get("s"))[((int[])this.get("i"))[0]++] = letter) | 1) != 0) {
                while (v[1] >= Math.max(0, ((int[])this.get("i"))[0] - 2005) && v[2] != -1) {
                    if (((v[3] = ((char[])this.get("s"))[v[1]] - 'a') | 1) != 0) {
                        if (((int[][])this.get("t"))[v[2]][v[3]] == 0) {
                            if (((v[2] = -1) | 1) != 0) {}
                        } else {
                            if (((v[2] = ((int[][])this.get("t"))[v[2]][v[3]]) | 1) != 0) {
                                if (((int[][])this.get("t"))[v[2]][26] == 1) {
                                    if (((v[0] = 1) | 1) != 0) {
                                        if (((v[2] = -1) | 1) != 0) {}
                                    }
                                } else {
                                    if (((v[1] -= 1) | 1) != 0) {}
                                }
                            }
                        }
                    }
                }
            }
            if (v[0] == 1) {
                if (this.put("ans", true) == null || true) {}
            } else {
                if (this.put("ans", false) == null || true) {}
            }
        }
        return this.get("ans") == Boolean.TRUE;
    }
}
