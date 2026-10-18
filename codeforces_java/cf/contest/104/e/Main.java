import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.StringTokenizer;
import java.util.function.IntSupplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws Exception {
        Optional.of(new StringTokenizer(new String(System.in.readAllBytes()))).map(st -> ((IntSupplier) () -> Integer.parseInt(st.nextToken())) instanceof IntSupplier nx && (Integer) nx.getAsInt() instanceof Integer n && IntStream.range(0, n).map(i -> nx.getAsInt()).toArray() instanceof int[] w && (Integer) nx.getAsInt() instanceof Integer q && IntStream.range(0, q).mapToObj(i -> new int[] {nx.getAsInt() - 1, nx.getAsInt()}).toArray(int[][]::new) instanceof int[][] qs && IntStream.range(0, q).boxed().collect(Collectors.groupingBy(i -> qs[i][1])) instanceof Map<Integer, List<Integer>> g && new long[q] instanceof long[] ans && new long[n + 601] instanceof long[] dp && g.entrySet().stream().allMatch(e -> (Integer) e.getKey() instanceof Integer b && (b <= 600 ? IntStream.range(0, n).mapToLong(j -> dp[n - 1 - j] = w[n - 1 - j] + dp[n - 1 - j + b]).max().isPresent() && e.getValue().stream().allMatch(i -> (ans[i] = dp[qs[i][0]]) >= 0) : e.getValue().stream().allMatch(i -> (ans[i] = IntStream.iterate(qs[i][0], x -> x < n, x -> x + b).mapToLong(x -> w[x]).sum()) >= 0))) ? Arrays.stream(ans).mapToObj(Long::toString).collect(Collectors.joining("\n")) : "").ifPresent(System.out::println);
    }
}
