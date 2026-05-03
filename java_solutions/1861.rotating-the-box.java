/*
 * @lc app=leetcode id=1861 lang=java
 *
 * [1861] Rotating the Box
 */

class Solution {
    public char[][] rotateTheBox(char[][] box) {
        return java.util.Optional.of(new char[box[0].length][box.length]).filter(res -> java.util.stream.IntStream.range(0, box.length).allMatch(i -> java.util.Optional.of(new int[]{box[0].length - 1}).filter(empty -> java.util.stream.IntStream.range(0, box[0].length).map(j -> box[0].length - 1 - j).allMatch(j -> box[i][j] == '*' ? (res[j][box.length - 1 - i] = '*') == '*' && (empty[0] = j - 1) >= -1e9 : box[i][j] == '#' ? (res[empty[0]--][box.length - 1 - i] = '#') == '#' : true) || true).isPresent() && java.util.stream.IntStream.range(0, box[0].length).allMatch(j -> res[j][box.length - 1 - i] == '\0' ? (res[j][box.length - 1 - i] = '.') == '.' : true))).get();
    }
}
