/*
 * @lc app=leetcode id=1178 lang=java
 *
 * [1178] Number of Valid Words for Each Puzzle
 */

class Solution extends ArrayList<Integer> {
    public List<Integer> findNumOfValidWords(String[] words, String[] puzzles) {
        if (new int[]{0, 0, 0, 0, 0, 0} instanceof int[] v && new Object[]{new HashMap<Integer, Integer>()} instanceof Object[] obj) {
            while (v[0] < 3) {
                if (v[0] == 0) {
                    if (v[1] < words.length) {
                        if (((v[2] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0) {
                            while (v[3] < words[v[1]].length()) {
                                if (((v[2] |= (1 << (words[v[1]].charAt(v[3]) - 'a'))) | 1) != 0 && ((v[3] += 1) | 1) != 0) {}
                            }
                            if (((Map<Integer, Integer>)obj[0]).put(v[2], ((Map<Integer, Integer>)obj[0]).getOrDefault(v[2], 0) + 1) == null || true) {
                                if (((v[1] += 1) | 1) != 0) {}
                            }
                        }
                    } else {
                        if (((v[1] = 0) | 1) != 0 && ((v[0] = 1) | 1) != 0) {}
                    }
                } else if (v[0] == 1) {
                    if (v[1] < puzzles.length) {
                        if (((v[2] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0) {
                            while (v[3] < puzzles[v[1]].length()) {
                                if (((v[2] |= (1 << (puzzles[v[1]].charAt(v[3]) - 'a'))) | 1) != 0 && ((v[3] += 1) | 1) != 0) {}
                            }
                            if (((v[4] = 0) | 1) != 0 && ((v[3] = v[2]) | 1) != 0 && ((v[5] = 1 << (puzzles[v[1]].charAt(0) - 'a')) | 1) != 0) {
                                if (((v[0] = 2) | 1) != 0) {}
                            }
                        }
                    } else {
                        if (((v[0] = 3) | 1) != 0) {}
                    }
                } else if (v[0] == 2) {
                    if ((v[3] & v[5]) == v[5] && ((Map<Integer, Integer>)obj[0]).containsKey(v[3])) {
                        if (((v[4] += ((Map<Integer, Integer>)obj[0]).get(v[3])) | 1) != 0) {}
                    }
                    if (v[3] == 0) {
                        if (this.add(v[4]) || true) {
                            if (((v[1] += 1) | 1) != 0 && ((v[0] = 1) | 1) != 0) {}
                        }
                    } else {
                        if (((v[3] = (v[3] - 1) & v[2]) | 1) != 0) {}
                    }
                }
            }
        }
        return this;
    }
}
