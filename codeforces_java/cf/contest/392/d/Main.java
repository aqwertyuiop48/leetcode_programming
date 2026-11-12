
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 2] instanceof int[] vals && new int[3] instanceof int[] st
            && IntStream.rangeClosed(0, raw.length).map(i -> i < raw.length && raw[i] >= 48
                ? (st[0] = st[0] * 10 + raw[i] - 48) * 0 + (st[1] = 1) * 0
                : st[1] == 1 ? (vals[st[2]++] = st[0]) * 0 + (st[0] = 0) + (st[1] = 0) : 0).sum() >= 0
            && Integer.valueOf(vals[0]) instanceof Integer n && Integer.valueOf(1000000000) instanceof Integer BIG && Integer.valueOf(1000000000) instanceof Integer INF
            && new long[3 * n] instanceof long[] keys
            && IntStream.range(0, 3 * n).allMatch(i -> (keys[i] = ((long) vals[1 + i] << 19) | ((long) (i / n) << 17) | (i % n)) >= 0)
            && Stream.of(0).peek(z -> Arrays.sort(keys)).findFirst().isPresent()
            && IntStream.range(0, 3).mapToObj(r -> IntStream.range(0, 3 * n).map(i -> n + 1).toArray()).toArray(int[][]::new) instanceof int[][] P3
            && new int[]{-1} instanceof int[] gi && new long[]{-1} instanceof long[] pv
            && IntStream.range(0, 3 * n).allMatch(i -> (keys[i] >> 19 == pv[0] || (pv[0] = keys[i] >> 19) >= 0 && ++gi[0] >= 0)
                && (P3[(int) (keys[i] >> 17 & 3)][gi[0]] = Math.min(P3[(int) (keys[i] >> 17 & 3)][gi[0]], (int) (keys[i] & 131071) + 1)) > 0)
            && IntStream.range(0, n + 2).map(i -> -1).toArray() instanceof int[] head && new int[gi[0] + 1] instanceof int[] nxt
            && IntStream.range(0, gi[0] + 1).allMatch(g -> (nxt[g] = head[P3[0][g]]) > -2 && (head[P3[0][g]] = g) >= 0)
            && Integer.valueOf(Integer.highestOneBit(n + 3) * 2) instanceof Integer size
            && IntStream.range(0, 2 * size).map(i -> INF).toArray() instanceof int[] t
            && ((IntBinaryOperator) (p, v) -> (t[p + size] = v) >= 0 && IntStream.iterate((p + size) / 2, i -> i >= 1, i -> i / 2).allMatch(i -> (t[i] = Math.min(t[2 * i], t[2 * i + 1])) >= 0) ? 1 : 0) instanceof IntBinaryOperator set
            && new TreeMap<Integer, Integer>(Map.of(0, BIG + 1, n + 2, 0)) instanceof TreeMap<Integer, Integer> tm
            && set.applyAsInt(0, 0) >= 0
            && ((IntPredicate) g -> Integer.valueOf(P3[1][g]) instanceof Integer pb && Integer.valueOf(P3[2][g] > n ? BIG : P3[2][g]) instanceof Integer pc
                && (tm.ceilingEntry(pb).getValue() >= pc
                    || Stream.iterate(0, z -> tm.floorEntry(pb).getValue() <= pc, z -> z + 1)
                        .allMatch(z -> tm.floorEntry(pb) instanceof Map.Entry<Integer, Integer> en && tm.remove(en.getKey()) != null && set.applyAsInt(en.getKey(), INF) >= 0)
                    && tm.lowerEntry(pb) instanceof Map.Entry<Integer, Integer> lo && tm.ceilingEntry(pb) instanceof Map.Entry<Integer, Integer> hi
                    && tm.put(pb, pc) == null && set.applyAsInt(lo.getKey(), lo.getKey() + pc) >= 0
                    && set.applyAsInt(pb, pb <= n ? pb + hi.getValue() : INF) >= 0)) instanceof IntPredicate ins
            && ((IntPredicate) u -> Stream.iterate(head[u], g -> g >= 0, g -> nxt[g]).allMatch(g -> ins.test(g))) instanceof IntPredicate addAll
            && addAll.test(n + 1)
            ? IntStream.iterate(n, u -> u >= 0, u -> u - 1).map(u -> Integer.valueOf(t[1] < BIG ? u + t[1] : Integer.MAX_VALUE) instanceof Integer cand && addAll.test(u) ? cand : 0).min().getAsInt() : "");
    }
}



