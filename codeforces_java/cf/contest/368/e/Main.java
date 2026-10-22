import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Long.parseLong((String) t)).iterator() instanceof Iterator<Long> it
            && Long.valueOf(it.next()) instanceof Long n && Integer.valueOf(it.next().intValue()) instanceof Integer m
            && IntStream.range(0, m).mapToLong(i -> it.next() * 0 + it.next()).boxed().sorted(Comparator.reverseOrder()).mapToLong(Long::longValue).toArray() instanceof long[] w
            && new long[m + 1] instanceof long[] pre && IntStream.range(0, m).allMatch(i -> (pre[i + 1] = pre[i] + w[i]) >= 0)
            ? IntStream.rangeClosed(0, m).filter(k -> (k % 2 == 1 ? (long) k * (k - 1) / 2 + 1 : (long) k * k / 2) <= n).mapToLong(k -> pre[k]).max().getAsLong() : "");
    }
}
