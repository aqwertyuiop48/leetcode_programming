import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).iterator() instanceof Iterator<Object> it
            && Integer.valueOf(Integer.parseInt((String) it.next())) instanceof Integer n
            && IntStream.range(0, n).mapToObj(i -> new long[]{Long.parseLong((String) it.next()), Long.parseLong((String) it.next())}).toList() instanceof List<long[]> p
            && p.stream().map(q -> (q[0] + 1_000_000_000L) * 2_000_000_001L + q[1] + 1_000_000_000L).collect(Collectors.toSet()) instanceof Set<Long> set
            ? IntStream.range(0, n).mapToLong(i -> IntStream.range(i + 1, n).filter(j -> (p.get(i)[0] + p.get(j)[0]) % 2 == 0 && (p.get(i)[1] + p.get(j)[1]) % 2 == 0
                && set.contains(((p.get(i)[0] + p.get(j)[0]) / 2 + 1_000_000_000L) * 2_000_000_001L + (p.get(i)[1] + p.get(j)[1]) / 2 + 1_000_000_000L)).count()).sum()
            : 0);
    }
}

