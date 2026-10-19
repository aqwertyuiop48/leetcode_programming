import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).mapToLong(t -> Long.parseLong((String) t)).iterator() instanceof PrimitiveIterator.OfLong it
            && Long.valueOf(it.nextLong()) instanceof Long n
            ? LongStream.range(0, n).map(i -> it.nextLong() + IntStream.rangeClosed(1, 16).filter(t -> (1L << (2 * t)) >= it.nextLong()).findFirst().getAsInt()).max().getAsLong() : "");
    }
}
