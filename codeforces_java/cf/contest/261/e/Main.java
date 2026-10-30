import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer l && Integer.valueOf(sc.nextInt()) instanceof Integer r && Integer.valueOf(sc.nextInt()) instanceof Integer p
            && new int[3000000] instanceof int[] raw && new int[]{1} instanceof int[] sz && (raw[0] = 1) == 1
            && IntStream.rangeClosed(2, p).map(q -> p + 2 - q).filter(q -> IntStream.rangeClosed(2, q - 1).noneMatch(d -> q % d == 0)).allMatch(q -> IntStream.iterate(0, i -> i < sz[0], i -> i + 1).allMatch(i -> (long) raw[i] * q > r || (raw[sz[0]++] = raw[i] * q) > 0))
            && new int[sz[0]] instanceof int[] a && Integer.valueOf(a.length) instanceof Integer N
            && new int[1025] instanceof int[] c0 && IntStream.range(0, sz[0]).allMatch(i -> ++c0[((raw[i] >> 0) & 1023) + 1] > 0)
            && IntStream.range(0, 1024).allMatch(k -> (c0[k + 1] += c0[k]) >= 0)
            && IntStream.range(0, sz[0]).allMatch(i -> (a[c0[(raw[i] >> 0) & 1023]++] = raw[i]) >= 0)
            && new int[1025] instanceof int[] c1 && IntStream.range(0, sz[0]).allMatch(i -> ++c1[((a[i] >> 10) & 1023) + 1] > 0)
            && IntStream.range(0, 1024).allMatch(k -> (c1[k + 1] += c1[k]) >= 0)
            && IntStream.range(0, sz[0]).allMatch(i -> (raw[c1[(a[i] >> 10) & 1023]++] = a[i]) >= 0)
            && new int[1025] instanceof int[] c2 && IntStream.range(0, sz[0]).allMatch(i -> ++c2[((raw[i] >> 20) & 1023) + 1] > 0)
            && IntStream.range(0, 1024).allMatch(k -> (c2[k + 1] += c2[k]) >= 0)
            && IntStream.range(0, sz[0]).allMatch(i -> (a[c2[(raw[i] >> 20) & 1023]++] = raw[i]) >= 0)
            && new int[N] instanceof int[] g && new int[N] instanceof int[] best
            && IntStream.range(0, N).allMatch(i -> (g[i] = 1000) > 0 && (best[i] = 1000) > 0) && (g[0] = 0) == 0 && (best[0] = 0) == 0
            && Integer.valueOf((r >> 6) + 1) instanceof Integer B && new int[B + 1] instanceof int[] bk
            && IntStream.range(0, N).allMatch(i -> ++bk[(a[i] >> 6) + 1] > 0)
            && IntStream.range(0, B).allMatch(c -> (bk[c + 1] += bk[c]) >= 0)
            && ((IntBinaryOperator) (j, t) -> a[j] == t ? j : a[Math.min(N - 1, j + 1)] == t ? j + 1 : a[Math.min(N - 1, j + 2)] == t ? j + 2 : Integer.valueOf(Arrays.binarySearch(a, Math.min(N, j + 3), Math.min(N, j + 8), t)) instanceof Integer y1 && y1 >= 0 ? y1
                : Integer.valueOf(Arrays.binarySearch(a, Math.min(N, j + 8), Math.min(N, j + 32), t)) instanceof Integer y2 && y2 >= 0 ? y2
                : Integer.valueOf(Arrays.binarySearch(a, Math.min(N, j + 32), Math.min(N, j + 512), t)) instanceof Integer y3 && y3 >= 0 ? y3
                : Integer.valueOf(Arrays.binarySearch(a, Math.min(N, j + 512), Math.min(N, j + 8192), t)) instanceof Integer y4 && y4 >= 0 ? y4
                : Arrays.binarySearch(a, Math.min(N, j + 8192), N, t)) instanceof IntBinaryOperator find
            && IntStream.rangeClosed(2, p).allMatch(b -> Integer.valueOf(Arrays.binarySearch(a, r / b)) instanceof Integer q0 && Integer.valueOf(q0 >= 0 ? q0 + 1 : -q0 - 1) instanceof Integer lim
                && IntStream.range(0, lim).allMatch(i -> g[i] + b >= p || Integer.valueOf(find.applyAsInt(bk[a[i] * b >> 6], a[i] * b)) instanceof Integer jp
                    && (g[jp] <= g[i] + 1 || (g[jp] = g[i] + 1) > 0 && (best[jp] = Math.min(best[jp], g[jp] + b)) >= 0)))
            ? IntStream.range(0, N).filter(i -> a[i] >= l && best[i] <= p).count() : "");
    }
}
