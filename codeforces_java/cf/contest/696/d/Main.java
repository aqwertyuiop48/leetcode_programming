import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t && Integer.valueOf(t[0]) instanceof Integer n && Long.valueOf(t[1]) instanceof Long l
            && new int[202][26] instanceof int[][] go && new int[202] instanceof int[] fail && new long[202] instanceof long[] val && new int[] {0} instanceof int[] cnt
            && IntStream.range(0, n).filter(i -> t[2 + n + i] instanceof String s && new int[] {0} instanceof int[] c
                && IntStream.range(0, s.length()).filter(j -> Integer.valueOf(s.charAt(j) - 'a') instanceof Integer ch && (go[c[0]][ch] != 0 || (go[c[0]][ch] = ++cnt[0]) > 0) && (c[0] = go[c[0]][ch]) < 0).count() >= 0
                && (val[c[0]] += Long.parseLong(t[2 + i])) < 0).count() >= 0
            && new int[202] instanceof int[] q && new int[] {0} instanceof int[] qt
            && IntStream.range(0, 26).filter(ch -> go[0][ch] != 0 && (q[qt[0]++] = go[0][ch]) < 0).count() >= 0
            && IntStream.iterate(0, i -> i < qt[0], i -> i + 1).filter(i -> Integer.valueOf(q[i]) instanceof Integer u && (val[u] += val[fail[u]]) > Long.MIN_VALUE
                && IntStream.range(0, 26).filter(ch -> go[u][ch] != 0 ? (fail[go[u][ch]] = go[fail[u]][ch]) >= 0 && (q[qt[0]++] = go[u][ch]) < 0 : (go[u][ch] = go[fail[u]][ch]) < 0).count() >= 0).count() >= 0
            && Integer.valueOf(cnt[0] + 1) instanceof Integer S && Long.valueOf(Long.MIN_VALUE / 4) instanceof Long NEG
            && IntStream.range(0, S).mapToObj(u -> LongStream.generate(() -> NEG).limit(S).toArray()).toArray(long[][]::new) instanceof long[][] P0
            && IntStream.range(0, S).filter(u -> IntStream.range(0, 26).filter(ch -> (P0[u][go[u][ch]] = Math.max(P0[u][go[u][ch]], val[go[u][ch]])) < 0).count() >= 0).count() >= 0
            && new long[][][] {P0} instanceof long[][][] H
            && ((IntFunction<long[]>) i -> LongStream.generate(() -> NEG).limit(S).toArray() instanceof long[] acc && H[0][i] instanceof long[] hi
                && IntStream.range(0, S).filter(k -> hi[k] > NEG / 2 && H[0][k] instanceof long[] hk && Long.valueOf(hi[k]) instanceof Long av && IntStream.range(0, S).filter(j -> (acc[j] = Math.max(acc[j], av + hk[j])) < 0).count() >= 0).count() >= 0
                && IntStream.range(0, S).filter(j -> acc[j] < NEG / 2 && (acc[j] = NEG) > 0).count() >= 0 ? acc : null) instanceof IntFunction<long[]> sq
            && new long[][] {LongStream.generate(() -> NEG).limit(S).toArray()} instanceof long[][] vec && (vec[0][0] = 0) == 0
            && LongStream.range(0, 47).filter(bit -> ((l >> bit) & 1) == 1
                ? (vec[0] = IntStream.range(0, S).mapToLong(j -> IntStream.range(0, S).filter(i -> vec[0][i] > NEG / 2 && H[0][i][j] > NEG / 2).mapToLong(i -> vec[0][i] + H[0][i][j]).max().orElse(NEG)).toArray()) != null && (H[0] = IntStream.range(0, S).parallel().mapToObj(sq).toArray(long[][]::new)) != null
                : (H[0] = IntStream.range(0, S).parallel().mapToObj(sq).toArray(long[][]::new)) != null).count() >= 0
            ? Long.toString(Arrays.stream(vec[0]).max().getAsLong()) : "");
    }
}
