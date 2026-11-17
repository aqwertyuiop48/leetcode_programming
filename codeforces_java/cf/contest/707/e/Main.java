import java.io.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw && Integer.valueOf(raw.length) instanceof Integer len && new int[1] instanceof int[] ptr
            && ((IntUnaryOperator) v -> ptr[0] < len && raw[ptr[0]] >= 48 && raw[ptr[0]] <= 57 ? v * 10 + raw[ptr[0]++] - 48 : v) instanceof IntUnaryOperator d
            && ((IntSupplier) () -> (ptr[0] < len && raw[ptr[0]] <= 32 ? ++ptr[0] : 0) * 0 + (ptr[0] < len && raw[ptr[0]] <= 32 ? ++ptr[0] : 0) * 0 + (ptr[0] < len && raw[ptr[0]] <= 32 ? ++ptr[0] : 0) * 0 + (ptr[0] < len && raw[ptr[0]] <= 32 ? ++ptr[0] : 0) * 0 + (raw[ptr[0]] >= 65 ? (raw[ptr[0]] == 65 ? (ptr[0] += 3) * 0 - 1 : (ptr[0] += 6) * 0 - 2) : d.applyAsInt(d.applyAsInt(d.applyAsInt(d.applyAsInt(d.applyAsInt(d.applyAsInt(d.applyAsInt(d.applyAsInt(d.applyAsInt(d.applyAsInt(0)))))))))))) instanceof IntSupplier nx
            && Integer.valueOf(nx.getAsInt()) instanceof Integer n && Integer.valueOf(nx.getAsInt()) instanceof Integer m && Integer.valueOf(nx.getAsInt()) instanceof Integer k
            && new int[k + 1] instanceof int[] gs && new long[k * 2000 + 1] instanceof long[] keys && new int[4] instanceof int[] pp
            && IntStream.range(0, k).allMatch(g -> Integer.valueOf(nx.getAsInt()) instanceof Integer ln && (gs[g + 1] = gs[g] + ln) >= 0
                && IntStream.range(0, ln).allMatch(b -> (keys[gs[g] + b] = ((long) g << 52) | ((long) nx.getAsInt() << 41) | ((long) nx.getAsInt() << 30) | nx.getAsInt()) >= 0))
            && Integer.valueOf(nx.getAsInt()) instanceof Integer q
            && new int[2001] instanceof int[] x1 && new int[2001] instanceof int[] y1 && new int[2001] instanceof int[] x2 && new int[2001] instanceof int[] y2
            && new byte[k][2001] instanceof byte[][] stt && new int[k] instanceof int[] on && IntStream.range(0, k).filter(g -> (on[g] = 1) < 0).count() == 0
            && IntStream.range(0, q).map(e -> (nx.getAsInt() == -2 ? (on[nx.getAsInt() - 1] ^= 1) * 0
                : (x1[pp[2]] = nx.getAsInt()) * 0 + (y1[pp[2]] = nx.getAsInt()) * 0 + (x2[pp[2]] = nx.getAsInt()) * 0 + (y2[pp[2]] = nx.getAsInt()) * 0
                    + IntStream.range(0, k).map(g -> stt[g][pp[2]] = (byte) on[g]).sum() * 0 + (pp[2]++) * 0)).sum() == 0
            && Integer.valueOf(pp[2]) instanceof Integer A
            && IntStream.of(0).peek(z -> Arrays.sort(keys, 0, gs[k])).sum() == 0 && keys instanceof long[] sk
            && IntStream.range(0, 4 * A).mapToLong(c -> Integer.valueOf(c / 4) instanceof Integer a && Integer.valueOf((c & 1) == 0 ? x2[a] : x1[a] - 1) instanceof Integer X
                && Integer.valueOf((c & 2) == 0 ? y2[a] : y1[a] - 1) instanceof Integer Y
                ? (X <= 0 || Y <= 0 ? -1L : ((long) X << 46) | ((long) Y << 34) | ((long) a << 2) | ((c & 1) ^ ((c >> 1) & 1))) : -1L).filter(v -> v >= 0).sorted().toArray() instanceof long[] cs
            && Integer.valueOf(cs.length) instanceof Integer C
            && Arrays.stream(cs).mapToInt(v -> (int) (v >> 46)).toArray() instanceof int[] cX && Arrays.stream(cs).mapToInt(v -> (int) ((v >> 34) & 2047)).toArray() instanceof int[] cY
            && Arrays.stream(cs).mapToInt(v -> (int) ((v >> 2) & 0xFFFFFFFFL)).toArray() instanceof int[] cA && Arrays.stream(cs).mapToInt(v -> 1 - 2 * (int) (v & 3)).toArray() instanceof int[] cS
            && new long[A + 1] instanceof long[] res && new int[n + 2] instanceof int[] rs
            && new long[2050] instanceof long[] fen && new int[2049 * 12] instanceof int[] QP && new int[2049 * 12] instanceof int[] UP
            && IntStream.rangeClosed(0, 2048).allMatch(pq -> IntStream.range(0, 12).allMatch(t -> (QP[pq * 12 + t] = t == 0 ? pq : QP[pq * 12 + t - 1] & (QP[pq * 12 + t - 1] - 1)) >= 0
                && (UP[pq * 12 + t] = t == 0 ? pq : UP[pq * 12 + t - 1] > 2048 ? 2049 : Math.min(2049, UP[pq * 12 + t - 1] + (UP[pq * 12 + t - 1] & -UP[pq * 12 + t - 1]))) >= 0))
            && ((IntBinaryOperator) (lo, hi) -> (int) IntStream.range(lo, hi).mapToLong(j -> (fen[UP[(int) (sk[j] >> 30 & 2047) * 12 + 0]] += sk[j] & 1073741823L) * 0L + (fen[UP[(int) (sk[j] >> 30 & 2047) * 12 + 1]] += sk[j] & 1073741823L) * 0L + (fen[UP[(int) (sk[j] >> 30 & 2047) * 12 + 2]] += sk[j] & 1073741823L) * 0L + (fen[UP[(int) (sk[j] >> 30 & 2047) * 12 + 3]] += sk[j] & 1073741823L) * 0L + (fen[UP[(int) (sk[j] >> 30 & 2047) * 12 + 4]] += sk[j] & 1073741823L) * 0L + (fen[UP[(int) (sk[j] >> 30 & 2047) * 12 + 5]] += sk[j] & 1073741823L) * 0L + (fen[UP[(int) (sk[j] >> 30 & 2047) * 12 + 6]] += sk[j] & 1073741823L) * 0L + (fen[UP[(int) (sk[j] >> 30 & 2047) * 12 + 7]] += sk[j] & 1073741823L) * 0L + (fen[UP[(int) (sk[j] >> 30 & 2047) * 12 + 8]] += sk[j] & 1073741823L) * 0L + (fen[UP[(int) (sk[j] >> 30 & 2047) * 12 + 9]] += sk[j] & 1073741823L) * 0L + (fen[UP[(int) (sk[j] >> 30 & 2047) * 12 + 10]] += sk[j] & 1073741823L) * 0L + (fen[UP[(int) (sk[j] >> 30 & 2047) * 12 + 11]] += sk[j] & 1073741823L) * 0L).sum()) instanceof IntBinaryOperator add
            && IntStream.range(0, k).filter(g -> IntStream.range(0, A).anyMatch(a -> stt[g][a] == 1)
                && Integer.valueOf(gs[g]) instanceof Integer s && Integer.valueOf(gs[g + 1]) instanceof Integer e
                && IntStream.range(0, n + 2).filter(i -> (rs[i] = 0) != 0).count() >= 0
                && IntStream.range(s, e).filter(j -> ++rs[(int) (sk[j] >> 41 & 2047)] < 0).count() >= 0
                && IntStream.range(1, n + 2).filter(x -> (rs[x] += rs[x - 1]) < 0).count() >= 0
                && Stream.of(0).peek(z -> Arrays.fill(fen, 0L)).findFirst().isPresent()
                && Integer.valueOf(pp[3] = s) != null
                && IntStream.range(0, C).filter(c -> (pp[3] < s + rs[cX[c]] ? add.applyAsInt(pp[3], s + rs[cX[c]]) : 0) >= 0
                    && (pp[3] = Math.max(pp[3], s + rs[cX[c]])) >= 0
                    && (stt[g][cA[c]] == 1 ? (res[cA[c]] += cS[c] * (fen[QP[cY[c] * 12 + 0]] + fen[QP[cY[c] * 12 + 1]] + fen[QP[cY[c] * 12 + 2]] + fen[QP[cY[c] * 12 + 3]] + fen[QP[cY[c] * 12 + 4]] + fen[QP[cY[c] * 12 + 5]] + fen[QP[cY[c] * 12 + 6]] + fen[QP[cY[c] * 12 + 7]] + fen[QP[cY[c] * 12 + 8]] + fen[QP[cY[c] * 12 + 9]] + fen[QP[cY[c] * 12 + 10]] + fen[QP[cY[c] * 12 + 11]])) : 0L) == Long.MIN_VALUE).count() >= 0
                && Boolean.TRUE).count() >= 0
            ? LongStream.range(0, A).mapToObj(a -> String.valueOf(res[(int) a])).collect(Collectors.joining("\n")) : "");
    }
}
