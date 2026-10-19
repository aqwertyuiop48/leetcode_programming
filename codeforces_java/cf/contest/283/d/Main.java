import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Long.parseLong((String) t)).iterator() instanceof Iterator<Long> it
            && Integer.valueOf(it.next().intValue()) instanceof Integer n
            && LongStream.range(0, n).map(i -> it.next()).toArray() instanceof long[] a
            && Arrays.stream(a).mapToInt(Long::numberOfTrailingZeros).toArray() instanceof int[] v
            && IntStream.range(0, n).mapToLong(i -> a[i] >> v[i]).toArray() instanceof long[] od
            && new int[n] instanceof int[] dp
            && IntStream.range(0, n).allMatch(j -> (dp[j] = 1 + IntStream.range(0, j).filter(i -> a[i] % od[j] == 0 && (v[j] < j - i || v[i] == v[j] - (j - i))).map(i -> dp[i]).max().orElse(0)) > 0)
            ? n - Arrays.stream(dp).max().getAsInt() : "");
    }
}
