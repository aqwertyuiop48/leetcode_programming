import java.io.*;
import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).lines().collect(Collectors.joining(" "))) instanceof StringTokenizer t
            && Integer.valueOf(t.nextToken()) instanceof Integer n && Integer.valueOf(t.nextToken()) instanceof Integer m
            && IntStream.generate(() -> Integer.parseInt(t.nextToken())).limit(n).toArray() instanceof int[] a && IntStream.generate(() -> Integer.parseInt(t.nextToken())).limit(m).toArray() instanceof int[] b
            && ((LongUnaryOperator) x -> Arrays.stream(a).mapToLong(v -> Math.max(0, x - v)).sum()
                + Arrays.stream(b).mapToLong(v -> Math.max(0, v - x)).sum()) instanceof LongUnaryOperator f
            ? f.applyAsLong(Stream.iterate(new long[]{0, 1_000_000_000L}, r -> Long.valueOf((r[0] + r[1]) / 2) instanceof Long mid
                ? (f.applyAsLong(mid + 1) - f.applyAsLong(mid) >= 0 ? new long[]{r[0], mid} : new long[]{mid + 1, r[1]}) : r)
                .limit(33).reduce((x, y) -> y).get()[0]) : "");
    }
}
