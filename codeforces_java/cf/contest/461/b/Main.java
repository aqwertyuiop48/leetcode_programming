import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(
            new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st
            && Stream.generate(st::nextToken).limit(st.countTokens()).mapToInt(Integer::parseInt).toArray() instanceof int[] g
            && Integer.valueOf(g[0]) instanceof Integer n
            && IntStream.range(0, n).mapToLong(v -> 1 - g[n + v]).toArray() instanceof long[] d0
            && IntStream.range(0, n).mapToLong(v -> g[n + v]).toArray() instanceof long[] d1
            && IntStream.range(1, n).map(i -> n - i).allMatch(c ->
                (Integer) g[c] instanceof Integer p
                && (d1[p] = (d1[p] * (d1[c] + d0[c]) + d0[p] * d1[c]) % 1000000007L) >= 0
                && (d0[p] = d0[p] * (d1[c] + d0[c]) % 1000000007L) >= 0)
            ? String.valueOf(d1[0])
            : "");
    }
}
