import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st
            && Integer.valueOf(st.nextToken()) instanceof Integer n && Integer.valueOf(st.nextToken()) instanceof Integer m && Integer.valueOf(st.nextToken()) instanceof Integer k
            && IntStream.range(0, k).map(i -> Integer.parseInt(st.nextToken()) - 1).toArray() instanceof int[] gov
            && new int[n] instanceof int[] comp && new int[n] instanceof int[] sz
            && IntStream.range(0, n).allMatch(i -> (comp[i] = i) == i)
            && IntStream.range(0, m).allMatch(i -> Integer.valueOf(Integer.parseInt(st.nextToken()) - 1) instanceof Integer a && Integer.valueOf(Integer.parseInt(st.nextToken()) - 1) instanceof Integer b
                && (comp[a] == comp[b] || Integer.valueOf(comp[b]) instanceof Integer cb && Integer.valueOf(comp[a]) instanceof Integer ca
                    && IntStream.range(0, n).allMatch(v -> comp[v] != cb || (comp[v] = ca) >= 0)))
            && IntStream.range(0, n).allMatch(v -> ++sz[comp[v]] > 0)
            && IntStream.of(gov).map(g -> comp[g]).distinct().toArray() instanceof int[] gc
            && Integer.valueOf(Arrays.stream(gc).map(c -> sz[c]).max().getAsInt()) instanceof Integer mx
            && Long.valueOf(n - Arrays.stream(gc).mapToLong(c -> sz[c]).sum()) instanceof Long f
            ? Arrays.stream(gc).mapToLong(c -> (long) sz[c] * (sz[c] - 1) / 2).sum() - (long) mx * (mx - 1) / 2 + (mx + f) * (mx + f - 1) / 2 - m : "");
    }
}
