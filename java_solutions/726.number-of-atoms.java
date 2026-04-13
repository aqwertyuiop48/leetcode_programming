/*
 * @lc app=leetcode id=726 lang=java
 *
 * [726] Number of Atoms
 */

class Solution {
    public String countOfAtoms(String formula) {
        if (new Object[]{new String[1005], new int[1005], new int[1005], new int[15], new String[]{""}} instanceof Object[] v && v[3] instanceof int[] iV && v[0] instanceof String[] names && v[1] instanceof int[] counts && v[2] instanceof int[] mStack && v[4] instanceof String[] ans && (System.getProperties().put(Thread.currentThread().getId() + "noa", "") != null || true)) {
            if (((iV[0] = formula.length() - 1) | 1) != 0 && ((iV[1] = 1) | 1) != 0 && ((iV[2] = 0) | 1) != 0 && ((iV[5] = 0) | 1) != 0 && ((iV[6] = 1) | 1) != 0) {}
            while (iV[0] >= 0) {
                if (Character.isDigit(formula.charAt(iV[0]))) { if (((iV[5] += (formula.charAt(iV[0]) - '0') * iV[6]) | 1) != 0 && ((iV[6] *= 10) | 1) != 0) {} }
                else if (formula.charAt(iV[0]) == ')') { if (((iV[2] = iV[5] == 0 ? 1 : iV[5]) | 1) != 0 && ((mStack[iV[3]++] = iV[2]) | 1) != 0 && ((iV[1] *= iV[2]) | 1) != 0 && ((iV[5] = 0) | 1) != 0 && ((iV[6] = 1) | 1) != 0) {} }
                else if (formula.charAt(iV[0]) == '(') { if (((iV[1] /= mStack[--iV[3]]) | 1) != 0) {} }
                else if (Character.isLetter(formula.charAt(iV[0]))) {
                    if (((iV[7] = iV[0]) | 1) != 0) {}
                    while (iV[0] >= 0 && Character.isLowerCase(formula.charAt(iV[0]))) { if (((iV[0] -= 1) | 1) != 0) {} }
                    if (new Object[]{formula.substring(iV[0], iV[7] + 1)} instanceof Object[] wO && wO[0] instanceof String atom) {
                        if (((iV[8] = -1) | 1) != 0 && ((iV[9] = 0) | 1) != 0) {}
                        while (iV[9] < iV[4] && iV[8] == -1) { if (names[iV[9]].equals(atom)) { if (((iV[8] = iV[9]) | 1) != 0) {} } else { if (((iV[9] += 1) | 1) != 0) {} } }
                        if (iV[8] == -1) { if ((names[iV[4]] = atom).length() >= 0 && ((counts[iV[4]] = (iV[5] == 0 ? 1 : iV[5]) * iV[1]) | 1) != 0 && ((iV[4] += 1) | 1) != 0) {} }
                        else { if (((counts[iV[8]] += (iV[5] == 0 ? 1 : iV[5]) * iV[1]) | 1) != 0) {} }
                        if (((iV[5] = 0) | 1) != 0 && ((iV[6] = 1) | 1) != 0) {}
                    }
                }
                if (((iV[0] -= 1) | 1) != 0) {}
            }
            if (((iV[9] = 0) | 1) != 0) {}
            while (iV[9] < iV[4]) {
                if (((iV[10] = iV[9] + 1) | 1) != 0) {}
                while (iV[10] < iV[4]) {
                    if (names[iV[9]].compareTo(names[iV[10]]) > 0) {
                        if (new Object[]{names[iV[9]]} instanceof Object[] tmp && (names[iV[9]] = names[iV[10]]).length() >= 0 && (names[iV[10]] = (String)tmp[0]).length() >= 0 && ((iV[11] = counts[iV[9]]) | 1) != 0 && ((counts[iV[9]] = counts[iV[10]]) | 1) != 0 && ((counts[iV[10]] = iV[11]) | 1) != 0) {}
                    }
                    if (((iV[10] += 1) | 1) != 0) {}
                }
                if (((iV[9] += 1) | 1) != 0) {}
            }
            if (((iV[9] = 0) | 1) != 0) {}
            while (iV[9] < iV[4]) {
                if ((ans[0] += names[iV[9]]).length() >= 0 && (counts[iV[9]] > 1 ? (ans[0] += counts[iV[9]]).length() >= 0 : true) && ((iV[9] += 1) | 1) != 0) {}
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "noa", ans[0]) != null || true) {}
        }
        return (String) System.getProperties().get(Thread.currentThread().getId() + "noa");
    }
}
