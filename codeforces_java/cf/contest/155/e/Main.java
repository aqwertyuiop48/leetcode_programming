import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).iterator() instanceof Iterator<Object> it
            && ((IntSupplier) () -> Integer.parseInt((String) it.next())) instanceof IntSupplier rd
            && Integer.valueOf(rd.getAsInt()) instanceof Integer n
            && Integer.valueOf(rd.getAsInt()) instanceof Integer m
            && new Random(20120401L).longs(n + 1).toArray() instanceof long[] h
            && new long[n + 1] instanceof long[] sum
            && IntStream.range(0, m).allMatch(e -> Integer.valueOf(rd.getAsInt()) instanceof Integer u && Integer.valueOf(rd.getAsInt()) instanceof Integer v && (sum[u] += h[v]) == sum[u] && (sum[v] += h[u]) == sum[v])
            ? Stream.of(IntStream.rangeClosed(1, n).mapToLong(v -> sum[v]), IntStream.rangeClosed(1, n).mapToLong(v -> sum[v] + h[v]))
                .mapToLong(st -> st.boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).values().stream().mapToLong(c -> c * (c - 1) / 2).sum()).sum()
            : 0);
    }
}
