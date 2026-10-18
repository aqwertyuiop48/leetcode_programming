import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).map(sc -> sc.next() instanceof String t && sc.next() instanceof String b && sc.next() instanceof String e && (Integer) t.length() instanceof Integer n && (Integer) Math.max(b.length(), e.length()) instanceof Integer mx && new long[n + 1] instanceof long[] p1 && new long[n + 1] instanceof long[] p2 && new long[n + 1] instanceof long[] w1 && new long[n + 1] instanceof long[] w2 && (w1[0] = 1) > 0 && (w2[0] = 1) > 0 && IntStream.range(0, n).allMatch(i -> (p1[i + 1] = (p1[i] * 131 + t.charAt(i)) % 1000000007L) >= 0 && (p2[i + 1] = (p2[i] * 137 + t.charAt(i)) % 998244353L) >= 0 && (w1[i + 1] = w1[i] * 131 % 1000000007L) > 0 && (w2[i + 1] = w2[i] * 137 % 998244353L) > 0) ? IntStream.range(0, n).filter(i -> t.startsWith(b, i)).boxed().flatMapToLong(i -> IntStream.rangeClosed(i + mx - 1, n - 1).filter(j -> t.startsWith(e, j - e.length() + 1)).mapToLong(j -> ((p1[j + 1] - p1[i] * w1[j - i + 1] % 1000000007L + 1000000007L) % 1000000007L) * 998244353L + (p2[j + 1] - p2[i] * w2[j - i + 1] % 998244353L + 998244353L) % 998244353L)).sorted().distinct().count() : 0L).ifPresent(System.out::println);
    }
}
