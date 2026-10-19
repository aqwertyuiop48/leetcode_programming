import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> (String) t).iterator() instanceof Iterator<String> it
            && Integer.valueOf(it.next()) instanceof Integer n
            && it.next().split("/") instanceof String[] lo && it.next().split("/") instanceof String[] up
            && Long.valueOf(lo[0]) instanceof Long a && Long.valueOf(lo[1]) instanceof Long b && Long.valueOf(up[0]) instanceof Long c && Long.valueOf(up[1]) instanceof Long d
            && IntStream.range(0, n).mapToObj(i -> new long[]{Long.parseLong(it.next()), Long.parseLong(it.next())}).map(p -> new long[]{b * p[1] - a * p[0], c * p[0] - d * p[1]})
                .filter(p -> p[0] > 0 && p[1] > 0).sorted(Comparator.<long[]>comparingLong(p -> p[0]).thenComparingLong(p -> -p[1])).toList() instanceof List<long[]> pts
            && new long[pts.size() + 1] instanceof long[] tails && new int[]{0} instanceof int[] len
            && pts.stream().allMatch(p -> Integer.valueOf(Arrays.binarySearch(tails, 0, len[0], p[1])) instanceof Integer r && Integer.valueOf(r >= 0 ? r : -r - 1) instanceof Integer pos
                && (tails[pos] = p[1]) > 0 && (pos < len[0] || ++len[0] > 0))
            ? len[0] : "");
    }
}
