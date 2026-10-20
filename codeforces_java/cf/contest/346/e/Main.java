import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import java.math.*;
import java.util.concurrent.atomic.*;

public class Main {
    public static void main(String[] args) throws Exception {
        if (new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st && ((IntSupplier) () -> Integer.parseInt(st.nextToken())) instanceof IntSupplier ni && Integer.valueOf(ni.getAsInt()) instanceof Integer t)
            System.out.print(IntStream.range(0, t).mapToObj(i -> Long.valueOf(ni.getAsInt()) instanceof Long a && Long.valueOf(ni.getAsInt()) instanceof Long n0 && Long.valueOf(ni.getAsInt()) instanceof Long p && Long.valueOf(ni.getAsInt()) instanceof Long h && Long.valueOf(Math.min(n0, p - 1)) instanceof Long n
                && (UnaryOperator<long[]>) (s -> s[0] > s[2] ? Long.valueOf(Math.min((n - s[1]) / s[3], (s[0] - 1) / s[2])) instanceof Long m ? new long[] {s[0] - m * s[2], s[1] + m * s[3], s[2], s[3]} : s : Long.valueOf(Math.min((n - s[3]) / s[1], (s[2] - 1) / s[0])) instanceof Long m ? new long[] {s[0], s[1], s[2] - m * s[0], s[3] + m * s[1]} : s) instanceof UnaryOperator<long[]> step
                && new long[] {a % p, 1, p - a % p, 1} instanceof long[] seed
                && Stream.iterate(seed, s -> s[1] + s[3] <= n, step).reduce((x, y) -> y).map(step).orElse(seed) instanceof long[] f
                ? (f[1] + f[3] - n - 1 > 0 ? f[0] + f[2] : n + 1 - f[3] >= 2 ? Math.max(f[0], f[2]) : f[0]) <= h ? "YES" : "NO" : "").collect(Collectors.joining("\n")));
    }
}
