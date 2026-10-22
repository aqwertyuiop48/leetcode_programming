import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).mapToLong(t -> Long.parseLong((String) t)).iterator() instanceof PrimitiveIterator.OfLong it
            && Long.valueOf(it.nextLong()) instanceof Long n && Long.valueOf(it.nextLong()) instanceof Long a && Long.valueOf(it.nextLong()) instanceof Long b
            ? LongStream.range(0, n).map(i -> it.nextLong()).map(x -> x - (x * a / b * b + a - 1) / a).mapToObj(String::valueOf).collect(Collectors.joining(" ")) : "");
    }
}
