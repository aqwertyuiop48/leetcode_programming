import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer p
            && new int[n + 2] instanceof int[] cnt && new HashMap<Long, Integer>() instanceof HashMap<Long, Integer> mp
            && IntStream.range(0, n).allMatch(i -> (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer a && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer b
                && ++cnt[a] > 0 && ++cnt[b] > 0 && mp.merge((long) Math.min(a, b) * (n + 1) + Math.max(a, b), 1, Integer::sum) > 0)
            && new long[n + 3] instanceof long[] ge
            && IntStream.rangeClosed(1, n).allMatch(v -> ++ge[cnt[v]] > 0)
            && IntStream.range(0, n + 2).map(i -> n + 1 - i).allMatch(i -> (ge[i] += ge[i + 1]) >= 0)
            ? (IntStream.rangeClosed(1, n).mapToLong(v -> ge[Math.max(0, p - cnt[v])] - (2 * cnt[v] >= p ? 1 : 0)).sum() / 2
                - mp.entrySet().stream().filter(e -> (Integer) (cnt[(int) (e.getKey() / (n + 1))] + cnt[(int) (e.getKey() % (n + 1))]) instanceof Integer sm && sm >= p && sm - e.getValue() < p).count()) : "");
    }
}
