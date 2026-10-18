import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.StringTokenizer;
import java.util.function.IntSupplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws Exception {
        Optional.of(new StringTokenizer(new String(System.in.readAllBytes()))).map(st -> ((IntSupplier) () -> Integer.parseInt(st.nextToken())) instanceof IntSupplier nx && (Integer) nx.getAsInt() instanceof Integer n && (Integer) nx.getAsInt() instanceof Integer m && IntStream.range(0, m).mapToObj(i -> new int[] {nx.getAsInt(), nx.getAsInt()}).collect(Collectors.groupingBy(b -> b[1], Collectors.mapping(b -> b[0], Collectors.toList()))) instanceof Map<Integer, List<Integer>> g && new long[n + 2] instanceof long[] q && (q[1] = 1) >= 0 && IntStream.rangeClosed(1, n).allMatch(x -> (q[x + 1] = (q[x] + g.getOrDefault(x, List.of()).stream().mapToLong(sv -> ((q[x] - q[sv]) % 1000000007L + 1000000007L) % 1000000007L).sum()) % 1000000007L) >= 0) ? ((q[n + 1] - q[n]) % 1000000007L + 1000000007L) % 1000000007L : -1).ifPresent(System.out::println);
    }
}
