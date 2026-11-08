import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 2] instanceof int[] v
            && new int[]{0, 0, 0} instanceof int[] st
            && IntStream.rangeClosed(0, raw.length).filter(i -> i < raw.length && raw[i] > 47
                ? (st[2] = 1) + (st[1] = st[1] * 10 + raw[i] - 48) < 0
                : st[2] == 1 && (v[st[0]++] = st[1]) + (st[1] = 0) + (st[2] = 0) < 0).count() == 0
            && Integer.valueOf(v[0]) instanceof Integer n
            && new int[n + 1] instanceof int[] head && new int[2 * n] instanceof int[] nxt && new int[2 * n] instanceof int[] to
            && new int[n + 1] instanceof int[] par && new int[n + 1] instanceof int[] pcol && new int[n + 1] instanceof int[] order
            && new int[n] instanceof int[] col && new int[]{1, 0} instanceof int[] cc
            && IntStream.range(0, n + 1).filter(i -> (head[i] = -1) > 0).count() == 0
            && IntStream.range(0, 2 * (n - 1)).filter(e -> (to[e] = v[1 + 2 * (e >> 1) + ((e & 1) ^ 1)]) + (nxt[e] = head[v[1 + 2 * (e >> 1) + (e & 1)]])
                + (head[v[1 + 2 * (e >> 1) + (e & 1)]] = e) < 0).count() == 0
            && (order[0] = 1) + (par[1] = 0) + (pcol[1] = 0) == 1
            && IntStream.range(0, n).filter(i -> Integer.valueOf(order[i]) instanceof Integer u && (cc[0] = 1) > 0
                && IntStream.iterate(head[u], e -> e >= 0, e -> nxt[e]).filter(e -> to[e] != par[u]
                    && (col[e >> 1] = (cc[0] += cc[0] == pcol[u] ? 1 : 0)) + (cc[0]++) + (par[to[e]] = u) + (pcol[to[e]] = col[e >> 1])
                        + (order[cc[1]++ + 1] = to[e]) < 0).count() < 0).count() == 0
            && IntStream.range(0, n - 1).boxed().collect(Collectors.groupingBy(i -> col[i], Collectors.mapping(i -> String.valueOf(i + 1), Collectors.toList()))) instanceof Map<Integer, List<String>> mp
            ? mp.size() + "\n" + mp.values().stream().map(l -> l.size() + " " + String.join(" ", l)).collect(Collectors.joining("\n"))
            : "");
    }
}
