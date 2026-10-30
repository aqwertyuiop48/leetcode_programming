import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st && (Integer) Integer.parseInt(st.nextToken()) instanceof Integer n
            && (Integer) Integer.parseInt(st.nextToken()) instanceof Integer m && (Integer) Integer.parseInt(st.nextToken()) instanceof Integer k
            && IntStream.range(0, n).mapToLong(i -> Long.parseLong(st.nextToken())).toArray() instanceof long[] a
            && new long[n * n] instanceof long[] r && new long[(1 << n) * n] instanceof long[] dp
            && IntStream.range(0, k).filter(i -> (r[(Integer.parseInt(st.nextToken()) - 1) * n + Integer.parseInt(st.nextToken()) - 1] = Long.parseLong(st.nextToken())) >= 0).count() >= 0
            && IntStream.range(0, dp.length).filter(i -> (dp[i] = -1) < 0).count() >= 0
            && IntStream.range(0, n).filter(i -> (dp[(1 << i) * n + i] = a[i]) >= 0).count() >= 0
            && IntStream.range(0, 1 << n).filter(mask -> Integer.bitCount(mask) < m).filter(mask -> IntStream.range(0, n).filter(j -> (mask >> j & 1) == 1 && dp[mask * n + j] >= 0)
                .filter(j -> IntStream.range(0, n).filter(x -> (mask >> x & 1) == 0 && (dp[(mask | 1 << x) * n + x] = Math.max(dp[(mask | 1 << x) * n + x], dp[mask * n + j] + a[x] + r[j * n + x])) >= 0).count() >= 0).count() >= 0).count() >= 0
            ? IntStream.range(0, 1 << n).filter(mask -> Integer.bitCount(mask) == m).mapToLong(mask -> IntStream.range(0, n).mapToLong(j -> dp[mask * n + j]).max().getAsLong()).max().getAsLong() : 0);
    }
}
