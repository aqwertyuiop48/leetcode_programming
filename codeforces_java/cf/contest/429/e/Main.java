import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n
            && new long[2 * n] instanceof long[] val && IntStream.range(0, n).allMatch(i -> (val[2 * i] = Long.parseLong(tk.nextToken())) >= 0 && (val[2 * i + 1] = Long.parseLong(tk.nextToken()) + 1) > 0)
            && IntStream.range(0, 2 * n).boxed().sorted(Comparator.comparingLong((Integer i) -> val[i]).thenComparing(Comparator.naturalOrder())).mapToInt(i -> i).toArray() instanceof int[] ord
            && new int[2 * n] instanceof int[] rank && IntStream.range(0, 2 * n).allMatch(r -> (rank[ord[r]] = r) >= 0)
            && new boolean[2 * n] instanceof boolean[] vis && new int[n] instanceof int[] col
            && IntStream.range(0, 2 * n).allMatch(st -> vis[st] || Stream.iterate(st, v -> !vis[v], v -> ord[rank[v ^ 1] ^ 1]).allMatch(v -> (col[v / 2] = v % 2) >= 0 && (vis[v] = true) && (vis[v ^ 1] = true)))
            ? IntStream.of(col).mapToObj(String::valueOf).collect(Collectors.joining(" ")) : "");
    }
}
