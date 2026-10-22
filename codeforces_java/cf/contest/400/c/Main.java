import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Long.parseLong((String) t)).iterator() instanceof Iterator<Long> it
            && Long.valueOf(it.next()) instanceof Long n && Long.valueOf(it.next()) instanceof Long m && Long.valueOf(it.next() % 4) instanceof Long x && Long.valueOf(it.next() % 2) instanceof Long y && Long.valueOf(it.next() % 4) instanceof Long z
            && Long.valueOf(it.next()) instanceof Long p
            && Stream.concat(Stream.concat(LongStream.range(0, x).mapToObj(i -> 0), LongStream.range(0, y).mapToObj(i -> 1)), LongStream.range(0, z).mapToObj(i -> 2)).collect(Collectors.toList()) instanceof List<Integer> ops
            ? LongStream.range(0, p).mapToObj(i -> ops.stream().reduce(new long[]{it.next(), it.next(), n, m},
                (c, op) -> op == 0 ? new long[]{c[1], c[2] - c[0] + 1, c[3], c[2]} : op == 1 ? new long[]{c[0], c[3] - c[1] + 1, c[2], c[3]} : new long[]{c[3] - c[1] + 1, c[0], c[3], c[2]}, (u, v) -> u))
                .map(c -> c[0] + " " + c[1]).collect(Collectors.joining("\n")) : "");
    }
}
