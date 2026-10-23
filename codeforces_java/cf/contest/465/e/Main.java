import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            new String(System.in.readAllBytes()).trim().split("\r?\n") instanceof String[] ln
            && Integer.valueOf(ln[1].trim()) instanceof Integer n
            && IntStream.range(0, 10).mapToLong(i -> i).toArray() instanceof long[] val
            && IntStream.range(0, 10).mapToLong(i -> 10).toArray() instanceof long[] pw
            && IntStream.iterate(n + 1, i -> i >= 2, i -> i - 1).allMatch(i ->
                ln[i].trim() instanceof String q
                && new long[] {0, 1} instanceof long[] acc
                && q.substring(3).chars().allMatch(c ->
                    (acc[0] = (acc[0] * pw[c - 48] + val[c - 48]) % 1000000007L) >= 0
                    && (acc[1] = acc[1] * pw[c - 48] % 1000000007L) >= 0)
                && (val[q.charAt(0) - 48] = acc[0]) >= 0
                && (pw[q.charAt(0) - 48] = acc[1]) >= 0)
            && new long[1] instanceof long[] res
            && ln[0].trim().chars().allMatch(c -> (res[0] = (res[0] * pw[c - 48] + val[c - 48]) % 1000000007L) >= 0)
            ? res[0]
            : -1);
    }
}
