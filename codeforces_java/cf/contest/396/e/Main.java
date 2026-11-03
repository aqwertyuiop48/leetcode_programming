import java.math.BigInteger;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new long[raw.length / 2 + 2] instanceof long[] T && new long[3] instanceof long[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i -> (i < raw.length && raw[i] > 47)
                ? (ps[1] = ps[1] * 10 + raw[i] - 48) >= 0 && (ps[2] = 1) > 0
                : ps[2] == 0 || ((T[(int) ps[0]++] = ps[1]) >= 0 && (ps[1] = 0) == 0 && (ps[2] = 0) == 0))
            && Integer.valueOf((int) T[0]) instanceof Integer m && Long.valueOf(T[2 * m + 1]) instanceof Long K
            && Integer.valueOf((int) IntStream.range(0, m).mapToLong(i -> T[1 + 2 * i]).max().getAsLong()) instanceof Integer N
            && new long[N + 1] instanceof long[] a && IntStream.range(0, m).allMatch(i -> (a[(int) T[1 + 2 * i]] = T[2 + 2 * i]) > 0)
            && new int[N + 1] instanceof int[] spf
            && IntStream.rangeClosed(0, 998).map(i -> 1000 - i).filter(i -> IntStream.rangeClosed(2, (int) Math.sqrt(i)).noneMatch(d -> i % d == 0)).allMatch(i -> IntStream.rangeClosed(1, N / i).allMatch(c -> (spf[c * i] = i) > 0))
            && IntStream.rangeClosed(2, N).filter(i -> spf[i] == 0).allMatch(i -> (spf[i] = i) > 0)
            && new int[N + 1] instanceof int[] head && new long[N + 1] instanceof long[] accH && new long[N + 1] instanceof long[] accL
            && new long[2000001] instanceof long[] evT && new int[2000001] instanceof int[] nxt
            && new long[8] instanceof long[] S && new int[1] instanceof int[] en
            && new IntPredicate[1] instanceof IntPredicate[] fr && new IntPredicate[1] instanceof IntPredicate[] go && new long[1][] instanceof long[][] EV
            && (fr[0] = mm -> mm <= 1 || (Integer.valueOf(spf[mm]) instanceof Integer f
                && (evT[++en[0]] = S[3] * 2 + 1) > 0 && (nxt[en[0]] = head[f]) >= 0 && (head[f] = en[0]) > 0
                && (S[4] >= K || ((evT[++en[0]] = S[4] * 2) > 0 && (nxt[en[0]] = head[f]) >= 0 && (head[f] = en[0]) > 0))
                && (accH[f] += S[6] >> 30) >= 0 && (accL[f] += S[6] & 1073741823L) >= 0 && fr[0].test(mm / f))) != null
            && ((BooleanSupplier) () -> S[3] < 0 || ((S[6] = S[4] - S[3]) > 0 && (S[5] += S[6]) > 0 && fr[0].test((int) S[7] - 1))) instanceof BooleanSupplier flush
            && ((BiPredicate<Long, Long>) (s, t) -> S[4] == s ? (S[4] = t) > 0 : flush.getAsBoolean() && (S[3] = s) >= 0 && (S[4] = t) > 0) instanceof BiPredicate<Long, Long> add
            && ((BiFunction<Long, Long, Long>) (e, len) -> S[2] > 1 && len > K / (S[2] - 1) ? K : Math.min(K, e + (S[2] - 1) * len)) instanceof BiFunction<Long, Long, Long> sat
            && ((LongPredicate) t2 -> Long.valueOf(t2 - S[0]) instanceof Long len
                && (len <= 0 || ((S[2] == 0
                    ? Long.valueOf(Math.min(S[1], len)) instanceof Long pl && (pl == 0 || add.test(S[0], S[0] + pl)) && (S[1] -= pl) >= 0
                    : S[1] > 0
                        ? add.test(S[0], S[0] + len) && (S[1] = sat.apply(S[1], len)) >= 0
                        : (len < 2 || add.test(S[0] + 1, S[0] + len)) && (S[1] = sat.apply(S[2], len - 1)) >= 0)
                    && (S[0] = t2) >= 0))) instanceof LongPredicate seg
            && (go[0] = idx -> seg.test(idx < EV[0].length ? Math.min(EV[0][idx] >> 1, K) : K) && (idx >= EV[0].length || ((S[2] += (EV[0][idx] & 1) == 1 ? 1 : -1) >= 0 && go[0].test(idx + 1)))) != null
            && IntStream.rangeClosed(0, N - 2).map(i -> N - i).filter(q -> spf[q] == q && (a[q] > 0 || head[q] != 0)).allMatch(q ->
                (head[q] == 0 ? new long[0] : IntStream.iterate(head[q], i -> i != 0, i -> nxt[i]).mapToLong(i -> evT[i]).sorted().toArray()) instanceof long[] ev
                && (S[0] = 0) == 0 && (S[1] = a[q]) >= 0 && (S[2] = 0) == 0 && (S[3] = -1) < 0 && (S[4] = -1) < 0 && (S[5] = 0) == 0 && (S[7] = q) > 0
                && (EV[0] = ev) != null
                && (ev.length < 2000 ? go[0].test(0) : IntStream.rangeClosed(0, ev.length).allMatch(idx -> seg.test(idx < ev.length ? Math.min(ev[idx] >> 1, K) : K) && (idx >= ev.length || (S[2] += (ev[idx] & 1) == 1 ? 1 : -1) >= 0)))
                && flush.getAsBoolean()
                && Long.valueOf(Math.floorDiv(accL[q] + a[q] - S[5], 1073741824L)) instanceof Long cy
                && (accL[q] = accL[q] + a[q] - S[5] - (cy << 30)) >= 0 && (accH[q] += cy) >= 0)
            && IntStream.rangeClosed(2, N).filter(i -> accH[i] != 0 || accL[i] != 0)
                .mapToObj(i -> "\n" + i + " " + (accH[i] >> 33 == 0 ? Long.toString((accH[i] << 30) + accL[i]) : BigInteger.valueOf(accH[i]).shiftLeft(30).add(BigInteger.valueOf(accL[i])).toString()))
                .collect(Collectors.toList()) instanceof List<String> lines
            ? lines.size() + String.join("", lines) : "");
    }
}
