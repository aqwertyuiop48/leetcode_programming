import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw && new int[raw.length / 2 + 2] instanceof int[] v && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i -> i < raw.length && raw[i] >= 48 ? (ps[1] = ps[1] * 10 + raw[i] - 48) >= 0 && (ps[2] = 1) == 1 : ps[2] == 0 || (v[ps[0]++] = ps[1]) >= 0 && (ps[1] = 0) == 0 && (ps[2] = 0) == 0)
            && Integer.valueOf(v[0]) instanceof Integer n && Integer.valueOf(v[1]) instanceof Integer m
            && Integer.valueOf(Integer.highestOneBit(2 * m) * 2) instanceof Integer N
            && new long[N] instanceof long[] f && new boolean[m + 1] instanceof boolean[] inA
            && IntStream.range(0, n).allMatch(i -> (f[v[2 + i]] = 1) == 1 && (inA[v[2 + i]] = true))
            && new long[N] instanceof long[] rt && new long[1] instanceof long[] tmp
            && IntStream.iterate(1, h -> h < N, h -> h * 2).allMatch(h -> (rt[h] = 1) == 1 && Long.valueOf(java.math.BigInteger.valueOf(3).modPow(java.math.BigInteger.valueOf((998244353L - 1) / (2L * h)), java.math.BigInteger.valueOf(998244353L)).longValue()) instanceof Long base
                && IntStream.range(1, h).allMatch(j -> (rt[h + j] = rt[h + j - 1] * base % 998244353L) > 0))
            && IntStream.iterate(N / 2, h -> h >= 1, h -> h / 2).allMatch(h -> Stream.of(0).peek(z -> IntStream.range(0, N / 2).forEach(b ->
                f[((b & -h) << 1) | (b & (h - 1))] = (tmp[0] = f[((b & -h) << 1) | (b & (h - 1))] + f[((b & -h) << 1) | (b & (h - 1)) | h]) >= 0 && (f[((b & -h) << 1) | (b & (h - 1)) | h] = (f[((b & -h) << 1) | (b & (h - 1))] - f[((b & -h) << 1) | (b & (h - 1)) | h] + 998244353L) * rt[h + (b & (h - 1))] % 998244353L) >= 0
                    ? tmp[0] >= 998244353L ? tmp[0] - 998244353L : tmp[0] : 0)).findFirst().isPresent())
            && IntStream.range(0, N).allMatch(i -> (f[i] = f[i] * f[i] % 998244353L) >= 0)
            && IntStream.iterate(1, h -> h < N, h -> h * 2).allMatch(h -> Stream.of(0).peek(z -> IntStream.range(0, N / 2).forEach(b ->
                f[((b & -h) << 1) | (b & (h - 1))] = (tmp[0] = f[((b & -h) << 1) | (b & (h - 1))] + f[((b & -h) << 1) | (b & (h - 1)) | h] * rt[h + (b & (h - 1))] % 998244353L) >= 0 && (f[((b & -h) << 1) | (b & (h - 1)) | h] = (f[((b & -h) << 1) | (b & (h - 1))] - f[((b & -h) << 1) | (b & (h - 1)) | h] * rt[h + (b & (h - 1))] % 998244353L + 998244353L) % 998244353L) >= 0
                    ? tmp[0] >= 998244353L ? tmp[0] - 998244353L : tmp[0] : 0)).findFirst().isPresent())
            && IntStream.rangeClosed(1, m).allMatch(x -> f[(N - x) % N] == 0 || inA[x])
            ? new StringBuilder("YES\n") instanceof StringBuilder sb && Long.valueOf(IntStream.rangeClosed(1, m).filter(x -> inA[x] && f[(N - x) % N] == 0).count()) instanceof Long cntB
                && sb.append(cntB).append('\n') != null && IntStream.rangeClosed(1, m).filter(x -> inA[x] && f[(N - x) % N] == 0).allMatch(x -> sb.append(x).append(' ') != null) ? sb : "" : "NO");
    }
}
