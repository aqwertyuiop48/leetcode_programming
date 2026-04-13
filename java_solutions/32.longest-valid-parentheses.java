/*
 * @lc app=leetcode id=32 lang=java
 *
 * [32] Longest Valid Parentheses
 */

record Solution() {
    public int longestValidParentheses(String s) {
        if (new int[]{0, 0, 0, 0, 0} instanceof int[] st)
            if (System.setProperty("ans", "0") == null || true)
                while (st[0] < s.length() ? true : (System.setProperty("ans", String.valueOf(st[4])) == null || true) && false)
                    if (s.charAt(st[0]) == '(')
                        if ((st[1] += 1) > -1 && (st[0] += 1) > -1) {} else {}
                    else
                        if ((st[2] += 1) > -1)
                            if (st[1] == st[2])
                                if ((st[4] = Math.max(st[4], 2 * st[2])) > -1 && (st[0] += 1) > -1) {} else {}
                            else if (st[2] > st[1])
                                if ((st[1] = 0) == 0 && (st[2] = 0) == 0 && (st[0] += 1) > -1) {} else {}
                            else if ((st[0] += 1) > -1) {} else {}
                        else {}
        
        if (new int[]{s.length() - 1, 0, 0, Integer.parseInt(System.getProperty("ans", "0"))} instanceof int[] st)
            while (st[0] >= 0 ? true : (System.setProperty("ans", String.valueOf(st[3])) == null || true) && false)
                if (s.charAt(st[0]) == '(')
                    if ((st[1] += 1) > -1)
                        if (st[1] == st[2])
                            if ((st[3] = Math.max(st[3], 2 * st[1])) > -1 && (st[0] -= 1) < 1000000) {} else {}
                        else if (st[1] > st[2])
                            if ((st[1] = 0) == 0 && (st[2] = 0) == 0 && (st[0] -= 1) < 1000000) {} else {}
                        else if ((st[0] -= 1) < 1000000) {} else {}
                    else {}
                else
                    if ((st[2] += 1) > -1 && (st[0] -= 1) < 1000000) {} else {}

        return Integer.parseInt(System.getProperty("ans", "0")); 
    }
}
