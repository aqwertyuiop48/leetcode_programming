import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Arrays.stream(l.trim().split("\\s+"))).filter(w -> !w.isEmpty()).mapToInt(Integer::parseInt).toArray() instanceof int[] t
            && IntStream.range(0, t[1]).mapToLong(i -> 4L * t[2 + 2 * i] + t[3 + 2 * i]).sorted().toArray() instanceof long[] p
            && LongStream.concat(LongStream.of(0L), LongStream.concat(Arrays.stream(p), LongStream.of(4L * (t[0] + 1)))).toArray() instanceof long[] q
            ? (IntStream.range(0, q.length - 1).mapToLong(i -> Long.valueOf(q[i + 1] / 4 - q[i] / 4 - 1) instanceof Long len && Long.valueOf(q[i] % 4) instanceof Long ca && Long.valueOf(q[i + 1] % 4) instanceof Long cb
                ? (len == 0 ? 0L : ca == 0 && cb == 0 ? len % 2 : ca == 0 || cb == 0 ? len : ca.equals(cb) ? len % 2 : (len + 1) % 2) : 0L).reduce(0L, (x, y) -> x ^ y) != 0 ? "WIN" : "LOSE") : "");
    }
}
