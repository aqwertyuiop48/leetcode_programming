import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        new Thread(null, () -> System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).iterator() instanceof Iterator<Object> it
            && ((IntSupplier) () -> Integer.parseInt((String) it.next())) instanceof IntSupplier rd
            && Integer.valueOf(rd.getAsInt()) instanceof Integer n0 && Integer.valueOf(rd.getAsInt()) instanceof Integer m0 && Integer.valueOf(rd.getAsInt()) instanceof Integer k
            && Boolean.valueOf(n0 > m0) instanceof Boolean swap
            && Integer.valueOf(swap ? m0 : n0) instanceof Integer n && Integer.valueOf(swap ? n0 : m0) instanceof Integer m
            && Integer.valueOf(Integer.highestOneBit(Math.max(1, 4 * k - 1))) instanceof Integer cap
            && new long[cap] instanceof long[] hk && new int[cap] instanceof int[] rv && new int[cap] instanceof int[] lv
            && IntStream.range(0, cap).allMatch(i -> (hk[i] = -1) < 0)
            && new AtomicReference<LongBinaryOperator>() instanceof AtomicReference<LongBinaryOperator> probe
            && probe.compareAndSet(null, (key, h) -> hk[(int) h] == key || hk[(int) h] == -1 ? h : probe.get().applyAsLong(key, (h + 1) & (cap - 1)))
            && new AtomicReference<LongBinaryOperator>() instanceof AtomicReference<LongBinaryOperator> findR
            && findR.compareAndSet(null, (base, c) -> Long.valueOf(probe.get().applyAsLong(base + c, ((base + c) * 0x9E3779B97F4A7C15L) >>> 40 & (cap - 1))) instanceof Long sl
                && hk[sl.intValue()] == base + c
                ? Long.valueOf(findR.get().applyAsLong(base, rv[sl.intValue()])) instanceof Long root && (rv[sl.intValue()] = root.intValue()) >= 0 ? root : 0L : c)
            && new AtomicReference<LongBinaryOperator>() instanceof AtomicReference<LongBinaryOperator> findL
            && findL.compareAndSet(null, (base, c) -> Long.valueOf(probe.get().applyAsLong(base + c, ((base + c) * 0x9E3779B97F4A7C15L) >>> 40 & (cap - 1))) instanceof Long sl
                && hk[sl.intValue()] == base + c
                ? Long.valueOf(findL.get().applyAsLong(base, lv[sl.intValue()])) instanceof Long root && (lv[sl.intValue()] = root.intValue()) >= -1 ? root : 0L : c)
            && new long[1] instanceof long[] best && new int[2] instanceof int[] q
            && ((LongBinaryOperator) (row, c) -> c >= 1 && c <= m ? (best[0] = Math.min(best[0], (Math.abs(row - q[0]) + Math.abs(c - q[1])) * 100000000000L + (swap ? c : row) * 200000L + (swap ? row : c))) > 0 ? 1L : 1L : 1L) instanceof LongBinaryOperator cand
            && new AtomicReference<IntPredicate>() instanceof AtomicReference<IntPredicate> scan
            && scan.compareAndSet(null, dx -> !((q[0] - dx >= 1 || q[0] + dx <= n) && dx <= best[0] / 100000000000L) || (
                (q[0] - dx < 1 || q[0] - dx > n || cand.applyAsLong(q[0] - dx, findR.get().applyAsLong((q[0] - dx) * (m + 2L), q[1])) + cand.applyAsLong(q[0] - dx, findL.get().applyAsLong((q[0] - dx) * (m + 2L), q[1])) > 0)
                && (dx == 0 || q[0] + dx < 1 || q[0] + dx > n || cand.applyAsLong(q[0] + dx, findR.get().applyAsLong((q[0] + dx) * (m + 2L), q[1])) + cand.applyAsLong(q[0] + dx, findL.get().applyAsLong((q[0] + dx) * (m + 2L), q[1])) > 0)
                && scan.get().test(dx + 1)))
            ? IntStream.range(0, k).mapToObj(i -> Integer.valueOf(rd.getAsInt()) instanceof Integer a && Integer.valueOf(rd.getAsInt()) instanceof Integer b
                && (q[0] = swap ? b : a) > 0 && (q[1] = swap ? a : b) > 0
                && (best[0] = Long.MAX_VALUE) > 0
                && scan.get().test(0)
                && Long.valueOf(best[0] % 100000000000L / 200000L) instanceof Long oR && Long.valueOf(best[0] % 200000L) instanceof Long oC
                && Long.valueOf((swap ? oC : oR) * (m + 2L) + (swap ? oR : oC)) instanceof Long kk
                && Long.valueOf(probe.get().applyAsLong(kk, (kk * 0x9E3779B97F4A7C15L) >>> 40 & (cap - 1))) instanceof Long sl
                && (hk[sl.intValue()] = kk) >= 0 && (rv[sl.intValue()] = (swap ? oR : oC).intValue() + 1) > 0 && (lv[sl.intValue()] = (swap ? oR : oC).intValue() - 1) >= 0
                ? oR + " " + oC : "").collect(Collectors.joining("\n")) : ""), "", 1 << 28).start();
    }
}
