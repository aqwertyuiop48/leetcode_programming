/*
 * @lc app=leetcode id=2019 lang=java
 *
 * [2019] The Score of Students Solving Math Expression
 */

class Solution {
    public int scoreOfStudents(String s, int[] answers) {
        return ((Function<Set[][], IntUnaryOperator>) dp -> correct -> 
            IntStream.iterate(1, len -> len <= s.length(), len -> len + 2).reduce(0, (acc, len) -> 
                IntStream.iterate(0, i -> i <= s.length() - len, i -> i + 2).reduce(0, (acc2, i) -> 
                    (dp[i][i + len - 1] = new HashSet<>()).isEmpty() && len == 1 ? (dp[i][i].add(s.charAt(i) - '0') ? 0 : 0) : 
                        IntStream.iterate(i + 1, k -> k < i + len - 1, k -> k + 2).reduce(0, (acc3, k) -> 
                            dp[i][k - 1].stream().mapToInt(l -> dp[k + 1][i + len - 1].stream().mapToInt(r -> (s.charAt(k) == '+' && (Integer)l + (Integer)r <= 1000 ? dp[i][i + len - 1].add((Integer)l + (Integer)r) : false) == true || (s.charAt(k) == '*' && (Integer)l * (Integer)r <= 1000 ? dp[i][i + len - 1].add((Integer)l * (Integer)r) : false) == true ? 1 : 0).sum()).sum() * 0
                        )
                ) * 0
            ) * 0 == 0 ? IntStream.of(answers).map(a -> a == correct ? 5 : dp[0][s.length() - 1].contains(a) ? 2 : 0).sum() : 0
        ).apply(new Set[s.length()][s.length()]).applyAsInt(Arrays.stream(s.split("\\+")).mapToInt(p -> Arrays.stream(p.split("\\*")).mapToInt(Integer::parseInt).reduce(1, (a, b) -> a * b)).sum());
    }
}
