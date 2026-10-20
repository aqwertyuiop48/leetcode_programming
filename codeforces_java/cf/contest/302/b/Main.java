import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Long.parseLong((String) t)).iterator() instanceof Iterator<Long> it
            && Integer.valueOf(it.next().intValue()) instanceof Integer n && Integer.valueOf(it.next().intValue()) instanceof Integer m
            && new long[n + 1] instanceof long[] p
            && IntStream.rangeClosed(1, n).allMatch(i -> (p[i] = p[i - 1] + it.next() * it.next()) > 0)
            ? LongStream.generate(it::next).limit(m).mapToObj(x -> Integer.valueOf(Arrays.binarySearch(p, x)) instanceof Integer b ? String.valueOf(b >= 0 ? b : -b - 1) : "").collect(Collectors.joining("\n")) : "");
    }
}
