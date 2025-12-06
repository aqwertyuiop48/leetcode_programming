/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */

// @lc code=start
// semicolons : 1
class Solution {
    public boolean isValid(String s) {
        return Optional.of(s.chars().mapToObj(c -> (char)c).reduce(new Object[]{new Stack<Character>(), true}, (state, c) -> Optional.of((boolean)state[1]).filter(v -> v).map(v -> Optional.ofNullable(Map.of('(', ')', '[', ']', '{', '}').get(c)).map(close -> new Object[]{Stream.of((Stack<Character>)state[0]).peek(st -> st.push(close)).findFirst().get(), true}).orElseGet(() -> Optional.of((Stack<Character>)state[0]).filter(st -> !st.isEmpty() && st.pop() == c).map(st -> state).orElse(new Object[]{state[0], false}))).orElse(state), (a, b) -> a)).filter(state -> Optional.of((boolean)state[1]).filter(v -> v).filter(v -> ((Stack<Character>)state[0]).isEmpty()).isPresent()).isPresent();
    }
}
// @lc code=end

