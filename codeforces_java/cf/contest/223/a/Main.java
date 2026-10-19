import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in).next() instanceof String s
            && Integer.valueOf(s.length()) instanceof Integer n
            && new int[n + 1] instanceof int[] pre && IntStream.range(0, n).allMatch(i -> (pre[i + 1] = pre[i] + (s.charAt(i) == '[' ? 1 : 0)) >= 0)
            && new ArrayDeque<Integer>() instanceof ArrayDeque<Integer> st && new int[]{-1, 0, -1, -1} instanceof int[] state
            && IntStream.range(0, n).allMatch(i -> s.charAt(i) == '(' || s.charAt(i) == '[' ? st.offerFirst(i)
                : !st.isEmpty() && (s.charAt(st.peekFirst()) == '(' ? s.charAt(i) == ')' : s.charAt(i) == ']') && st.pollFirst() instanceof Integer
                    ? Integer.valueOf(st.isEmpty() ? state[0] + 1 : st.peekFirst() + 1) instanceof Integer left
                        && (state[2] >= 0 && pre[i + 1] - pre[left] < state[1] || (state[1] = pre[i + 1] - pre[left]) >= 0 && (state[2] = left) >= 0 && (state[3] = i) >= 0)
                    : (st.removeIf(x -> true) || true) && (state[0] = i) >= -1)
            ? state[2] < 0 ? "0" : state[1] + "\n" + s.substring(state[2], state[3] + 1) : "");
    }
}
