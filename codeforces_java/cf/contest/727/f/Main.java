import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st
            && Stream.generate(st::nextToken).limit(st.countTokens()).mapToLong(Long::parseLong).toArray() instanceof long[] t
            && Integer.valueOf((int) t[0]) instanceof Integer n && Integer.valueOf((int) t[1]) instanceof Integer m
            && LongStream.generate(() -> 1L << 60).limit(n + 1).toArray() instanceof long[] g
            && (g[0] = 0) == 0
            && IntStream.iterate(n - 1, i -> i >= 0, i -> i - 1).filter(i -> IntStream.iterate(n, j -> j >= 0, j -> j - 1)
                .filter(j -> (g[j] = Math.min(g[j] >= (1L << 60) ? 1L << 60 : Math.max(0, g[j] - t[2 + i]), j >= 1 ? g[j - 1] : 1L << 60)) < 0).count() >= 0).count() >= 0
            && IntStream.rangeClosed(1, n).filter(j -> (g[j] = Math.min(g[j], g[j - 1])) < 0).count() >= 0
            && IntStream.rangeClosed(0, n).mapToLong(j -> 2 * g[n - j]).toArray() instanceof long[] r
            ? IntStream.range(0, m).mapToObj(i -> String.valueOf(n + 1 + Arrays.binarySearch(r, 2 * t[2 + n + i] + 1) + 1)).collect(Collectors.joining("\n")) : "");
    }
}
