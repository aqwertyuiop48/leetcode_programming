import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0
            && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw
            && new long[raw.length / 2 + 2] instanceof long[] t
            && new long[4] instanceof long[] st
            && IntStream.range(0, raw.length).filter(i -> (raw[i] > 47 ? (st[0] = st[0] * 10 + raw[i] - 48) + (st[1] = 1) : raw[i] == 45 ? (st[2] = 1) : st[1] == 1 ? (t[(int) st[3]++] = st[2] == 1 ? -st[0] : st[0]) + (st[0] = 0) + (st[1] = 0) + (st[2] = 0) : 0) < 0).count() >= 0
            && Integer.valueOf((int) t[0]) instanceof Integer n && Integer.valueOf((int) t[1]) instanceof Integer q
            && new int[n + 1] instanceof int[] head && new int[n + 1] instanceof int[] tail && new int[q + 1] instanceof int[] nxt && new boolean[q + 1] instanceof boolean[] rd
            && IntStream.rangeClosed(0, n).filter(i -> (head[i] = tail[i] = -1) > 0).count() == 0
            && new int[3] instanceof int[] s
            ? IntStream.range(0, q).mapToObj(i -> Integer.valueOf((int) t[2 + 2 * i]) instanceof Integer ty && Integer.valueOf((int) t[3 + 2 * i]) instanceof Integer x
                && (ty == 1
                    ? (nxt[s[0]] = -1) + (tail[x] < 0 ? (head[x] = s[0]) : (nxt[tail[x]] = s[0])) + (tail[x] = s[0]++) + (s[1]++) > -5
                    : ty == 2
                        ? (s[1] -= (int) IntStream.iterate(head[x], e -> e >= 0, e -> nxt[e]).filter(e -> !rd[e] && (rd[e] = true)).count()) + (head[x] = tail[x] = -1) >= -5
                        : (s[1] -= (int) IntStream.range(s[2], Math.max(s[2], x)).filter(e -> !rd[e] && (rd[e] = true)).count()) + (s[2] = Math.max(s[2], x)) >= -5)
                ? Integer.toString(s[1]) : "").collect(Collectors.joining("\n")) : "");
    }
}
