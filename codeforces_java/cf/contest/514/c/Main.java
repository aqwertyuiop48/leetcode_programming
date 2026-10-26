import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk
            && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m
            && new long[]{911382323L, 972663749L} instanceof long[] base && new long[]{1000000007L, 998244353L} instanceof long[] md
            && new long[2][600002] instanceof long[][] pw && IntStream.range(0, 2).allMatch(w -> (pw[w][0] = 1) > 0 && IntStream.range(1, 600002).allMatch(i -> (pw[w][i] = pw[w][i - 1] * base[w] % md[w]) >= 0))
            && ((java.util.function.Function<String, long[]>) t -> IntStream.range(0, 2).mapToLong(w -> IntStream.range(0, t.length()).mapToLong(i -> (t.charAt(i) - 'a' + 1) * pw[w][i] % md[w]).sum() % md[w]).toArray()) instanceof java.util.function.Function<String, long[]> hs
            && IntStream.range(0, n).mapToObj(i -> hs.apply(tk.nextToken())).map(h -> h[0] << 32 | h[1]).collect(Collectors.toSet()) instanceof Set<Long> mem
            ? IntStream.range(0, m).mapToObj(q -> tk.nextToken() instanceof String t && hs.apply(t) instanceof long[] h
                && IntStream.range(0, t.length()).anyMatch(i -> IntStream.range(0, 3).filter(c -> c != t.charAt(i) - 'a').anyMatch(c ->
                    mem.contains((((h[0] + (c - (t.charAt(i) - 'a')) * pw[0][i] % md[0] + md[0]) % md[0]) << 32) | ((h[1] + (c - (t.charAt(i) - 'a')) * pw[1][i] % md[1] + md[1]) % md[1]))))
                ? "YES" : "NO").collect(Collectors.joining("\n")) : "");
    }
}
