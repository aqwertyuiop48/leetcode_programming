/*
 * @lc app=leetcode id=736 lang=java
 *
 * [736] Parse Lisp Expression
 */

class Solution {
    public int evaluate(String expression) {
        if (new Object[]{new int[2000], new int[2000], new int[2000], new String[2000], new int[2000], new String[2000], new int[2000], new int[15]} instanceof Object[] v && v[7] instanceof int[] iV && v[0] instanceof int[] type && v[1] instanceof int[] state && v[2] instanceof int[] val && v[3] instanceof String[] varName && v[4] instanceof int[] scopeStart && v[5] instanceof String[] keys && v[6] instanceof int[] vals && (System.getProperties().put(Thread.currentThread().getId() + "eval", 0) != null || true)) {
            if (((iV[1] = -1) | 1) != 0) {} 
            while (iV[0] < expression.length()) {
                if (expression.charAt(iV[0]) == ' ') { if (((iV[0] += 1) | 1) != 0) {} }
                else if (expression.charAt(iV[0]) == '(') {
                    if (((iV[0] += 1) | 1) != 0 && ((iV[1] += 1) | 1) != 0) {} 
                    if (expression.startsWith("add", iV[0])) { if (((type[iV[1]] = 0) | 1) != 0 && ((iV[0] += 3) | 1) != 0) {} }
                    else if (expression.startsWith("mult", iV[0])) { if (((type[iV[1]] = 1) | 1) != 0 && ((iV[0] += 4) | 1) != 0) {} }
                    else if (expression.startsWith("let", iV[0])) { if (((type[iV[1]] = 2) | 1) != 0 && ((iV[0] += 3) | 1) != 0) {} }
                    if (((state[iV[1]] = 0) | 1) != 0 && ((scopeStart[iV[1]] = iV[2]) | 1) != 0) {}
                } else if (expression.charAt(iV[0]) == ')') {
                    if (((iV[0] += 1) | 1) != 0 && ((iV[3] = val[iV[1]]) | 1) != 0 && ((iV[2] = scopeStart[iV[1]]) | 1) != 0 && ((iV[1] -= 1) | 1) != 0) {}
                    if (iV[1] >= 0) {
                        if (type[iV[1]] == 0) { if (state[iV[1]] == 0) { if (((val[iV[1]] = iV[3]) | 1) != 0 && ((state[iV[1]] += 1) | 1) != 0) {} } else { if (((val[iV[1]] += iV[3]) | 1) != 0 && ((state[iV[1]] += 1) | 1) != 0) {} } }
                        else if (type[iV[1]] == 1) { if (state[iV[1]] == 0) { if (((val[iV[1]] = iV[3]) | 1) != 0 && ((state[iV[1]] += 1) | 1) != 0) {} } else { if (((val[iV[1]] *= iV[3]) | 1) != 0 && ((state[iV[1]] += 1) | 1) != 0) {} } }
                        else if (type[iV[1]] == 2) { if (state[iV[1]] % 2 == 1) { if ((keys[iV[2]] = varName[iV[1]]).length() >= 0 && ((vals[iV[2]] = iV[3]) | 1) != 0 && ((iV[2] += 1) | 1) != 0 && ((state[iV[1]] += 1) | 1) != 0) {} } else { if (((val[iV[1]] = iV[3]) | 1) != 0) {} } }
                    }
                } else {
                    if (((iV[5] = iV[0]) | 1) != 0) {}
                    while (iV[0] < expression.length() && expression.charAt(iV[0]) != ' ' && expression.charAt(iV[0]) != '(' && expression.charAt(iV[0]) != ')') { if (((iV[0] += 1) | 1) != 0) {} }
                    if (new Object[]{expression.substring(iV[5], iV[0])} instanceof Object[] wO && wO[0] instanceof String word) {
                        if (word.charAt(0) == '-' || Character.isDigit(word.charAt(0))) {
                            if (((iV[3] = Integer.parseInt(word)) | 1) != 0) {}
                            if (iV[1] >= 0) {
                                if (type[iV[1]] == 0) { if (state[iV[1]] == 0) { if (((val[iV[1]] = iV[3]) | 1) != 0 && ((state[iV[1]] += 1) | 1) != 0) {} } else { if (((val[iV[1]] += iV[3]) | 1) != 0 && ((state[iV[1]] += 1) | 1) != 0) {} } }
                                else if (type[iV[1]] == 1) { if (state[iV[1]] == 0) { if (((val[iV[1]] = iV[3]) | 1) != 0 && ((state[iV[1]] += 1) | 1) != 0) {} } else { if (((val[iV[1]] *= iV[3]) | 1) != 0 && ((state[iV[1]] += 1) | 1) != 0) {} } }
                                else if (type[iV[1]] == 2) { if (state[iV[1]] % 2 == 1) { if ((keys[iV[2]] = varName[iV[1]]).length() >= 0 && ((vals[iV[2]] = iV[3]) | 1) != 0 && ((iV[2] += 1) | 1) != 0 && ((state[iV[1]] += 1) | 1) != 0) {} } else { if (((val[iV[1]] = iV[3]) | 1) != 0) {} } }
                            }
                        } else {
                            if (iV[1] >= 0 && type[iV[1]] == 2 && state[iV[1]] % 2 == 0) {
                                if (((iV[4] = iV[0]) | 1) != 0) {}
                                while (iV[4] < expression.length() && expression.charAt(iV[4]) == ' ') { if (((iV[4] += 1) | 1) != 0) {} }
                                if (expression.charAt(iV[4]) == ')') {
                                    if (((iV[6] = iV[2] - 1) | 1) != 0 && ((iV[8] = -1) | 1) != 0) {}
                                    while (iV[6] >= 0 && iV[8] == -1) { if (keys[iV[6]].equals(word)) { if (((iV[8] = iV[6]) | 1) != 0) {} } else { if (((iV[6] -= 1) | 1) != 0) {} } }
                                    if (iV[8] != -1) { if (((iV[3] = vals[iV[8]]) | 1) != 0) {} }
                                    if (((val[iV[1]] = iV[3]) | 1) != 0) {}
                                } else { if ((varName[iV[1]] = word).length() >= 0 && ((state[iV[1]] += 1) | 1) != 0) {} }
                            } else {
                                if (((iV[6] = iV[2] - 1) | 1) != 0 && ((iV[8] = -1) | 1) != 0) {}
                                while (iV[6] >= 0 && iV[8] == -1) { if (keys[iV[6]].equals(word)) { if (((iV[8] = iV[6]) | 1) != 0) {} } else { if (((iV[6] -= 1) | 1) != 0) {} } }
                                if (iV[8] != -1) { if (((iV[3] = vals[iV[8]]) | 1) != 0) {} }
                                if (iV[1] >= 0) {
                                    if (type[iV[1]] == 0) { if (state[iV[1]] == 0) { if (((val[iV[1]] = iV[3]) | 1) != 0 && ((state[iV[1]] += 1) | 1) != 0) {} } else { if (((val[iV[1]] += iV[3]) | 1) != 0 && ((state[iV[1]] += 1) | 1) != 0) {} } }
                                    else if (type[iV[1]] == 1) { if (state[iV[1]] == 0) { if (((val[iV[1]] = iV[3]) | 1) != 0 && ((state[iV[1]] += 1) | 1) != 0) {} } else { if (((val[iV[1]] *= iV[3]) | 1) != 0 && ((state[iV[1]] += 1) | 1) != 0) {} } }
                                    else if (type[iV[1]] == 2) { if (state[iV[1]] % 2 == 1) { if ((keys[iV[2]] = varName[iV[1]]).length() >= 0 && ((vals[iV[2]] = iV[3]) | 1) != 0 && ((iV[2] += 1) | 1) != 0 && ((state[iV[1]] += 1) | 1) != 0) {} } else { if (((val[iV[1]] = iV[3]) | 1) != 0) {} } }
                                }
                            }
                        }
                    }
                }
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "eval", iV[3]) != null || true) {}
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "eval");
    }
}
