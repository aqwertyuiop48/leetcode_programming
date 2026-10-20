import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st
            && Integer.valueOf(st.nextToken()) instanceof Integer n
            && IntStream.generate(() -> Integer.parseInt(st.nextToken())).limit(n).toArray() instanceof int[] p
            && IntStream.generate(() -> Integer.parseInt(st.nextToken())).limit(n).toArray() instanceof int[] q
            && new int[n + 1] instanceof int[] pq
            && IntStream.range(0, n).filter(i -> (pq[q[i]] = i + 1) < 0).count() == 0
            && IntStream.range(0, n).map(i -> pq[p[i]]).toArray() instanceof int[] cur
            && new int[n] instanceof int[] nxt && new int[20][n + 1] instanceof int[][] zc && new int[20] instanceof int[] nz
            && IntStream.iterate(19, b -> b >= 0, b -> b - 1).filter(b -> IntStream.range(0, n).filter(i -> (zc[b][i + 1] = zc[b][i] + 1 - (cur[i] >> b & 1)) < 0).count() == 0
                && (nz[b] = zc[b][n]) >= 0
                && IntStream.range(0, n).filter(i -> (nxt[(cur[i] >> b & 1) == 0 ? zc[b][i] : nz[b] + i - zc[b][i]] = cur[i]) < 0).count() == 0
                && IntStream.range(0, n).filter(i -> (cur[i] = nxt[i]) < 0).count() == 0).count() >= 0
            && ((java.util.function.ToIntFunction<int[]>) s -> IntStream.iterate(19, b -> b >= 0, b -> b - 1).map(b -> Integer.valueOf(s[0]) instanceof Integer l && Integer.valueOf(s[1]) instanceof Integer r
                ? (s[3] >> b & 1) == 1 ? (s[2] += zc[b][r] - zc[b][l]) * 0 + (s[0] = nz[b] + l - zc[b][l]) * 0 + (s[1] = nz[b] + r - zc[b][r]) * 0
                : (s[0] = zc[b][l]) * 0 + (s[1] = zc[b][r]) * 0 : 0).sum() * 0 + s[2]) instanceof java.util.function.ToIntFunction<int[]> diff
            && Integer.valueOf(Integer.parseInt(st.nextToken())) instanceof Integer m && new long[1] instanceof long[] xs
            ? IntStream.range(0, m).mapToObj(i -> IntStream.generate(() -> Integer.parseInt(st.nextToken())).limit(4).map(z -> (int) ((z - 1 + xs[0]) % n) + 1).toArray() instanceof int[] f
                && Integer.valueOf(Math.min(f[0], f[1])) instanceof Integer l1 && Integer.valueOf(Math.max(f[0], f[1])) instanceof Integer r1
                && Integer.valueOf(Math.min(f[2], f[3])) instanceof Integer l2 && Integer.valueOf(Math.max(f[2], f[3])) instanceof Integer r2
                ? Integer.valueOf(diff.applyAsInt(new int[]{l1 - 1, r1, 0, r2 + 1}) - diff.applyAsInt(new int[]{l1 - 1, r1, 0, l2})) instanceof Integer ans
                    && (xs[0] = ans + 1) > 0 ? "" + ans : "" : "").collect(Collectors.joining("\n")) : "");
    }
}
