import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 2] instanceof int[] a
            && new int[]{0, 0, 0, 0, 0} instanceof int[] ps
            && Stream.of(0).peek(z -> IntStream.rangeClosed(0, raw.length).forEach(i -> ps[4] = i < raw.length && raw[i] >= 48 ? (ps[3] = 1) + (ps[0] = ps[0] * 10 + raw[i] - 48)
                : i < raw.length && raw[i] == 45 ? (ps[2] = 1)
                : ps[3] == 1 ? (a[ps[1]++] = ps[2] == 1 ? -ps[0] : ps[0]) + (ps[0] = ps[2] = ps[3] = 0) : 0)).findFirst().isPresent()
            && Integer.valueOf(a[0]) instanceof Integer n && Integer.valueOf(a[n + 1]) instanceof Integer m
            && Arrays.stream(a, 1, n + 1).boxed().collect(Collectors.groupingBy(x -> x, Collectors.counting())) instanceof Map<Integer, Long> cnt
            && IntStream.range(0, m).mapToLong(j -> cnt.getOrDefault(a[n + 2 + j], 0L) * 1000000L + cnt.getOrDefault(a[n + 2 + m + j], 0L)).toArray() instanceof long[] key
            ? IntStream.range(0, m).reduce((x, y) -> key[y] > key[x] ? y : x).getAsInt() + 1 : "");
    }
}
