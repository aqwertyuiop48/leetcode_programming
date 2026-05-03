/*
 * @lc app=leetcode id=3127 lang=java
 *
 * [3127] Make a Square with the Same Color
 */

class Solution {
    public boolean canMakeSquare(char[][] grid) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "cms", false) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < 2 && !(boolean)System.getProperties().get(Thread.currentThread().getId() + "cms")) {
                    if (((v[1] = 0) | 1) != 0) {
                        while (v[1] < 2 && !(boolean)System.getProperties().get(Thread.currentThread().getId() + "cms")) {
                            if (((v[2] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0) {
                                if (grid[v[0]][v[1]] == 'B') { if (((v[2] += 1) | 1) != 0) {} } else { if (((v[3] += 1) | 1) != 0) {} }
                                if (grid[v[0]+1][v[1]] == 'B') { if (((v[2] += 1) | 1) != 0) {} } else { if (((v[3] += 1) | 1) != 0) {} }
                                if (grid[v[0]][v[1]+1] == 'B') { if (((v[2] += 1) | 1) != 0) {} } else { if (((v[3] += 1) | 1) != 0) {} }
                                if (grid[v[0]+1][v[1]+1] == 'B') { if (((v[2] += 1) | 1) != 0) {} } else { if (((v[3] += 1) | 1) != 0) {} }
                                if (v[2] >= 3 || v[3] >= 3) {
                                    if (System.getProperties().put(Thread.currentThread().getId() + "cms", true) != null | true) {}
                                }
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (boolean) System.getProperties().get(Thread.currentThread().getId() + "cms");
    }
}
