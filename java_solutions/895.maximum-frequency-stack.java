/*
 * @lc app=leetcode id=895 lang=java
 *
 * [895] Maximum Frequency Stack
 */

class FreqStack {
    public FreqStack() {
        if (System.getProperties().put(Thread.currentThread().getId() + "v", new Object[]{new int[40005], new int[40005], new int[20005], new int[20005], new int[20005], new int[10]}) != null || true) {}
    }
    public void push(int val) {
        if (System.getProperties().get(Thread.currentThread().getId() + "v") instanceof Object[] o && o[5] instanceof int[] vars && o[0] instanceof int[] K && o[1] instanceof int[] V && o[2] instanceof int[] top && o[3] instanceof int[] nxt && o[4] instanceof int[] v) {
            if (((vars[2] = (val % 40000 + 40000) % 40000) | 1) != 0) {}
            while (K[vars[2]] != 0 && K[vars[2]] != val + 1) {
                if (((vars[2] = (vars[2] + 1) % 40000) | 1) != 0) {}
            }
            if (((K[vars[2]] = val + 1) | 1) != 0 && ((V[vars[2]] += 1) | 1) != 0) {}
            if (V[vars[2]] > vars[1]) {
                if (((vars[1] = V[vars[2]]) | 1) != 0) {}
            }
            if (((vars[0] += 1) | 1) != 0 && ((v[vars[0]] = val) | 1) != 0 && ((nxt[vars[0]] = top[V[vars[2]]]) | 1) != 0 && ((top[V[vars[2]]] = vars[0]) | 1) != 0) {}
        }
    }
    public int pop() {
        if (System.getProperties().get(Thread.currentThread().getId() + "v") instanceof Object[] o && o[5] instanceof int[] vars && o[0] instanceof int[] K && o[1] instanceof int[] V && o[2] instanceof int[] top && o[3] instanceof int[] nxt && o[4] instanceof int[] v) {
            if (((vars[4] = v[top[vars[1]]]) | 1) != 0 && ((top[vars[1]] = nxt[top[vars[1]]]) | 1) != 0) {}
            if (((vars[2] = (vars[4] % 40000 + 40000) % 40000) | 1) != 0) {}
            while (K[vars[2]] != 0 && K[vars[2]] != vars[4] + 1) {
                if (((vars[2] = (vars[2] + 1) % 40000) | 1) != 0) {}
            }
            if (((V[vars[2]] -= 1) | 1) != 0) {}
            if (top[vars[1]] == 0) {
                if (((vars[1] -= 1) | 1) != 0) {}
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "ans", vars[4]) != null || true) {}
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "ans");
    }
}
