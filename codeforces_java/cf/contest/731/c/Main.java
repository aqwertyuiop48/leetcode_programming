import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer z && Integer.valueOf(Integer.parseInt(z.nextToken())) instanceof Integer n
            && Integer.valueOf(Integer.parseInt(z.nextToken())) instanceof Integer m && Integer.valueOf(Integer.parseInt(z.nextToken())) instanceof Integer k
            && IntStream.range(0, n).map(i -> Integer.parseInt(z.nextToken())).toArray() instanceof int[] col
            && new int[n] instanceof int[] p && new int[n] instanceof int[] sz && new int[n] instanceof int[] best && new long[n] instanceof long[] keys
            && IntStream.range(0, n).filter(i -> (p[i] = i) >= 0 & (sz[i] = 1) > 0).count() >= 0
            && new IntUnaryOperator[1] instanceof IntUnaryOperator[] f && (f[0] = x -> p[x] == x ? x : (p[x] = f[0].applyAsInt(p[x]))) != null
            && IntStream.range(0, m).filter(i -> Integer.valueOf(f[0].applyAsInt(Integer.parseInt(z.nextToken()) - 1)) instanceof Integer a && Integer.valueOf(f[0].applyAsInt(Integer.parseInt(z.nextToken()) - 1)) instanceof Integer b
                && a.intValue() != b.intValue() && (sz[a] < sz[b] ? (p[a] = b) >= 0 & (sz[b] += sz[a]) > 0 : (p[b] = a) >= 0 & (sz[a] += sz[b]) > 0)).count() >= 0
            && IntStream.range(0, n).filter(i -> (keys[i] = (long) f[0].applyAsInt(i) * (k + 1) + col[i]) >= 0).count() >= 0
            && Stream.of(0).peek(q -> Arrays.sort(keys)).findFirst().isPresent() && new int[]{0} instanceof int[] run
            && IntStream.range(0, n).filter(i -> (run[0] = i > 0 && keys[i] == keys[i - 1] ? run[0] + 1 : 1) > 0
                && Integer.valueOf((int) (keys[i] / (k + 1))) instanceof Integer r && (best[r] = Math.max(best[r], run[0])) > 0).count() >= 0
            ? n - Arrays.stream(best).sum() : 0);
    }
}
