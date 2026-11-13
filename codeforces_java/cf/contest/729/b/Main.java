import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] b
            && Integer.valueOf(IntStream.range(0, b.length).filter(i -> b[i] == 10).findFirst().orElse(b.length)) instanceof Integer nl
            && new String(b, 0, nl).trim().split("\\s+") instanceof String[] h
            && Integer.valueOf(h[0]) instanceof Integer n && Integer.valueOf(h[1]) instanceof Integer m
            && IntStream.range(nl, b.length).filter(i -> b[i] == 48 || b[i] == 49).map(i -> b[i] - 48).toArray() instanceof int[] g
            && IntStream.range(0, n).map(i -> IntStream.range(0, m).filter(j -> g[i * m + j] == 1).findFirst().orElse(m)).toArray() instanceof int[] fr
            && IntStream.range(0, n).map(i -> IntStream.range(0, m).map(k -> m - 1 - k).filter(j -> g[i * m + j] == 1).findFirst().orElse(-1)).toArray() instanceof int[] lr
            && IntStream.range(0, m).map(j -> IntStream.range(0, n).filter(i -> g[i * m + j] == 1).findFirst().orElse(n)).toArray() instanceof int[] fc
            && IntStream.range(0, m).map(j -> IntStream.range(0, n).map(k -> n - 1 - k).filter(i -> g[i * m + j] == 1).findFirst().orElse(-1)).toArray() instanceof int[] lc
            ? String.valueOf(IntStream.range(0, n * m).filter(c -> g[c] == 0).mapToLong(c ->
                (c % m > fr[c / m] ? 1 : 0) + (c % m < lr[c / m] ? 1 : 0) + (c / m > fc[c % m] ? 1 : 0) + (c / m < lc[c % m] ? 1 : 0)).sum()) : "");
    }
}
