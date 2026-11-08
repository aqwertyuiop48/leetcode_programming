import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 2] instanceof int[] v
            && new int[]{-1, 0} instanceof int[] st
            && IntStream.rangeClosed(0, raw.length).filter(i -> Integer.valueOf(i < raw.length ? raw[i] : 32) instanceof Integer ch
                && (ch >= 48 ? (st[0] = Math.max(st[0], 0) * 10 + ch - 48) >= 0 : st[0] < 0 || ((v[st[1]++] = st[0]) >= 0 && (st[0] = -1) < 0))).count() >= 0
            && Integer.valueOf(v[0]) instanceof Integer n
            && IntStream.of(v[1], v[2], v[3]).sorted().toArray() instanceof int[] abc
            && Integer.valueOf(abc[0]) instanceof Integer a && Integer.valueOf(abc[1]) instanceof Integer b && Integer.valueOf(abc[2]) instanceof Integer c
            && IntStream.of(v).skip(4).limit(n).toArray() instanceof int[] t
            && IntStream.of(t).max().getAsInt() <= a + b + c
            && IntStream.of(t).filter(x -> x <= Math.max(a + b, c)).boxed().collect(Collectors.toMap(x -> x, x -> 1, Integer::sum, TreeMap::new)) instanceof TreeMap<Integer, Integer> m
            && ((IntPredicate) x -> Optional.ofNullable(m.floorKey(x)).map(k -> m.merge(k, -1, Integer::sum) + (m.remove(k, 0) ? 1 : 0)).isPresent()) instanceof IntPredicate rm
            && new int[]{0} instanceof int[] h
            && (h[0] = (int) IntStream.of(t).filter(x -> x > b + c).count()) >= 0
            && IntStream.of(t).filter(x -> x > a + c && x <= b + c).filter(x -> ++h[0] > 0 && rm.test(a)).count() >= 0
            && IntStream.of(t).filter(x -> x > Math.max(a + b, c) && x <= a + c).filter(x -> ++h[0] > 0 && rm.test(b)).count() >= 0
            && IntStream.range(0, n).filter(j -> !m.isEmpty() && m.lastKey() instanceof Integer x && ++h[0] > 0
                && ((x > c ? rm.test(x) && (rm.test(c) || true)
                    : rm.test(x) && ((m.floorKey(a) instanceof Integer za ? rm.test(a) && (rm.test(b) || (m.merge(za, 1, Integer::sum) > 0 && rm.test(a + b))) : rm.test(a + b)) || true)) || true)).count() >= 0
            ? h[0] : -1);
    }
}
