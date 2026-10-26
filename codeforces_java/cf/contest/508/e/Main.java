import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n
            && new int[n] instanceof int[] l && new int[n] instanceof int[] r
            && IntStream.range(0, n).allMatch(i -> (l[i] = s.nextInt()) >= 0 && (r[i] = s.nextInt()) >= 0)
            && new StringBuilder() instanceof StringBuilder sb && new int[n] instanceof int[] open && new int[n + 1] instanceof int[] stack && new int[]{0, 1} instanceof int[] st
            && ((java.util.function.IntPredicate) forced -> IntStream.generate(() -> 0).takeWhile(z -> st[0] > 0
                    && (forced == 1 || sb.length() + 1 - open[stack[st[0] - 1]] >= l[stack[st[0] - 1]])).allMatch(z ->
                (st[1] = st[1] * (sb.length() + 1 - open[stack[st[0] - 1]] >= l[stack[st[0] - 1]] && sb.length() + 1 - open[stack[st[0] - 1]] <= r[stack[st[0] - 1]] ? 1 : 0)) >= 0
                && sb.append(')') != null && --st[0] >= 0)) instanceof java.util.function.IntPredicate close
            && (IntStream.range(0, n).allMatch(i -> (open[i] = sb.length() + 1) > 0 && sb.append('(') != null && (stack[st[0]++] = i) >= 0 && (close.test(0) || true)) || true)
            && (close.test(1) || true)
            ? st[1] == 1 && st[0] == 0 ? sb.toString() : "IMPOSSIBLE" : "IMPOSSIBLE");
    }
}
