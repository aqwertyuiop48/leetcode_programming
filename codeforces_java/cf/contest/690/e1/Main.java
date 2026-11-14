import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] b
            && new short[b.length / 2 + 2] instanceof short[] v
            && new int[3] instanceof int[] s
            && IntStream.rangeClosed(0, b.length).map(i -> i < b.length ? b[i] : 10)
                .allMatch(c -> c >= 48 ? (s[0] = s[0] * 10 + c - 48) >= 0 && (s[1] = 1) > 0
                    : s[1] == 0 || ((v[s[2]++] = (short) s[0]) >= 0 && (s[0] = 0) == 0 && (s[1] = 0) == 0))
            && new int[]{1} instanceof int[] p
            ? IntStream.range(0, v[0]).mapToObj(t -> Integer.valueOf(v[p[0]]) instanceof Integer h
                && Integer.valueOf(v[p[0] + 1]) instanceof Integer w
                && Integer.valueOf(p[0] + 2) instanceof Integer base
                && (p[0] += 2 + h * w) > 0
                && ((IntToLongFunction) r -> IntStream.range(0, w).mapToLong(x -> Math.abs(v[base + (r + 1) * w + x] - v[base + r * w + x])).sum()) instanceof IntToLongFunction d
                && ((IntToLongFunction) r -> IntStream.range(r, r + 5).mapToLong(d::applyAsLong).sum()) instanceof IntToLongFunction d5
                && d.applyAsLong(h / 2 - 1) * 1.0 / ((d5.applyAsLong(h / 2 - 6) + d5.applyAsLong(h / 2)) / 10.0 + 1)
                    > IntStream.range(0, w).mapToLong(x -> Math.abs(v[base + (h - 1) * w + x] - v[base + x])).sum() * 1.0
                        / ((d5.applyAsLong(0) + d5.applyAsLong(h - 6)) / 10.0 + 1) ? "YES" : "NO").collect(Collectors.joining("\n")) : "");
    }
}
