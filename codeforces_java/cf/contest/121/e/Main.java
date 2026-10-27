import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            new String(System.in.readAllBytes()).trim().split("[ \r\n]+") instanceof String[] t
            && (Integer) Integer.parseInt(t[0]) instanceof Integer n
            && (Integer) Integer.parseInt(t[1]) instanceof Integer m
            && (Integer) Integer.highestOneBit(Math.max(1, 2 * n - 1)) instanceof Integer N
            && IntStream.rangeClosed(1, 5).flatMap(len -> IntStream.range(0, 1 << len)
                .map(q -> IntStream.range(0, len).map(b -> ((q >> (len - 1 - b)) & 1) == 1 ? 7 : 4).reduce(0, (x, d) -> x * 10 + d)))
                .toArray() instanceof int[] luck
            && Arrays.stream(luck).map(x -> x * 2).toArray() instanceof int[] l2
            && ((IntUnaryOperator) v -> luck[-Arrays.binarySearch(l2, 2 * v - 1) - 1] - v) instanceof IntUnaryOperator dist
            && new int[2 * N] instanceof int[] mn
            && new int[2 * N] instanceof int[] cm
            && new int[2 * N] instanceof int[] lz
            && new int[3] instanceof int[] q
            && new int[]{2 + n} instanceof int[] ps
            && ((IntBinaryOperator) (nd, d) -> (mn[nd] -= d) * 0 + (lz[nd] += d) * 0) instanceof IntBinaryOperator ap
            && ((IntPredicate) nd ->
                lz[nd] == 0
                || (ap.applyAsInt(2 * nd, lz[nd]) == 0 && ap.applyAsInt(2 * nd + 1, lz[nd]) == 0 && (lz[nd] = 0) == 0)) instanceof IntPredicate pu
            && ((IntPredicate) nd ->
                (mn[nd] = Math.min(mn[2 * nd], mn[2 * nd + 1])) >= 0
                && (cm[nd] = (mn[2 * nd] == mn[nd] ? cm[2 * nd] : 0) + (mn[2 * nd + 1] == mn[nd] ? cm[2 * nd + 1] : 0)) >= 0) instanceof IntPredicate pull
            && IntStream.range(0, N).allMatch(i ->
                (lz[N + i] = i < n ? Integer.parseInt(t[2 + i]) : 0) >= 0
                && (mn[N + i] = i < n ? dist.applyAsInt(lz[N + i]) : 1 << 30) >= 0
                && (cm[N + i] = 1) > 0)
            && IntStream.iterate(N - 1, i -> i >= 1, i -> i - 1).allMatch(i -> pull.test(i))
            && new AtomicReference<IntPredicate>() instanceof AtomicReference<IntPredicate> U
            && U.getAndSet(nd ->
                (Integer) (31 - Integer.numberOfLeadingZeros(nd)) instanceof Integer dep
                && (Integer) (N >> dep) instanceof Integer w
                && (Integer) ((nd - (1 << dep)) * w) instanceof Integer lo
                && (Integer) (lo + w - 1) instanceof Integer hi
                && (q[1] < lo || hi < q[0]
                    || (q[0] <= lo && hi <= q[1] && mn[nd] - q[2] >= 0
                        ? ap.applyAsInt(nd, q[2]) == 0
                        : lo.equals(hi)
                            ? (lz[nd] += q[2]) > 0 && (mn[nd] = dist.applyAsInt(lz[nd])) >= 0
                            : pu.test(nd) && U.get().test(2 * nd) && U.get().test(2 * nd + 1) && pull.test(nd)))) == null
            && new AtomicReference<IntUnaryOperator>() instanceof AtomicReference<IntUnaryOperator> Q
            && Q.getAndSet(nd ->
                (Integer) (31 - Integer.numberOfLeadingZeros(nd)) instanceof Integer dep
                && (Integer) (N >> dep) instanceof Integer w
                && (Integer) ((nd - (1 << dep)) * w) instanceof Integer lo
                && (Integer) (lo + w - 1) instanceof Integer hi
                ? (q[1] < lo || hi < q[0]
                    ? 0
                    : q[0] <= lo && hi <= q[1]
                        ? (mn[nd] == 0 ? cm[nd] : 0)
                        : pu.test(nd) ? Q.get().applyAsInt(2 * nd) + Q.get().applyAsInt(2 * nd + 1) : 0)
                : 0) == null
            ? IntStream.range(0, m).map(i ->
                t[ps[0]].equals("add")
                    ? ((q[0] = Integer.parseInt(t[ps[0] + 1]) - 1) >= -1
                        && (q[1] = Integer.parseInt(t[ps[0] + 2]) - 1) >= -1
                        && (q[2] = Integer.parseInt(t[ps[0] + 3])) > 0
                        && (ps[0] += 4) > 0
                        && U.get().test(1) ? -1 : -2)
                    : ((q[0] = Integer.parseInt(t[ps[0] + 1]) - 1) >= -1
                        && (q[1] = Integer.parseInt(t[ps[0] + 2]) - 1) >= -1
                        && (ps[0] += 3) > 0
                        ? Q.get().applyAsInt(1) : -2))
                .filter(v -> v >= 0).mapToObj(String::valueOf).collect(Collectors.joining("\n"))
            : "");
    }
}

