import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new long[raw.length / 2 + 4] instanceof long[] vals && new long[4] instanceof long[] pr
            && IntStream.rangeClosed(0, raw.length).allMatch(i -> (i < raw.length && raw[i] > 47)
                ? (pr[0] = pr[0] * 10 + raw[i] - 48) >= 0 && (pr[2] = 1) > 0
                : (i < raw.length && raw[i] == 45) ? (pr[3] = 1) > 0 && (pr[2] = 1) > 0
                : pr[2] == 0 || ((vals[(int) pr[1]++] = pr[3] == 1 ? -pr[0] : pr[0]) != Long.MAX_VALUE && (pr[0] = 0) == 0 && (pr[2] = 0) == 0 && (pr[3] = 0) == 0))
            && Integer.valueOf((int) vals[0]) instanceof Integer n && Integer.valueOf((int) vals[1]) instanceof Integer q
            && Arrays.copyOfRange(vals, 2, 2 + n) instanceof long[] v
            && IntStream.range(0, n).map(i -> (int) vals[2 + n + i]).toArray() instanceof int[] c
            ? IntStream.range(0, (q + 3) / 4).parallel().mapToObj(qi -> new long[]{vals[2 + 2 * n + 2 * Math.min(qi * 4 + 0, q - 1)], vals[3 + 2 * n + 2 * Math.min(qi * 4 + 0, q - 1)], vals[2 + 2 * n + 2 * Math.min(qi * 4 + 1, q - 1)], vals[3 + 2 * n + 2 * Math.min(qi * 4 + 1, q - 1)], vals[2 + 2 * n + 2 * Math.min(qi * 4 + 2, q - 1)], vals[3 + 2 * n + 2 * Math.min(qi * 4 + 2, q - 1)], vals[2 + 2 * n + 2 * Math.min(qi * 4 + 3, q - 1)], vals[3 + 2 * n + 2 * Math.min(qi * 4 + 3, q - 1)]} instanceof long[] ab
                && new long[n + 1] instanceof long[] dp0 && new long[]{0, Long.MIN_VALUE / 4, 0, 0, 0, 0} instanceof long[] s0 && new long[n + 1] instanceof long[] dp1 && new long[]{0, Long.MIN_VALUE / 4, 0, 0, 0, 0} instanceof long[] s1 && new long[n + 1] instanceof long[] dp2 && new long[]{0, Long.MIN_VALUE / 4, 0, 0, 0, 0} instanceof long[] s2 && new long[n + 1] instanceof long[] dp3 && new long[]{0, Long.MIN_VALUE / 4, 0, 0, 0, 0} instanceof long[] s3
                && IntStream.rangeClosed(0, n).allMatch(i -> (dp0[i] = Long.MIN_VALUE / 4) + (dp1[i] = Long.MIN_VALUE / 4) + (dp2[i] = Long.MIN_VALUE / 4) + (dp3[i] = Long.MIN_VALUE / 4) < 0)
                && IntStream.range(0, n).mapToLong(i ->
                    (s0[5] = (dp0[c[i]] = (s0[4] = Math.max(dp0[c[i]], Math.max(dp0[c[i]] + v[i] * ab[0], (s0[2] != c[i] ? s0[0] : s0[1]) + v[i] * ab[1])))) > s0[0]
                        ? (s0[2] != c[i] ? (s0[1] = s0[0]) : 0L) + (s0[0] = s0[4]) + (s0[2] = c[i])
                        : (s0[2] != c[i] && s0[4] > s0[1] ? (s0[1] = s0[4]) : 0L)) + 
                    (s1[5] = (dp1[c[i]] = (s1[4] = Math.max(dp1[c[i]], Math.max(dp1[c[i]] + v[i] * ab[2], (s1[2] != c[i] ? s1[0] : s1[1]) + v[i] * ab[3])))) > s1[0]
                        ? (s1[2] != c[i] ? (s1[1] = s1[0]) : 0L) + (s1[0] = s1[4]) + (s1[2] = c[i])
                        : (s1[2] != c[i] && s1[4] > s1[1] ? (s1[1] = s1[4]) : 0L)) + 
                    (s2[5] = (dp2[c[i]] = (s2[4] = Math.max(dp2[c[i]], Math.max(dp2[c[i]] + v[i] * ab[4], (s2[2] != c[i] ? s2[0] : s2[1]) + v[i] * ab[5])))) > s2[0]
                        ? (s2[2] != c[i] ? (s2[1] = s2[0]) : 0L) + (s2[0] = s2[4]) + (s2[2] = c[i])
                        : (s2[2] != c[i] && s2[4] > s2[1] ? (s2[1] = s2[4]) : 0L)) + 
                    (s3[5] = (dp3[c[i]] = (s3[4] = Math.max(dp3[c[i]], Math.max(dp3[c[i]] + v[i] * ab[6], (s3[2] != c[i] ? s3[0] : s3[1]) + v[i] * ab[7])))) > s3[0]
                        ? (s3[2] != c[i] ? (s3[1] = s3[0]) : 0L) + (s3[0] = s3[4]) + (s3[2] = c[i])
                        : (s3[2] != c[i] && s3[4] > s3[1] ? (s3[1] = s3[4]) : 0L))).sum() * 0 == 0
                ? (qi * 4 + 0 < q ? s0[0] + "\n" : "") + (qi * 4 + 1 < q ? s1[0] + "\n" : "") + (qi * 4 + 2 < q ? s2[0] + "\n" : "") + (qi * 4 + 3 < q ? s3[0] + "\n" : "") : "").collect(Collectors.joining()).strip() : "");
    }
}
