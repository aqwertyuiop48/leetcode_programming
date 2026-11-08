import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0 && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw && new int[raw.length / 2 + 2] instanceof int[] v && new int[4] instanceof int[] st
            && IntStream.range(0, raw.length).filter(i -> raw[i] >= 48 ? (st[0] = st[0] * 10 + raw[i] - 48) < 0 : raw[i] == 45 ? (st[2] = 1) < 0 : i > 0 && raw[i - 1] > 32 && (v[st[3]++] = st[2] == 1 ? -st[0] : st[0]) * 0 == 0 && (st[0] = st[2] = 0) < 0).count() >= 0
            && Integer.valueOf(v[0]) instanceof Integer n && new boolean[n + 1] instanceof boolean[] vis && new int[n + 1] instanceof int[] cyc && new int[n + 1] instanceof int[] cid
            && new int[n + 1] instanceof int[] cs && new int[n + 1] instanceof int[] cl && new int[n + 1] instanceof int[] rank && new int[n + 1] instanceof int[] p
            && new int[]{0, 1, 0, 0} instanceof int[] s
            && IntStream.range(0, 2 * n).allMatch(t -> s[0] != 0
                ? (cyc[s[2]] = s[0]) > 0 && (cid[s[2]++] = s[3]) >= 0 && (vis[s[0]] = true)
                    && (vis[v[s[0]]] ? (cl[s[3]] = s[2] - cs[s[3]]) > 0 && (cs[++s[3]] = s[2]) >= 0 && (s[0] = 0) == 0 : (s[0] = v[s[0]]) > 0)
                : s[1] > n || ((vis[s[1]] || (s[0] = s[1]) > 0) && ++s[1] > 0))
            && IntStream.range(0, n).allMatch(t -> Integer.valueOf(cid[t]) instanceof Integer c
                && (cl[c] % 2 == 0 || (p[cyc[t]] = cyc[cs[c] + (t - cs[c] + (cl[c] + 1) / 2) % cl[c]]) > 0))
            && IntStream.range(0, s[3]).filter(c -> cl[c] % 2 == 0).mapToLong(c -> ((long) cl[c] << 20) | c).sorted().toArray() instanceof long[] e
            && e.length % 2 == 0
            && IntStream.range(0, e.length / 2).allMatch(t -> (e[2 * t] >> 20) == (e[2 * t + 1] >> 20))
            && IntStream.range(0, e.length).allMatch(r -> (rank[(int) (e[r] & 1048575)] = r) >= 0)
            && IntStream.range(0, n).allMatch(t -> Integer.valueOf(cid[t]) instanceof Integer c
                && (cl[c] % 2 == 1 || Integer.valueOf(rank[c]) instanceof Integer r
                    && ((r & 1) == 0
                        ? (p[cyc[t]] = cyc[cs[(int) (e[r + 1] & 1048575)] + t - cs[c]]) > 0
                        : (p[cyc[t]] = cyc[cs[(int) (e[r - 1] & 1048575)] + (t - cs[c] + 1) % cl[c]]) > 0)))
            && new StringBuilder() instanceof StringBuilder sb
            && IntStream.rangeClosed(1, n).filter(i -> sb.append(p[i]).append(' ') == null).count() == 0
            ? sb.toString().trim() : -1);
    }
}
