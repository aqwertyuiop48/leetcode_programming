import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 2] instanceof int[] nums
            && new long[3] instanceof long[] st
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                raw[Math.min(i, raw.length - 1)] >= 0
                && (i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (st[0] = st[0] * 10 + raw[i] - '0') >= 0 && (st[2] = 1) > 0
                    : st[2] == 0 || ((nums[(int) st[1]++] = (int) st[0]) >= 0 && (st[0] = 0) == 0 && (st[2] = 0) == 0)))
            && Integer.valueOf(nums[0]) instanceof Integer n
            && (Integer) IntStream.rangeClosed(1, n).reduce((a, b) -> nums[b] > nums[a] ? b : a).getAsInt() instanceof Integer mx
            && IntStream.range(0, n).map(k -> nums[1 + (mx - 1 + k) % n]).toArray() instanceof int[] g
            && new int[n] instanceof int[] sh
            && new long[n] instanceof long[] sc
            && new int[]{0} instanceof int[] tp
            && new long[]{0, 1} instanceof long[] res
            && (sh[0] = g[0]) >= 0
            && (sc[0] = 1) > 0
            && IntStream.range(1, n).allMatch(i ->
                (res[1] = 1) == 1
                && (tp[0] < 0 || sh[tp[0]] >= g[i] || IntStream.iterate(tp[0], t -> t >= 0 && sh[t] < g[i], t -> t - 1).allMatch(t -> (res[0] += sc[t]) >= 0 && --tp[0] >= -1))
                && (tp[0] < 0 || sh[tp[0]] != g[i] || ((res[0] += sc[tp[0]]) >= 0 && (res[1] += sc[tp[0]]) > 0 && --tp[0] >= -1))
                && (tp[0] < 0 || ++res[0] > 0)
                && (sh[++tp[0]] = g[i]) >= 0
                && (sc[tp[0]] = res[1]) > 0)
            && IntStream.iterate(tp[0], t -> t >= 1, t -> t - 1).allMatch(t -> (t == 1 && sc[0] == 1) || (res[0] += sc[t]) >= 0)
            ? res[0]
            : 0L);
    }
}

