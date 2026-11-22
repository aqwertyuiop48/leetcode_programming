

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] tk
            && tk[0] instanceof String s
            && Integer.valueOf(s.length()) instanceof Integer n
            && Integer.valueOf(Integer.parseInt(tk[1])) instanceof Integer cnt
            && String.join("", Arrays.copyOfRange(tk, 2, 2 + cnt)) instanceof String cat
            && Integer.valueOf(cat.length()) instanceof Integer tot
            && new int[tot + 1] instanceof int[] pa
            && new int[tot + 1] instanceof int[] pb
            && new int[tot + 1] instanceof int[] pid
            && new int[1] instanceof int[] off
            && IntStream.range(0, cnt).allMatch(p ->
                Integer.valueOf(tk[2 + p].length()) instanceof Integer len
                && IntStream.range(off[0], off[0] + len).allMatch(t -> (pa[t] = off[0]) >= 0 && (pb[t] = off[0] + len) > 0 && (pid[t] = p) >= 0)
                && (off[0] += len) > 0)
            && ((BiFunction<int[], int[], int[]>) (pc, tx) ->
                new int[(tot + 1) * 64] instanceof int[] go
                && new int[tot + 1] instanceof int[] fl
                && new int[tot + 1] instanceof int[] qq
                && new int[tot + 1] instanceof int[] nd
                && IntStream.generate(() -> 1000000000).limit(tot + 1).toArray() instanceof int[] fs
                && new int[4] instanceof int[] z
                && IntStream.range(0, tot).allMatch(t ->
                    (pa[t] != t || (z[0] = 0) == 0)
                    && (go[z[0] * 64 + (pc[t] & 63)] != 0 || (go[z[0] * 64 + (pc[t] & 63)] = ++z[1]) > 0)
                    && (z[0] = go[z[0] * 64 + (pc[t] & 63)]) >= 0
                    && (nd[t] = z[0]) >= 0)
                && (z[2] = 1) > 0
                && IntStream.iterate(0, i -> i < z[2], i -> i + 1).allMatch(i ->
                    Integer.valueOf(qq[i]) instanceof Integer u
                    && IntStream.range(0, 64).allMatch(c ->
                        go[u * 64 + c] != 0
                            ? (fl[go[u * 64 + c]] = u == 0 ? 0 : go[fl[u] * 64 + c]) >= 0 && (qq[z[2]++] = go[u * 64 + c]) > 0
                            : u == 0 || (go[u * 64 + c] = go[fl[u] * 64 + c]) >= 0))
                && IntStream.range(0, n).allMatch(j ->
                    (z[3] = go[z[3] * 64 + (tx[j] & 63)]) >= 0 && (fs[z[3]] < 1000000000 || (fs[z[3]] = j) >= 0))
                && IntStream.iterate(z[2] - 1, i -> i > 0, i -> i - 1).allMatch(i ->
                    (fs[fl[qq[i]]] = Math.min(fs[fl[qq[i]]], fs[qq[i]])) >= 0)
                ? IntStream.range(0, tot).map(t -> fs[nd[t]]).toArray() : null) instanceof BiFunction<int[], int[], int[]> build
            && build.apply(cat.chars().toArray(), s.chars().toArray()) instanceof int[] ef
            && build.apply(IntStream.range(0, tot).map(t -> cat.charAt(pa[t] + pb[t] - 1 - t)).toArray(),
                    new StringBuilder(s).reverse().chars().toArray()) instanceof int[] er
            && new int[]{-1} instanceof int[] last
            ? IntStream.range(0, tot).filter(t -> t + 1 < pb[t]
                    && ef[t] < n - 1 - er[pa[t] + pb[t] - t - 2]
                    && last[0] != pid[t] && (last[0] = pid[t]) >= 0).count()
            : -1);
    }
}
