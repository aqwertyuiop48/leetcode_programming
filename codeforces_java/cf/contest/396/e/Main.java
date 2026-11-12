
import java.math.BigInteger;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new long[200010] instanceof long[] T && new long[3] instanceof long[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i -> (i < raw.length && raw[i] > 47)
                ? (ps[1] = ps[1] * 10 + raw[i] - 48) >= 0 && (ps[2] = 1) > 0
                : ps[2] == 0 || ((T[(int) ps[0]++] = ps[1]) >= 0 && (ps[1] = 0) == 0 && (ps[2] = 0) == 0))
            && Integer.valueOf((int) T[0]) instanceof Integer m && Long.valueOf(T[2 * m + 1]) instanceof Long K
            && Integer.valueOf((int) T[2 * m - 1]) instanceof Integer N
            && new short[N / 2 + 2] instanceof short[] SP
            && IntStream.rangeClosed(0, ((int) Math.sqrt(N) - 3) / 2).map(i -> (int) Math.sqrt(N) - 1 + ((int) Math.sqrt(N) & 1) - 2 * i)
                .filter(i -> i > 2 && IntStream.rangeClosed(2, (int) Math.sqrt(i)).noneMatch(d -> i % d == 0))
                .allMatch(i -> IntStream.rangeClosed(0, (N - i * i) / (2 * i)).map(c -> SP[(i * i + 2 * i * c) >> 1] = (short) i).max().isPresent())
            && new long[N / 2 + 2] instanceof long[] accH && new long[N / 2 + 2] instanceof long[] accL && new int[N / 2 + 2] instanceof int[] head && new int[N / 2 + 2] instanceof int[] W0 && new int[80000] instanceof int[] OL
            && new long[][] {new long[100000]} instanceof long[][] EV && new int[][] {new int[100000]} instanceof int[][] NX && new long[1000][] instanceof long[][] BE && new int[1000] instanceof int[] BC
            && new int[7] instanceof int[] en && new long[][] {new long[256], null} instanceof long[][] SRC && new long[8] instanceof long[] S
            && new IntPredicate[4] instanceof IntPredicate[] fr
            && ((LongPredicate) key -> en[2] < 1000
                ? ((BE[en[2]] != null && BC[en[2]] < BE[en[2]].length) || (BE[en[2]] = BE[en[2]] == null ? new long[64] : Arrays.copyOf(BE[en[2]], BE[en[2]].length * 2)) != null) && (BE[en[2]][BC[en[2]]++] = key) > 0
                : (en[0] + 1 < EV[0].length || ((EV[0] = Arrays.copyOf(EV[0], EV[0].length * 2)) != null && (NX[0] = Arrays.copyOf(NX[0], NX[0].length * 2)) != null))
                    && (EV[0][++en[0]] = key) > 0 && (NX[0][en[0]] = head[en[5]]) >= 0 && (head[en[5]] = en[0]) > 0) instanceof LongPredicate ep
            && (fr[0] = x -> x <= 1 || ((en[2] = (x & 1) == 0 ? 2 : SP[x >> 1] == 0 ? x : SP[x >> 1]) > 0 && (en[5] = en[2] >> 1 & -(en[2] & 1)) >= 0
                && (S[3] == 0 ? W0[en[5]]++ >= 0 : ep.test(S[3] * 2 + 1))
                && (S[4] >= K || ep.test(S[4] * 2))
                && (accH[en[5]] += (S[4] - S[3]) >> 30) >= 0 && (accL[en[5]] += (S[4] - S[3]) & 1073741823L) >= 0
                && fr[0].test(x / en[2]))) != null
            && ((LongSupplier) () -> S[3] < 0 ? 0L : (S[5] += S[4] - S[3]) >= 0 && fr[0].test((int) S[7] - 1) ? 0L : 1L) instanceof LongSupplier fl
            && ((LongBinaryOperator) (s, t) -> S[4] == s ? (S[4] = t) : fl.getAsLong() + (S[3] = s) * 0 + (S[4] = t)) instanceof LongBinaryOperator add
            && ((LongBinaryOperator) (e, len) -> S[2] > 1 && len > K / (S[2] - 1) ? K : Math.min(K, e + (S[2] - 1) * len)) instanceof LongBinaryOperator sat
            && ((LongPredicate) t2 -> (S[6] = t2 - S[0]) <= 0 || ((S[2] == 0
                    ? Math.min(S[1], S[6]) == 0 || (add.applyAsLong(S[0], S[0] + Math.min(S[1], S[6])) >= 0 && (S[1] -= Math.min(S[1], S[6])) >= 0)
                    : S[1] > 0
                        ? add.applyAsLong(S[0], S[0] + S[6]) >= 0 && (S[1] = sat.applyAsLong(S[1], S[6])) >= 0
                        : (S[6] < 2 || add.applyAsLong(S[0] + 1, S[0] + S[6]) >= 0) && (S[1] = sat.applyAsLong(S[2], S[6] - 1)) >= 0)
                && (S[0] = t2) >= 0)) instanceof LongPredicate seg
            && (fr[2] = i -> i == 0 || (en[3] < 256 && (SRC[0][en[3]++] = EV[0][i]) > 0 && fr[2].test(NX[0][i]))) != null
            && (fr[3] = idx -> seg.test(idx < en[3] ? Math.min(SRC[1][idx] >> 1, K) : K) && (idx >= en[3] || ((S[2] += (SRC[1][idx] & 1) == 1 ? 1 : -1) >= 0 && fr[3].test(idx + 1)))) != null
            && (en[1] = m - 1) >= 0
            && (fr[1] = q -> (S[7] = q) > 0 && (en[6] = q >> 1 & -(q & 1)) >= 0
                && Long.valueOf(en[1] >= 0 && T[1 + 2 * en[1]] == q ? T[2 + 2 * en[1]--] : 0L) instanceof Long a
                && Boolean.valueOf(head[en[6]] == 0 && W0[en[6]] == 0 && (q >= 1000 || BC[q] == 0)) instanceof Boolean fast
                && ((a == 0 && fast) || ((fast
                    ? (S[3] = 0) == 0 && (S[4] = Math.min(a, K)) > 0 && (S[5] = S[4]) > 0 && fr[0].test(q - 1)
                    : (S[0] = 0) == 0 && (S[1] = Math.min(a, K)) >= 0 && (S[2] = W0[en[6]]) >= 0 && (S[3] = -1) < 0 && (S[4] = -1) < 0 && (S[5] = 0) == 0
                    && (q < 1000
                        ? (SRC[1] = BE[q] == null ? SRC[0] : BE[q]) != null && (en[3] = BC[q]) >= 0
                        : (SRC[1] = SRC[0]) != null && (en[3] = 0) == 0
                            && (head[en[6]] == 0 || fr[2].test(head[en[6]]) || ((SRC[1] = IntStream.iterate(head[en[6]], i -> i != 0, i -> NX[0][i]).mapToLong(i -> EV[0][i]).toArray()) != null && (en[3] = SRC[1].length) > 0)))
                    && (en[3] < 2 || CompletableFuture.runAsync(() -> Arrays.sort(SRC[1], 0, en[3]), Runnable::run).isDone())
                    && (en[3] < 257 ? fr[3].test(0) : IntStream.rangeClosed(0, en[3]).allMatch(idx -> seg.test(idx < en[3] ? Math.min(SRC[1][idx] >> 1, K) : K) && (idx >= en[3] || (S[2] += (SRC[1][idx] & 1) == 1 ? 1 : -1) >= 0)))
                    && fl.getAsLong() == 0)
                    && Long.valueOf(Math.floorDiv(accL[en[6]] + a - S[5], 1073741824L)) instanceof Long cy
                    && (accL[en[6]] = accL[en[6]] + a - S[5] - (cy << 30)) >= 0 && (accH[en[6]] += cy) >= 0 && (accH[en[6]] == 0 && accL[en[6]] == 0 || (OL[en[4]++] = q) > 0)))) != null
            && IntStream.rangeClosed(0, (N - 1 + (N & 1) - 3) / 2).map(i -> N - 1 + (N & 1) - 2 * i).filter(q -> SP[q >> 1] == 0).allMatch(fr[1])
            && fr[1].test(2)
            && new StringBuilder() instanceof StringBuilder sb
            && Integer.valueOf(IntStream.range(0, en[4]).map(i -> OL[en[4] - 1 - i]).map(i -> sb.append((char) 10).append(i).append((char) 32).append(accH[i >> 1 & -(i & 1)] >> 33 == 0 ? Long.toString((accH[i >> 1 & -(i & 1)] << 30) + accL[i >> 1 & -(i & 1)]) : BigInteger.valueOf(accH[i >> 1 & -(i & 1)]).shiftLeft(30).add(BigInteger.valueOf(accL[i >> 1 & -(i & 1)])).toString()) != null ? 1 : 0).sum()) instanceof Integer w
            ? w + sb.toString() : "");
    }
}



