import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.StringTokenizer;
import java.util.function.IntSupplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws Exception {
        Optional.of(new StringTokenizer(new String(System.in.readAllBytes()))).map(st -> ((IntSupplier) () -> Integer.parseInt(st.nextToken())) instanceof IntSupplier nx && (Integer) nx.getAsInt() instanceof Integer n && IntStream.range(0, n - 1).mapToObj(i -> new int[] {nx.getAsInt(), nx.getAsInt(), nx.getAsInt()}).flatMap(e -> Stream.of(e, new int[] {e[1], e[0], e[2]})).collect(Collectors.groupingBy(e -> e[0])) instanceof Map<Integer, List<int[]>> g && new int[n] instanceof int[] order && new int[n + 1] instanceof int[] par && new double[n + 1] instanceof double[] pw && new int[] {1} instanceof int[] tail && (order[0] = 1) > 0 && IntStream.range(0, n).allMatch(idx -> g.getOrDefault(order[idx], List.of()).stream().filter(e -> e[1] != par[order[idx]]).allMatch(e -> (par[e[1]] = order[idx]) > 0 && (pw[e[1]] = e[2]) > 0 && (order[tail[0]++] = e[1]) > 0)) && new double[n + 1] instanceof double[] cnt && Arrays.stream(order).allMatch(v -> (cnt[v] = 1) > 0) && new double[n + 1] instanceof double[] rr && new double[n + 1] instanceof double[] a && IntStream.range(0, n).allMatch(i -> (Integer) order[n - 1 - i] instanceof Integer v && (Double) (a[v] + rr[v] * (cnt[v] - 1) / 2) instanceof Double sv && (v == 1 ? !Double.isNaN(a[0] = sv) : (Double) (2 * pw[v] + rr[v]) instanceof Double t && !Double.isNaN(cnt[par[v]] += cnt[v]) && !Double.isNaN(rr[par[v]] += t) && !Double.isNaN(a[par[v]] += sv - cnt[v] * rr[v] / 2))) ? String.format("%.9f", a[0] / (n - 1)) : "").ifPresent(System.out::println);
    }
}
