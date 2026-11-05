import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new long[raw.length / 2 + 8] instanceof long[] t && new long[3] instanceof long[] ps
            && IntStream.rangeClosed(0, raw.length).filter(i -> i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                : (ps[2] != 1 || ((t[(int) ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0).count() >= 0
            && Integer.valueOf((int) t[0]) instanceof Integer n
            && Integer.valueOf((int) Math.max(2L, IntStream.rangeClosed(1, n).mapToLong(i -> t[i]).max().getAsLong())) instanceof Integer M
            && IntStream.rangeClosed(1, n).map(i -> (int) t[i]).toArray() instanceof int[] c
            && new short[M + 1] instanceof short[] spf
            && IntStream.rangeClosed(3, 3162).allMatch(p -> (long) p * p > M || (p & 1) == 0 || spf[p] != 0
                || IntStream.rangeClosed(0, (M - p * p) / (2 * p)).filter(m -> spf[p * p + 2 * p * m] == 0 && (spf[p * p + 2 * p * m] = (short) p) > 0).count() >= 0)
            && new int[M + 1] instanceof int[] f && new int[]{1} instanceof int[] live
            && IntStream.iterate(0, z -> live[0] != 0, z -> z + 1).allMatch(z -> (live[0] = 0) == 0
                && IntStream.range(0, n).filter(i -> c[i] >= 2 && Integer.valueOf((c[i] & 1) == 0 ? 2 : spf[c[i]] == 0 ? c[i] : spf[c[i]]) instanceof Integer p
                    && (c[i] /= p) > 0 && (c[i] % p == 0 || ++f[p] > 0) && (c[i] < 2 || (live[0] = 1) > 0)).count() >= 0)
            && IntStream.rangeClosed(1, M).filter(i -> (f[i] += f[i - 1]) < 0).count() == 0
            ? IntStream.range(0, (int) t[n + 1]).mapToObj(k -> String.valueOf(f[(int) Math.min(t[n + 3 + 2 * k], M)] - f[(int) Math.min(t[n + 2 + 2 * k] - 1, M)])).collect(Collectors.joining("\n")) : "");
    }
}

