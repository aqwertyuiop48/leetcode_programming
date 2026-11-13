import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && IntStream.range(0, raw.length).filter(k -> raw[k] == 10).boxed().findFirst().get() instanceof Integer nl
            && new String(raw, 0, nl).trim().split("\\s+") instanceof String[] h
            && Integer.valueOf(h[0]) instanceof Integer n && Integer.valueOf(h[1]) instanceof Integer m
            && IntStream.range(nl + 1, raw.length).filter(k -> raw[k] == 48 || raw[k] == 49).map(k -> raw[k] - 48).toArray() instanceof int[] g
            && IntStream.range(0, n).map(i -> IntStream.range(0, m).filter(j -> g[i * m + j] == 1).findFirst().orElse(m)).toArray() instanceof int[] fr
            && IntStream.range(0, n).map(i -> IntStream.range(0, m).filter(j -> g[i * m + j] == 1).reduce((x, y) -> y).orElse(-1)).toArray() instanceof int[] lr
            && IntStream.range(0, m).map(j -> IntStream.range(0, n).filter(i -> g[i * m + j] == 1).findFirst().orElse(n)).toArray() instanceof int[] fc
            && IntStream.range(0, m).map(j -> IntStream.range(0, n).filter(i -> g[i * m + j] == 1).reduce((x, y) -> y).orElse(-1)).toArray() instanceof int[] lc
            ? IntStream.range(0, n * m).filter(p -> g[p] == 0).mapToLong(p -> (p % m > fr[p / m] ? 1 : 0) + (p % m < lr[p / m] ? 1 : 0) + (p / m > fc[p % m] ? 1 : 0) + (p / m < lc[p % m] ? 1 : 0)).sum() : "");
    }
}
