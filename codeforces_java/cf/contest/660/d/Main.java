import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer t
            && Integer.valueOf(Integer.parseInt(t.nextToken())) instanceof Integer n
            && IntStream.range(0, 2 * n).mapToLong(i -> Long.parseLong(t.nextToken())).toArray() instanceof long[] c
            && new long[n * (n - 1) / 2] instanceof long[] ks
            && IntStream.range(0, n).parallel().filter(i -> IntStream.range(i + 1, n).filter(j -> (ks[i * (2 * n - i - 1) / 2 + j - i - 1] = (c[2 * i] + c[2 * j]) * 4000000001L + c[2 * i + 1] + c[2 * j + 1]) == 0).count() >= 0).count() >= 0
            && Stream.of(0).peek(z -> Arrays.parallelSort(ks)).findFirst().isPresent()
            && new long[1] instanceof long[] r
            ? IntStream.range(1, ks.length).mapToLong(p -> r[0] = ks[p] == ks[p - 1] ? r[0] + 1 : 0).sum()
            : "");
    }
}
