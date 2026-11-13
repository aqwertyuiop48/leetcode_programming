import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw && Integer.valueOf(raw.length) instanceof Integer len
            && new int[len / 2 + 2] instanceof int[] t && new int[4] instanceof int[] f
            && IntStream.range(0, len + 1).map(i -> Integer.valueOf(i < len ? raw[i] : 32) instanceof Integer c
                ? (c >= 48 && c <= 57 ? (f[3] = f[3] * 10 + c - 48) + (f[1] = 1) : (f[1] == 1 ? (t[f[2]++] = f[0] == 1 ? -f[3] : f[3]) + (f[3] = 0) + (f[0] = 0) + (f[1] = 0) : 0)
                    + (c == 45 ? (f[0] = 1) : 0) + (c == 65 ? (t[f[2]++] = -1) : 0) + (c == 87 ? (t[f[2]++] = -2) : 0)) * 0 : 0).sum() == 0
            && Integer.valueOf(f[2]) instanceof Integer N && Integer.valueOf(t[0]) instanceof Integer n && Integer.valueOf(t[1]) instanceof Integer m && Integer.valueOf(t[2]) instanceof Integer k
            && new int[k + 1] instanceof int[] gs && new long[N / 3 + 2] instanceof long[] keys && new int[4] instanceof int[] pp && Integer.valueOf(pp[0] = 3) != null
            && IntStream.range(0, k).filter(g -> Integer.valueOf(t[pp[0]]) instanceof Integer ln && (gs[g + 1] = gs[g] + ln) >= 0
                && IntStream.range(0, ln).filter(b -> (keys[gs[g] + b] = ((long) g << 52) | ((long) t[pp[0] + 1 + 3 * b] << 41) | ((long) t[pp[0] + 2 + 3 * b] << 30) | t[pp[0] + 3 + 3 * b]) < 0).count() >= 0
                && (pp[0] += 1 + 3 * ln) < 0).count() >= 0
            && Integer.valueOf(t[pp[0]]) instanceof Integer q && Integer.valueOf(pp[1] = pp[0] + 1) != null
            && Integer.valueOf((int) Arrays.stream(t, 0, N).filter(v -> v == -1).count()) instanceof Integer A
            && new int[A + 1] instanceof int[] x1 && new int[A + 1] instanceof int[] y1 && new int[A + 1] instanceof int[] x2 && new int[A + 1] instanceof int[] y2
            && new byte[k][A] instanceof byte[][] stt && new int[k] instanceof int[] on && IntStream.range(0, k).filter(g -> (on[g] = 1) < 0).count() >= 0
            && IntStream.range(0, q).map(e -> (t[pp[1]] == -2 ? (on[t[pp[1] + 1] - 1] ^= 1) * 0 + (pp[1] += 2) * 0
                : (x1[pp[2]] = t[pp[1] + 1]) * 0 + (y1[pp[2]] = t[pp[1] + 2]) * 0 + (x2[pp[2]] = t[pp[1] + 3]) * 0 + (y2[pp[2]] = t[pp[1] + 4]) * 0
                    + IntStream.range(0, k).map(g -> stt[g][pp[2]] = (byte) on[g]).sum() * 0 + (pp[2]++) * 0 + (pp[1] += 5) * 0)).sum() == 0
            && Arrays.stream(keys, 0, gs[k]).sorted().toArray() instanceof long[] sk
            && IntStream.range(0, 4 * A).mapToLong(c -> Integer.valueOf(c / 4) instanceof Integer a && Integer.valueOf((c & 1) == 0 ? x2[a] : x1[a] - 1) instanceof Integer X
                && Integer.valueOf((c & 2) == 0 ? y2[a] : y1[a] - 1) instanceof Integer Y
                ? (X <= 0 || Y <= 0 ? -1L : ((long) X << 46) | ((long) Y << 34) | ((long) a << 2) | ((c & 1) ^ ((c >> 1) & 1))) : -1L).filter(v -> v >= 0).sorted().toArray() instanceof long[] cs
            && Integer.valueOf(cs.length) instanceof Integer C
            && Arrays.stream(cs).mapToInt(v -> (int) (v >> 46)).toArray() instanceof int[] cX && Arrays.stream(cs).mapToInt(v -> (int) ((v >> 34) & 2047)).toArray() instanceof int[] cY
            && Arrays.stream(cs).mapToInt(v -> (int) ((v >> 2) & 0xFFFFFFFFL)).toArray() instanceof int[] cA && Arrays.stream(cs).mapToInt(v -> 1 - 2 * (int) (v & 3)).toArray() instanceof int[] cS
            && new long[A + 1] instanceof long[] res && new int[n + 2] instanceof int[] rs && new long[2112] instanceof long[] inP && new long[40] instanceof long[] blkP
            && ((IntBinaryOperator) (lo, hi) -> IntStream.range(lo, hi).filter(j -> Integer.valueOf((int) (sk[j] >> 30 & 2047)) instanceof Integer y && Long.valueOf(sk[j] & 1073741823L) instanceof Long w
                        && IntStream.range(y, (y >> 6 << 6) + 64).filter(i -> (inP[i] += w) < 0).count() + IntStream.range((y >> 6) + 1, 34).filter(b -> (blkP[b] += w) < 0).count() < 0).map(j -> 0).sum()) instanceof IntBinaryOperator add
            && IntStream.range(0, k).filter(g -> IntStream.range(0, A).anyMatch(a -> stt[g][a] == 1)
                && Integer.valueOf(gs[g]) instanceof Integer s && Integer.valueOf(gs[g + 1]) instanceof Integer e
                && IntStream.range(0, n + 2).filter(i -> (rs[i] = 0) != 0).count() >= 0
                && IntStream.range(s, e).filter(j -> ++rs[(int) (sk[j] >> 41 & 2047)] < 0).count() >= 0
                && IntStream.range(1, n + 2).filter(x -> (rs[x] += rs[x - 1]) < 0).count() >= 0
                && IntStream.range(0, 2112).filter(i -> (inP[i] = 0) != 0).count() >= 0
                && IntStream.range(0, 40).filter(i -> (blkP[i] = 0) != 0).count() >= 0
                && Integer.valueOf(pp[3] = s) != null
                && IntStream.range(0, C).filter(c -> (pp[3] < s + rs[cX[c]] ? add.applyAsInt(pp[3], s + rs[cX[c]]) : 0) >= 0
                    && (pp[3] = Math.max(pp[3], s + rs[cX[c]])) >= 0
                    && (stt[g][cA[c]] == 1 ? (res[cA[c]] += cS[c] * (blkP[cY[c] >> 6] + inP[cY[c]])) : 0L) == Long.MIN_VALUE).count() >= 0
                && Boolean.TRUE).count() >= 0
            ? LongStream.range(0, A).mapToObj(a -> String.valueOf(res[(int) a])).collect(Collectors.joining("\n")) : "");
    }
}
