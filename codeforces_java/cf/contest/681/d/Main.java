import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw && new int[raw.length / 2 + 2] instanceof int[] t && new int[3] instanceof int[] st
            && IntStream.range(0, raw.length + 1).filter(i -> (i < raw.length && raw[i] > 47) ? (st[0] = st[0] * 10 + raw[i] - 48) + (st[1] = 1) > 0 : st[1] == 1 && (t[st[2]++] = st[0]) + (st[0] = 0) + (st[1] = 0) >= 0).count() >= 0
            && Integer.valueOf(t[0]) instanceof Integer n && Integer.valueOf(t[1]) instanceof Integer m
            && new int[n + 1] instanceof int[] par && new int[n + 1] instanceof int[] head && new int[n + 1] instanceof int[] nxt
            && new int[n + 1] instanceof int[] dep && new int[n + 1] instanceof int[] ord && new int[n + 1] instanceof int[] a && new int[]{0} instanceof int[] tl
            && IntStream.range(0, m).filter(i -> (par[t[3 + 2 * i]] = t[2 + 2 * i]) >= 0 && (nxt[t[3 + 2 * i]] = head[t[2 + 2 * i]]) >= 0 && (head[t[2 + 2 * i]] = t[3 + 2 * i]) > 0).count() >= 0
            && IntStream.rangeClosed(1, n).filter(v -> (a[v] = t[2 + 2 * m + v - 1]) >= 0).count() >= 0
            && IntStream.rangeClosed(1, n).filter(v -> par[v] == 0 && (ord[tl[0]++] = v) > 0).count() >= 0
            && IntStream.iterate(0, i -> i < tl[0], i -> i + 1).filter(i -> IntStream.iterate(head[ord[i]], e -> e != 0, e -> nxt[e]).filter(c -> (dep[c] = dep[ord[i]] + 1) >= 0 && (ord[tl[0]++] = c) > 0).count() >= 0).count() >= 0
            && IntStream.rangeClosed(1, n).allMatch(v -> a[v] == v || (par[v] != 0 && a[v] == a[par[v]]))
            && IntStream.rangeClosed(1, n).filter(v -> a[v] == v).mapToLong(v -> (long) (n - dep[v]) * (n + 1) + v).sorted().mapToObj(k -> String.valueOf(k % (n + 1))).collect(Collectors.toList()) instanceof List<String> res
            ? res.size() + "\n" + String.join("\n", res) : "-1");
    }
}
