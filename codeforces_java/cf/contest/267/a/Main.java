import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).mapToLong(t -> Long.parseLong((String) t)).iterator() instanceof PrimitiveIterator.OfLong it
            && Long.valueOf(it.nextLong()) instanceof Long n
            ? LongStream.range(0, n).mapToObj(i -> Stream.iterate(new long[]{it.nextLong(), it.nextLong(), 0}, s -> s[1] > 0, s -> new long[]{s[1], s[0] % s[1], s[2] + s[0] / s[1]}).reduce((x, y) -> y).get() instanceof long[] s ? String.valueOf(s[2] + s[0] / s[1]) : "").collect(Collectors.joining("\n")) : "");
    }
}
