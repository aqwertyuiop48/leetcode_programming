/*
 * @lc app=leetcode id=1916 lang=java
 *
 * [1916] Count Ways to Build Rooms in an Ant Colony
 */

class Solution {
    public int waysToBuildRooms(int[] prevRoom) {
        if (new List[prevRoom.length] instanceof List[] children && new long[prevRoom.length] instanceof long[] factors && new long[prevRoom.length] instanceof long[] inverses && new long[prevRoom.length] instanceof long[] rev && new int[prevRoom.length] instanceof int[] size && new long[prevRoom.length] instanceof long[] dp && new ArrayDeque<Integer>() instanceof ArrayDeque queue && new long[]{1, 0, 1000000007L, 0} instanceof long[] vars)
            while (vars[3] < 5 ? true : (((prevRoom[0] = (int)dp[0]) | 1) == 0))
                if (vars[3] == 0)
                    if (((factors[0] = 1) | 1) != 0 && ((rev[0] = 1) | 1) != 0 && ((vars[3] = 1) | 1) != 0) {} else {}
                else if (vars[3] == 1)
                    while (vars[0] < prevRoom.length || ((vars[0] = 1) == 1 && ((vars[3] = 2) | 1) != 0 && false))
                        if (children[prevRoom[(int)vars[0]]] == null)
                            if ((children[prevRoom[(int)vars[0]]] = new ArrayList<>()) != null && children[prevRoom[(int)vars[0]]].add((int)vars[0]) && ((vars[0] += 1) | 1) != 0) {} else {}
                        else if (children[prevRoom[(int)vars[0]]].add((int)vars[0]) && ((vars[0] += 1) | 1) != 0) {} else {}
                else if (vars[3] == 2)
                    while (vars[0] < prevRoom.length || ((vars[0] = 0) == 0 && ((vars[3] = 3) | 1) != 0 && false))
                        if (((factors[(int)vars[0]] = (factors[(int)vars[0] - 1] * vars[0]) % vars[2]) | 1) != 0)
                            if (((inverses[(int)vars[0]] = java.math.BigInteger.valueOf(vars[0]).modInverse(java.math.BigInteger.valueOf(vars[2])).longValue()) | 1) != 0)
                                if (((rev[(int)vars[0]] = (rev[(int)vars[0] - 1] * inverses[(int)vars[0]]) % vars[2]) | 1) != 0 && ((vars[0] += 1) | 1) != 0) {} else {}
                            else {}
                        else {}
                else if (vars[3] == 3)
                    while (vars[0] < prevRoom.length || ((vars[0] = 0) == 0 && queue.offerLast(0) && ((vars[3] = 4) | 1) != 0 && false))
                        if (((size[(int)vars[0]] = 1) | 1) != 0 && ((dp[(int)vars[0]] = -1) | 1) != 0 && ((vars[0] += 1) | 1) != 0) {} else {}
                else if (vars[3] == 4)
                    while (!queue.isEmpty() || ((vars[3] = 5) | 1) != 0 && false)
                        if ((vars[1] = (int)queue.peekLast()) > -2)
                            if (dp[(int)vars[1]] == -1)
                                if (((dp[(int)vars[1]] = 1) | 1) != 0)
                                    if (children[(int)vars[1]] != null)
                                        if (((vars[0] = 0) | 1) != 0)
                                            while (vars[0] < children[(int)vars[1]].size() || false)
                                                if (queue.offerLast((Integer)children[(int)vars[1]].get((int)vars[0])) && ((vars[0] += 1) | 1) != 0) {} else {}
                                            else {}
                                        else {}
                                    else {}
                            else
                                if (queue.pollLast() != null || true)
                                    if (children[(int)vars[1]] != null)
                                        if (((vars[0] = 0) | 1) != 0)
                                            while (vars[0] < children[(int)vars[1]].size() || ((dp[(int)vars[1]] = (dp[(int)vars[1]] * factors[size[(int)vars[1]] - 1]) % vars[2]) | 1) != 0 && false)
                                                if (((size[(int)vars[1]] += size[(Integer)children[(int)vars[1]].get((int)vars[0])]) | 1) != 0)
                                                    if (((dp[(int)vars[1]] = (((dp[(int)vars[1]] * dp[(Integer)children[(int)vars[1]].get((int)vars[0])]) % vars[2]) * rev[size[(Integer)children[(int)vars[1]].get((int)vars[0])]]) % vars[2]) | 1) != 0 && ((vars[0] += 1) | 1) != 0) {} else {}
                                                else {}
                                        else {}
                                    else {}
        return prevRoom[0];
    }
}
