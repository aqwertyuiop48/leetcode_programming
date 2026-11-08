import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer t && Integer.valueOf(t.nextToken()) instanceof Integer n && Integer.valueOf(n - 1) instanceof Integer len && t.nextToken() instanceof String s1 && t.nextToken() instanceof String s2
            && Long.valueOf((1L << 61) - 1) instanceof Long M && Long.valueOf((System.nanoTime() * 0x9E3779B97F4A7C15L >>> 4) % (M - 1000) + 500) instanceof Long B
            && ((LongBinaryOperator) (a, b) -> Long.valueOf(Math.multiplyHigh(a, b)) instanceof Long hi && Long.valueOf((a * b & M) + ((a * b >>> 61) | (hi << 3))) instanceof Long r1 && Long.valueOf((r1 & M) + (r1 >>> 61)) instanceof Long r2 ? (r2 >= M ? r2 - M : r2) : 0L) instanceof LongBinaryOperator mul
            && new long[len + 1] instanceof long[] pw && new long[len + 1] instanceof long[] ht && new long[len + 1] instanceof long[] sh && (pw[0] = 1) == 1
            && IntStream.rangeClosed(1, len).filter(k -> (pw[k] = mul.applyAsLong(pw[k - 1], B)) >= 0
                && (ht[k] = (mul.applyAsLong(ht[k - 1], B) + ("NSEW".indexOf(s2.charAt(len - k)) ^ 1) + 1) % M) >= 0
                && (sh[k] = (mul.applyAsLong(pw[k - 1], "NSEW".indexOf(s1.charAt(len - k)) + 1) + sh[k - 1]) % M) >= 0).count() >= 0
            ? (IntStream.rangeClosed(1, len).anyMatch(k -> ht[k] == sh[k]) ? "NO" : "YES") : "");
    }
}
