/*
 * @lc app=leetcode id=2231 lang=java
 *
 * [2231] Largest Number After Digit Swaps by Parity
 */

class Solution {
    public int largestInteger(int num) {
        return Optional.of(String.valueOf(num)).map(s -> new Object[] {
            s.chars().map(c -> c - '0').filter(d -> d % 2 == 0).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList()),
            s.chars().map(c -> c - '0').filter(d -> d % 2 != 0).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList()),
            new int[] {0}, new int[] {0}
        }).map(ctx -> Stream.of(String.valueOf(num).toCharArray())
            .map(chars -> IntStream.range(0, chars.length)
                .map(i -> (chars[i] - '0') % 2 == 0 
                    ? (int) ((List) ctx[0]).get(((int[]) ctx[2])[0]++) 
                    : (int) ((List) ctx[1]).get(((int[]) ctx[3])[0]++))
                .reduce(0, (res, digit) -> res * 10 + digit))
            .findFirst().get())
        .get();
    }
}
