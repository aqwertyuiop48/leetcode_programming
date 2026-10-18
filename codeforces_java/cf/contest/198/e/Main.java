import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Long.valueOf(s.nextLong()) instanceof Long x0 && Long.valueOf(s.nextLong()) instanceof Long y0
            && Long.valueOf(s.nextLong()) instanceof Long p0 && Long.valueOf(s.nextLong()) instanceof Long r0
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && IntStream.range(0, n).mapToObj(i -> new long[]{s.nextLong(), s.nextLong(), s.nextLong(), s.nextLong(), s.nextLong()}).sorted(Comparator.comparingLong(o -> o[2])).toList() instanceof List<long[]> ob
            && ob.stream().mapToLong(o -> o[2]).toArray() instanceof long[] mass
            && Integer.valueOf(Integer.highestOneBit(2 * n - 1)) instanceof Integer N
            && new long[2 * N] instanceof long[] t
            && IntStream.range(0, 2 * N).allMatch(i -> (t[i] = Long.MAX_VALUE) > 0)
            && IntStream.range(0, n).allMatch(i -> (t[N + i] = (ob.get(i)[0] - x0) * (ob.get(i)[0] - x0) + (ob.get(i)[1] - y0) * (ob.get(i)[1] - y0)) >= 0)
            && IntStream.iterate(N - 1, i -> i >= 1, i -> i - 1).allMatch(i -> (t[i] = Math.min(t[2 * i], t[2 * i + 1])) >= 0)
            && new long[2] instanceof long[] q
            && new AtomicReference<IntUnaryOperator>() instanceof AtomicReference<IntUnaryOperator> find
            && find.compareAndSet(null, nd -> Integer.valueOf(N >> (31 - Integer.numberOfLeadingZeros(nd))) instanceof Integer len
                && Integer.valueOf((nd - Integer.highestOneBit(nd)) * len) instanceof Integer l
                ? l >= q[0] || t[nd] > q[1] ? -1 : nd >= N ? nd - N : Integer.valueOf(find.get().applyAsInt(2 * nd)) instanceof Integer res ? res >= 0 ? res : find.get().applyAsInt(2 * nd + 1) : -1
                : -1)
            && new ArrayDeque<Integer>() instanceof ArrayDeque<Integer> dq
            && new long[1] instanceof long[] total
            && ((LongBinaryOperator) (p, r) -> (q[0] = IntStream.range(0, 40).boxed().reduce(new int[]{0, n}, (lh, z) -> lh[0] < lh[1] ? mass[(lh[0] + lh[1]) / 2] <= p ? new int[]{(lh[0] + lh[1]) / 2 + 1, lh[1]} : new int[]{lh[0], (lh[0] + lh[1]) / 2} : lh, (u, w) -> u)[0]) >= 0
                && (q[1] = r * r) >= 0
                ? Stream.generate(() -> find.get().applyAsInt(1)).takeWhile(i -> i >= 0)
                    .map(i -> (t[N + i] = Long.MAX_VALUE) > 0 && IntStream.iterate((N + i) / 2, j -> j >= 1, j -> j / 2).allMatch(j -> (t[j] = Math.min(t[2 * j], t[2 * j + 1])) >= 0)
                        && dq.add(i) && ++total[0] > 0).count() : 0) instanceof LongBinaryOperator process
            && process.applyAsLong(p0, r0) >= 0
            && Stream.generate(dq::poll).takeWhile(Objects::nonNull).peek(i -> process.applyAsLong(ob.get(i)[3], ob.get(i)[4])).count() >= 0
            ? total[0] : "");
    }
}
