import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 8] instanceof int[] g0
            && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((g0[ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && (Integer) g0[0] instanceof Integer n
            && (Integer) (2 * n - 1) instanceof Integer N
            && (Integer) g0[1 + n] instanceof Integer qn
            && new int[N] instanceof int[] S
            && IntStream.range(0, n - 1).allMatch(i -> (S[i] = g0[2 + i] - g0[1 + i]) > -2000000000 && (S[n + i] = g0[1 + i] - g0[2 + i]) > -2000000000)
            && (S[n - 1] = Integer.MAX_VALUE) > 0
            && new int[N] instanceof int[] rk
            && new int[N] instanceof int[] nr
            && new int[2] instanceof int[] cur
            && LongStream.range(0, N).map(i -> (((long) S[(int) i] + 2147483648L) << 18) | i).sorted().toArray() instanceof long[] ks0
            && IntStream.range(0, N).allMatch(t -> (rk[(int) (ks0[t] & 262143)] = cur[0] = t == 0 ? 0 : cur[0] + ((ks0[t] >>> 18) == (ks0[t - 1] >>> 18) ? 0 : 1)) >= 0)
            && IntStream.iterate(1, k -> k * 2).anyMatch(k ->
                LongStream.range(0, N).map(i -> ((long) rk[(int) i] << 36) | ((long) (i + k < N ? rk[(int) i + k] + 1 : 0) << 18) | i).sorted().toArray() instanceof long[] ks
                    && IntStream.range(0, N).allMatch(t -> (nr[(int) (ks[t] & 262143)] = cur[0] = t == 0 ? 0 : cur[0] + ((ks[t] >>> 18) == (ks[t - 1] >>> 18) ? 0 : 1)) >= 0)
                    && IntStream.range(0, N).allMatch(i -> (rk[i] = nr[i]) >= 0)
                    && cur[0] == N - 1)
            && new int[N] instanceof int[] sa
            && IntStream.range(0, N).allMatch(i -> (sa[rk[i]] = i) >= 0)
            && new int[N] instanceof int[] lcp
            && IntStream.range(0, N).allMatch(i ->
                (rk[i] == 0 ? (cur[1] = 0) == 0
                    : (lcp[rk[i]] = cur[1] += (int) IntStream.iterate(0, t -> i + cur[1] + t < N && sa[rk[i] - 1] + cur[1] + t < N && S[i + cur[1] + t] == S[sa[rk[i] - 1] + cur[1] + t], t -> t + 1).count()) >= 0)
                    && (cur[1] = Math.max(cur[1] - 1, 0)) >= 0)
            && new int[18][N] instanceof int[][] sp
            && IntStream.range(0, N).allMatch(i -> (sp[0][i] = lcp[i]) >= 0)
            && IntStream.range(1, 18).allMatch(b -> IntStream.rangeClosed(0, N - (1 << b)).allMatch(i -> (sp[b][i] = Math.min(sp[b - 1][i], sp[b - 1][i + (1 << (b - 1))])) >= 0))
            && new int[N + 1] instanceof int[] P
            && IntStream.range(0, N).allMatch(i -> (P[i + 1] = P[i] + (sa[i] >= n ? 1 : 0)) >= 0)
            && new int[qn] instanceof int[] ans
            && new int[qn] instanceof int[] qA
            && new int[qn] instanceof int[] qB
            && new int[N] instanceof int[] head
            && IntStream.range(0, N).allMatch(i -> (head[i] = -1) < 0)
            && new int[2 * qn] instanceof int[] nx
            && IntStream.range(0, qn).allMatch(q ->
                (Integer) g0[2 + n + 2 * q] instanceof Integer l
                    && (Integer) g0[3 + n + 2 * q] instanceof Integer r
                    && (r.equals(l) ? (ans[q] = n - 1) >= 0
                        : (Integer) (r - l) instanceof Integer L
                            && (Integer) rk[l - 1] instanceof Integer r0
                            && (Integer) IntStream.iterate(17, b -> b >= 0, b -> b - 1).reduce(r0, (c, b) -> c - (1 << b) >= 0 && sp[b][c - (1 << b) + 1] >= L ? c - (1 << b) : c) instanceof Integer lo
                            && (Integer) IntStream.iterate(17, b -> b >= 0, b -> b - 1).reduce(r0, (c, b) -> c + (1 << b) <= N - 1 && sp[b][c + 1] >= L ? c + (1 << b) : c) instanceof Integer hi
                            && (ans[q] = P[hi + 1] - P[lo]) >= 0
                            && (qA[q] = Math.max(1, 2 * l - r)) > 0
                            && (qB[q] = r) > 0
                            && (nx[2 * q] = head[hi]) > -5
                            && (head[hi] = 2 * q) >= 0
                            && (lo == 0 || ((nx[2 * q + 1] = head[lo - 1]) > -5 && (head[lo - 1] = 2 * q + 1) >= 0))))
            && new int[n + 2] instanceof int[] bit
            && IntStream.range(0, N).allMatch(idx ->
                (sa[idx] < n || IntStream.iterate(sa[idx] - n + 1, i -> i <= n, i -> i + (i & -i)).map(i -> bit[i]++).sum() >= 0)
                    && IntStream.iterate(head[idx], e -> e >= 0, e -> nx[e]).map(e ->
                        ans[e >> 1] -= ((e & 1) == 0 ? 1 : -1)
                            * (IntStream.iterate(qB[e >> 1], i -> i > 0, i -> i & (i - 1)).map(i -> bit[i]).sum()
                                - IntStream.iterate(qA[e >> 1] - 1, i -> i > 0, i -> i & (i - 1)).map(i -> bit[i]).sum())).sum() > Integer.MIN_VALUE)
            ? IntStream.range(0, qn).mapToObj(q -> String.valueOf(ans[q])).collect(Collectors.joining("\n")) + "\n"
            : "");
    }
}
