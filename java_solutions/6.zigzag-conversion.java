/*
 * @lc app=leetcode id=6 lang=java
 *
 * [6] Zigzag Conversion
 */


class Solution {
    public String convert(String s, int numRows) {
        return numRows == 1 || s.length() <= numRows ? s : (new Object[]{
            new int[]{0, 2 * numRows - 2, 0, 0}, 
            IntStream.range(0, numRows).mapToObj(i -> new StringBuilder()).toArray(StringBuilder[]::new)
        } instanceof Object[] obj && new int[]{0} instanceof int[] loop) ? (IntStream.range(0, s.length()).allMatch(i -> 
            ((int[])obj[0])[2] % ((int[])obj[0])[1] < numRows ? 
            ((StringBuilder[])obj[1])[((int[])obj[0])[2] % ((int[])obj[0])[1]].append(s.charAt(((int[])obj[0])[2]++)) != null : 
            ((StringBuilder[])obj[1])[((int[])obj[0])[1] - (((int[])obj[0])[2] % ((int[])obj[0])[1])].append(s.charAt(((int[])obj[0])[2]++)) != null
        ) ? Arrays.stream((StringBuilder[])obj[1]).map(StringBuilder::toString).collect(Collectors.joining()) : "") : "";
    }
}

