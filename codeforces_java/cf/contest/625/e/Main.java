import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0 && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw && new int[raw.length / 2 + 2] instanceof int[] tok && new int[]{0, 0, 0} instanceof int[] st
            && IntStream.range(0, raw.length).filter(i -> raw[i] >= 48 ? (st[1] = st[1] * 10 + raw[i] - 48) >= 0 & (st[2] = 1) > 0 : st[2] == 0 || (tok[st[0]++] = st[1]) >= 0 & (st[1] = 0) == 0 & (st[2] = 0) == 0).count() >= 0
            && Integer.valueOf(tok[0]) instanceof Integer n && Long.valueOf(tok[1]) instanceof Long m
            && new long[n] instanceof long[] P0 && new long[n] instanceof long[] R0 && new long[n] instanceof long[] A && new int[n] instanceof int[] nxt && new int[n] instanceof int[] prv && new boolean[n] instanceof boolean[] alive && new long[n] instanceof long[] ver
            && IntStream.range(0, n).allMatch(i -> (P0[i] = tok[2 + 2 * i] - 1) >= -1 && (A[i] = tok[3 + 2 * i]) >= 0 && (alive[i] = true))
            && LongStream.range(0, n).map(i -> P0[(int) i] << 17 | i).sorted().mapToInt(v -> (int) (v & 131071)).toArray() instanceof int[] ord
            && IntStream.range(0, n).allMatch(t -> (nxt[ord[t]] = ord[(t + 1) % n]) >= 0 && (prv[ord[(t + 1) % n]] = ord[t]) >= 0)
            && ((ToLongFunction<long[]>) q -> (P0[(int) q[0]] + ((q[1] + (q[0] < q[2] ? 1 : 0) - R0[(int) q[0]]) % m) * (A[(int) q[0]] % m)) % m) instanceof ToLongFunction<long[]> pos
            && new PriorityQueue<long[]>((x, y) -> x[0] != y[0] ? Long.compare(x[0], y[0]) : Long.compare(x[1], y[1])) instanceof PriorityQueue<long[]> pq
            && ((LongBinaryOperator) (i, k) -> Integer.valueOf(nxt[(int) i]) instanceof Integer j && ++ver[(int) i] > 0 && j != i
                && Long.valueOf(((pos.applyAsLong(new long[]{j, k, i}) - pos.applyAsLong(new long[]{i, k, i})) % m + m) % m) instanceof Long d
                && Long.valueOf(A[(int) i] <= 0 ? -1 : d <= A[(int) i] ? k : A[(int) i] > A[j] ? k + (d - A[j] - 1) / (A[(int) i] - A[j]) : -1) instanceof Long ek
                && ek >= 0 && pq.add(new long[]{ek, i, ver[(int) i]}) ? 1L : 0L) instanceof LongBinaryOperator sched
            && ((Predicate<long[]>) e -> Integer.valueOf((int) e[1]) instanceof Integer i && alive[i] && ver[i] == e[2] && Long.valueOf(e[0]) instanceof Long k
                && Long.valueOf(pos.applyAsLong(new long[]{i, k, i})) instanceof Long p0 && Long.valueOf(A[i]) instanceof Long a
                && Long.valueOf(IntStream.iterate(nxt[i], j -> j != i && ((pos.applyAsLong(new long[]{j, k, i}) - p0) % m + m) % m <= a && !(alive[j] = false) && (nxt[i] = nxt[j]) >= 0 && (prv[nxt[j]] = i) >= 0, j -> nxt[i]).count()) instanceof Long c
                && (P0[i] = (p0 + a) % m) >= 0 && (R0[i] = k + 1) > 0 && (A[i] = Math.max(0, a - c)) >= 0
                && (nxt[i] == i || sched.applyAsLong(i, k + 1) >= 0) && (prv[i] == i || sched.applyAsLong(prv[i], k + (prv[i] < i ? 1 : 0)) >= 0)) instanceof Predicate<long[]> proc
            && IntStream.range(0, n).allMatch(i -> sched.applyAsLong(i, 0) >= 0)
            && Stream.generate(pq::poll).takeWhile(e -> e != null).filter(proc::test).count() >= 0
            ? IntStream.range(0, n).filter(i -> alive[i]).count() + "\n" + IntStream.range(0, n).filter(i -> alive[i]).mapToObj(i -> String.valueOf(i + 1)).collect(Collectors.joining(" ")) : "");
    }
}
