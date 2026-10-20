import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import java.math.*;
import java.util.concurrent.atomic.*;

public class Main {
    public static void main(String[] args) throws Exception {
        if (new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st && ((IntSupplier) () -> Integer.parseInt(st.nextToken())) instanceof IntSupplier ni && Integer.valueOf(ni.getAsInt()) instanceof Integer n && Integer.valueOf(ni.getAsInt()) instanceof Integer m
            && IntStream.range(0, n).mapToObj(i -> st.nextToken()).toArray(String[]::new) instanceof String[] g && new int[n][m] instanceof int[][] dp
            && (BiFunction<Integer, Integer, long[]>) ((ai, aj) -> IntStream.range(0, n).map(i -> IntStream.range(0, m).map(j -> dp[i][j] = g[i].charAt(j) == '.' ? ((i == ai && j == aj ? 1 : 0) + (i > 0 ? dp[i - 1][j] : 0) + (j > 0 ? dp[i][j - 1] : 0)) % 1000000007 : 0).sum()).summaryStatistics() != null ? new long[] {dp[n - 2][m - 1], dp[n - 1][m - 2]} : null) instanceof BiFunction<Integer, Integer, long[]> run
            && run.apply(0, 1) instanceof long[] r1 && run.apply(1, 0) instanceof long[] r2)
            System.out.print(((r1[0] * r2[1] - r1[1] * r2[0]) % 1000000007 + 1000000007) % 1000000007);
    }
}
