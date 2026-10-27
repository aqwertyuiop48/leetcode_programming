import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && Collections.list(new StringTokenizer(new String(raw), " \r\n")).stream().map(o -> (String) o).toArray(String[]::new) instanceof String[] tk
            && Integer.valueOf(Integer.parseInt(tk[0])) instanceof Integer n
            && IntStream.range(0, n).mapToLong(i -> Long.parseLong(tk[1 + i])).toArray() instanceof long[] a
            && Integer.valueOf(Integer.parseInt(tk[1 + n])) instanceof Integer m
            && new long[]{223092870L, 2756205443L, 907383479L, 42600829L, 97L} instanceof long[] GG
            && LongStream.of(GG).map(M -> Long.divideUnsigned(-1L, M)).toArray() instanceof long[] INV
            && IntStream.range(0, 5).mapToObj(g -> (LongBinaryOperator) (x, y) ->
                (x * y - Math.multiplyHigh(x * y, INV[g]) * GG[g]) >= GG[g]
                    ? (x * y - Math.multiplyHigh(x * y, INV[g]) * GG[g]) - GG[g]
                    : (x * y - Math.multiplyHigh(x * y, INV[g]) * GG[g])).toArray(LongBinaryOperator[]::new) instanceof LongBinaryOperator[] mm
            && new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97} instanceof int[] P
            && new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 4} instanceof int[] PG
            && IntStream.range(0, 5 * n).mapToLong(u -> a[u / 5] % GG[u % 5]).toArray() instanceof long[] am
            && LongStream.generate(() -> 1L).limit(5 * m).toArray() instanceof long[] prod
            && IntStream.range(0, m).map(q -> Integer.parseInt(tk[2 + n + 3 * q])).toArray() instanceof int[] qb
            && IntStream.rangeClosed(2, 16).allMatch(d -> IntStream.range(0, m).noneMatch(q -> qb[q] == d)
                || (Integer.valueOf(IntStream.rangeClosed(1, 14).filter(k -> Math.pow(d, k) >= n).findFirst().getAsInt()) instanceof Integer K
                && Integer.valueOf(Math.min(K, IntStream.rangeClosed(1, 6).filter(l -> Math.pow(d, l) <= 64).max().getAsInt())) instanceof Integer lo
                && Integer.valueOf(K - lo) instanceof Integer hi
                && IntStream.rangeClosed(0, lo).map(j -> (int) Math.round(Math.pow(d, j))).toArray() instanceof int[] pwd
                && Integer.valueOf(pwd[lo]) instanceof Integer dlo
                && Integer.valueOf((int) Math.round(Math.pow(d + 1, hi))) instanceof Integer hiS
                && Integer.valueOf((int) Math.round(Math.pow(d + 1, lo))) instanceof Integer loS
                && IntStream.range(0, loS).mapToObj(ls -> IntStream.range(0, dlo).filter(x -> IntStream.range(0, lo).allMatch(j ->
                    (Integer) (ls / (int) Math.round(Math.pow(d + 1, lo - 1 - j)) % (d + 1)) instanceof Integer ld && (ld == d || ld == x / pwd[lo - 1 - j] % d))).toArray()).toArray(int[][]::new) instanceof int[][] lm
                && new int[hiS] instanceof int[] wh
                && new int[hiS] instanceof int[] hv
                && IntStream.range(1, hiS).allMatch(s ->
                    (wh[s] = s % (d + 1) == d ? 1 : wh[s / (d + 1)] == 0 ? 0 : wh[s / (d + 1)] * (d + 1)) >= 0
                    && (hv[s] = hv[s / (d + 1)] * d + s % (d + 1)) >= 0)
                && Integer.valueOf(dlo * 5) instanceof Integer dlo5
                && new long[hiS * dlo5] instanceof long[] T
                && IntStream.range(0, hiS).allMatch(s -> wh[s] == 0
                    ? IntStream.range(0, dlo).allMatch(x ->
                        Integer.valueOf((s * dlo + x) * 5) instanceof Integer b
                        && Integer.valueOf(hv[s] * dlo + x) instanceof Integer id
                        && (T[b + 0] = id < n ? am[id * 5 + 0] : 1L) >= 0
                        && (T[b + 1] = id < n ? am[id * 5 + 1] : 1L) >= 0
                        && (T[b + 2] = id < n ? am[id * 5 + 2] : 1L) >= 0
                        && (T[b + 3] = id < n ? am[id * 5 + 3] : 1L) >= 0
                        && (T[b + 4] = id < n ? am[id * 5 + 4] : 1L) >= 0)
                    : IntStream.range(0, dlo).allMatch(x ->
                        Integer.valueOf((s * dlo + x) * 5) instanceof Integer b
                        && Integer.valueOf(((s - d * wh[s]) * dlo + x) * 5) instanceof Integer cb
                        && (T[b + 0] = T[cb + 0]) >= 0
                        && (T[b + 1] = T[cb + 1]) >= 0
                        && (T[b + 2] = T[cb + 2]) >= 0
                        && (T[b + 3] = T[cb + 3]) >= 0
                        && (T[b + 4] = T[cb + 4]) >= 0)
                        && IntStream.range(1, d).allMatch(t -> IntStream.range(0, dlo).allMatch(x ->
                            Integer.valueOf((s * dlo + x) * 5) instanceof Integer b
                            && Integer.valueOf(((s - (d - t) * wh[s]) * dlo + x) * 5) instanceof Integer cb
                            && (T[b + 0] = mm[0].applyAsLong(T[b + 0], T[cb + 0])) >= 0
                            && (T[b + 1] = mm[1].applyAsLong(T[b + 1], T[cb + 1])) >= 0
                            && (T[b + 2] = mm[2].applyAsLong(T[b + 2], T[cb + 2])) >= 0
                            && (T[b + 3] = mm[3].applyAsLong(T[b + 3], T[cb + 3])) >= 0
                            && (T[b + 4] = mm[4].applyAsLong(T[b + 4], T[cb + 4])) >= 0)))
                && IntStream.range(0, m).filter(q -> qb[q] == d).allMatch(q ->
                    tk[3 + n + 3 * q] instanceof String sp
                    && Integer.valueOf(sp.length()) instanceof Integer L
                    && ((IntUnaryOperator) j -> L - K + j >= 0 ? (sp.charAt(L - K + j) == '?' ? d : sp.charAt(L - K + j) <= '9' ? sp.charAt(L - K + j) - '0' : sp.charAt(L - K + j) - 'A' + 10) : 0) instanceof IntUnaryOperator dg
                    && (IntStream.range(0, Math.max(0, L - K)).allMatch(j -> sp.charAt(j) == '?' || sp.charAt(j) == '0')
                        ? Integer.valueOf(IntStream.range(0, hi).reduce(0, (x, j) -> x * (d + 1) + dg.applyAsInt(j))) instanceof Integer hs
                            && Integer.valueOf(IntStream.range(hi, K).reduce(0, (x, j) -> x * (d + 1) + dg.applyAsInt(j))) instanceof Integer ls
                            && IntStream.range(0, 5 * lm[ls].length).allMatch(u ->
                                (prod[5 * q + u % 5] = mm[u % 5].applyAsLong(prod[5 * q + u % 5], T[(hs * dlo + lm[ls][u / 5]) * 5 + u % 5])) >= 0)
                        : true))))
            && IntStream.range(0, m).map(q -> Long.valueOf(Long.parseLong(tk[4 + n + 3 * q])) instanceof Long c
                ? IntStream.range(0, 25).filter(i -> (prod[5 * q + PG[i]] % P[i] + c % P[i]) % P[i] == 0).map(i -> P[i]).findFirst().orElse(-1)
                : -1).mapToObj(Integer::toString).collect(Collectors.joining("\n")) instanceof String out
            ? out : "");
    }
}

