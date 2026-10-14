import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.next()).ifPresent(str ->
            System.out.println(
                new int[]{str.length()} instanceof int[] n
                && new StringBuilder(str).reverse().toString() instanceof String rev
                && new long[n[0] + 1] instanceof long[] pow
                && new long[n[0] + 1] instanceof long[] fh
                && new long[n[0] + 1] instanceof long[] rh
                && (pow[0] = 1) >= 0
                && IntStream.range(1, n[0] + 1).allMatch(i -> (pow[i] = pow[i - 1] * 131L % 1_000_000_007L) >= 0)
                && IntStream.range(0, n[0]).allMatch(i -> (fh[i + 1] = (fh[i] * 131L + str.charAt(i)) % 1_000_000_007L) >= 0)
                && IntStream.range(0, n[0]).allMatch(i -> (rh[i + 1] = (rh[i] * 131L + rev.charAt(i)) % 1_000_000_007L) >= 0)
                && new int[n[0] + 1] instanceof int[] degree
                && new long[]{0} instanceof long[] total
                && IntStream.rangeClosed(1, n[0]).allMatch(L ->
                    (fh[L] == (((rh[n[0]] - rh[n[0] - L] * pow[L]) % 1_000_000_007L + 1_000_000_007L) % 1_000_000_007L)
                        ? (degree[L] = 1 + degree[L / 2]) >= 0
                        : (degree[L] = 0) >= 0)
                    & (total[0] += degree[L]) >= 0)
                ? String.valueOf(total[0])
                : "")));
    }
}

