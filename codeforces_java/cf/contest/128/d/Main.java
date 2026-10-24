import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s+")).skip(1).mapToInt(Integer::parseInt).boxed().collect(Collectors.groupingBy(x -> x, TreeMap::new, Collectors.counting())) instanceof TreeMap<Integer, Long> mp && mp.keySet().stream().mapToInt(x -> x).toArray() instanceof int[] v && mp.values().stream().mapToLong(x -> x).toArray() instanceof long[] c && new long[1] instanceof long[] e && v.length > 1 && IntStream.range(0, v.length).allMatch(t -> v[t] - v[0] == t && (t == 0 ? (e[0] = 2 * c[0]) > 0 : t < v.length - 1 ? (e[0] = 2 * c[t] - e[0]) >= 2 : 2 * c[t] == e[0])) ? "YES" : "NO");
    }


}
