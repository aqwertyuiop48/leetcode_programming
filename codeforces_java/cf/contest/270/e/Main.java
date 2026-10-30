import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 4] instanceof int[] vals && new long[3] instanceof long[] pr
            && IntStream.rangeClosed(0, raw.length).allMatch(i -> (i < raw.length && raw[i] > 47)
                ? (pr[0] = pr[0] * 10 + raw[i] - 48) >= 0 && (pr[2] = 1) > 0
                : pr[2] == 0 || ((vals[(int) pr[1]++] = (int) pr[0]) >= 0 && (pr[0] = 0) == 0 && (pr[2] = 0) == 0))
            && Integer.valueOf(vals[0]) instanceof Integer n && Integer.valueOf(vals[1]) instanceof Integer m
            && new int[n + 1] instanceof int[] head && new int[2 * m] instanceof int[] nxt && new long[n + 1] instanceof long[] total && new long[n + 1] instanceof long[] inflow
            && IntStream.rangeClosed(0, n).allMatch(i -> (head[i] = -1) < 0)
            && IntStream.range(0, m).allMatch(i -> (nxt[2 * i] = head[vals[2 + 3 * i]]) >= -1 && (head[vals[2 + 3 * i]] = 2 * i) >= 0
                && (nxt[2 * i + 1] = head[vals[3 + 3 * i]]) >= -1 && (head[vals[3 + 3 * i]] = 2 * i + 1) >= 0
                && (total[vals[2 + 3 * i]] += vals[4 + 3 * i]) > 0 && (total[vals[3 + 3 * i]] += vals[4 + 3 * i]) > 0)
            && new int[m] instanceof int[] dir && IntStream.range(0, m).allMatch(i -> (dir[i] = -1) < 0)
            && new int[n + 2] instanceof int[] q && (q[0] = 1) == 1 && new int[]{0, 1} instanceof int[] st
            && IntStream.iterate(0, i -> st[0] < st[1], i -> i + 1).allMatch(i -> Integer.valueOf(q[st[0]++]) instanceof Integer v
                && IntStream.iterate(head[v], e -> e >= 0, e -> nxt[e]).allMatch(e -> dir[e >> 1] >= 0
                    || (dir[e >> 1] = e & 1) >= 0 && Integer.valueOf(vals[2 + 3 * (e >> 1) + 1 - (e & 1)]) instanceof Integer u
                        && (inflow[u] += vals[4 + 3 * (e >> 1)]) > 0 && (u == n || inflow[u] * 2 != total[u] || (q[st[1]++] = u) > 0)))
            ? IntStream.range(0, m).mapToObj(i -> String.valueOf(dir[i])).collect(Collectors.joining("\n")) : "");
    }
}
