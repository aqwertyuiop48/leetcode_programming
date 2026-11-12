import java.math.BigInteger;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] tk
            && Integer.valueOf(tk[0]) instanceof Integer m
            && new int[m] instanceof int[] qL && new int[m] instanceof int[] qN && new int[]{2, tk[1].length(), 0} instanceof int[] ps
            && IntStream.range(0, m).filter(i -> tk[ps[0]].equals("1")
                ? (ps[1] = tk[ps[0] + 1].length()) >= 0 & (ps[0] += 2) > 0
                : (qL[ps[2]] = ps[1]) >= 0 & (qN[ps[2]++] = Integer.parseInt(tk[ps[0] + 1])) >= 0 & (ps[0] += 2) > 0).count() >= 0
            && Integer.valueOf(ps[2]) instanceof Integer qc
            && Integer.valueOf(Arrays.stream(qN, 0, qc).max().orElse(1)) instanceof Integer N
            && new long[N + 5] instanceof long[] fact && new long[N + 5] instanceof long[] invf && new long[N + 5] instanceof long[] pw && new long[Math.max(N, 100000) + 5] instanceof long[] f && new long[N + 5] instanceof long[] g && new int[100002] instanceof int[] mx
            && (fact[0] = 1) == 1 && (pw[0] = 1) == 1
            && IntStream.rangeClosed(1, N + 3).filter(i -> (fact[i] = fact[i - 1] * i % 1000000007L) > 0 & (pw[i] = pw[i - 1] * 25 % 1000000007L) > 0).count() >= 0
            && (invf[N + 3] = BigInteger.valueOf(fact[N + 3]).modInverse(BigInteger.valueOf(1000000007L)).longValue()) > 0
            && IntStream.range(0, N + 3).map(j -> N + 3 - j).filter(i -> (invf[i - 1] = invf[i] * i % 1000000007L) > 0).count() >= 0
            && IntStream.range(0, N + 4).filter(j -> (g[j] = invf[j] * pw[j] % 1000000007L) >= 0).count() >= 0
            && IntStream.range(0, qc).filter(i -> (mx[qL[i]] = Math.max(mx[qL[i]], qN[i])) >= 0).count() >= 0
            && LongStream.range(0, qc).map(i -> ((long) qL[(int) i] << 17) | i).sorted().toArray() instanceof long[] keys
            && new long[qc] instanceof long[] ans && new int[]{0} instanceof int[] prev
            && Arrays.stream(keys).filter(key -> Integer.valueOf((int) (key >> 17)) instanceof Integer L && Integer.valueOf((int) (key & 131071)) instanceof Integer idx
                && (L.equals(prev[0]) || ((prev[0] = L) > 0 && (f[L] = 1) == 1
                    && IntStream.rangeClosed(L + 1, mx[L]).filter(n -> (f[n] = (26 * f[n - 1] + fact[n - 1] * g[n - L] % 1000000007L * invf[L - 1]) % 1000000007L) >= 0).count() >= 0))
                && (ans[idx] = qN[idx] < L ? 0 : f[qN[idx]]) >= 0).count() >= 0
            ? Arrays.stream(ans).mapToObj(String::valueOf).collect(Collectors.joining("\n")) : "");
    }
}
