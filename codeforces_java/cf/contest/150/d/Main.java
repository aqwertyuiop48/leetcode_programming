import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n
            && IntStream.rangeClosed(0, n).map(i -> i == 0 ? 0 : Integer.parseInt(tk.nextToken())).toArray() instanceof int[] c && tk.nextToken() instanceof String s
            && ((IntUnaryOperator) x -> x < -500000000 ? -1000000000 : x) instanceof IntUnaryOperator cl
            && IntStream.rangeClosed(0, n).mapToObj(l -> IntStream.rangeClosed(0, n).mapToObj(r -> IntStream.generate(() -> -1000000000).limit(n + 2).toArray()).toArray(int[][]::new)).toArray(int[][][]::new) instanceof int[][][] g
            && IntStream.rangeClosed(0, n).allMatch(l -> (g[l][l][0] = 0) == 0)
            && IntStream.rangeClosed(0, n).mapToObj(l -> IntStream.generate(() -> -1000000000).limit(n + 1).toArray()).toArray(int[][]::new) instanceof int[][] can
            && IntStream.rangeClosed(1, n).allMatch(len -> IntStream.rangeClosed(0, n - len).parallel().allMatch(l -> (Integer) (l + len) instanceof Integer r
                && IntStream.generate(() -> -1000000000).limit(len + 1).toArray() instanceof int[] A && IntStream.generate(() -> -1000000000).limit(len + 1).toArray() instanceof int[] B
                && IntStream.range(l + 1, r).allMatch(m -> can[l][m] <= -500000000 || g[m][r] instanceof int[] gm && (Integer) can[l][m] instanceof Integer cm && Stream.of(0).peek(z -> Arrays.setAll(A, k -> k >= 1 && k <= r - m ? Math.max(A[k], cm + gm[k]) : A[k])).findFirst().isPresent())
                && IntStream.range(l + 1, r).allMatch(m -> can[m][r] <= -500000000 || g[l][m] instanceof int[] gm && (Integer) can[m][r] instanceof Integer cm && Stream.of(0).peek(z -> Arrays.setAll(B, k -> k >= 1 && k <= m - l ? Math.max(B[k], gm[k] + cm) : B[k])).findFirst().isPresent())
                && IntStream.rangeClosed(1, len).allMatch(k -> (g[l][r][k] = cl.applyAsInt(Math.max(Math.max(A[k], B[k]), len >= 2 && k >= 2 && s.charAt(l) == s.charAt(r - 1) ? g[l + 1][r - 1][k - 2] : len == 1 && k == 1 ? 0 : -1000000000))) >= -1000000000)
                && (can[l][r] = cl.applyAsInt(Math.max(IntStream.range(l + 1, r).map(m -> can[l][m] + can[m][r]).max().orElse(-1000000000), IntStream.rangeClosed(1, len).filter(k -> c[k] != -1).map(k -> g[l][r][k] + c[k]).max().orElse(-1000000000)))) >= -1000000000
                && (g[l][r][0] = can[l][r]) >= -1000000000))
            && new int[n + 1] instanceof int[] bp && IntStream.rangeClosed(1, n).allMatch(i -> (bp[i] = Math.max(bp[i - 1], IntStream.range(0, i).filter(j -> can[j][i] > -500000000).map(j -> bp[j] + can[j][i]).max().orElse(0))) >= 0)
            ? bp[n] : -1);
    }
}
