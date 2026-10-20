import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new BufferedReader(new InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(Object::toString).mapToLong(Long::parseLong).iterator() instanceof PrimitiveIterator.OfLong it
            && Integer.valueOf((int) it.nextLong()) instanceof Integer n && Integer.valueOf((int) it.nextLong()) instanceof Integer t
            && Integer.valueOf(300) instanceof Integer R && Integer.valueOf(2 * R + 1) instanceof Integer W
            && new int[W * W] instanceof int[] cnt && new int[W * W] instanceof int[] stack && new int[]{0} instanceof int[] sp && (cnt[R * W + R] = n) == n && (stack[sp[0]++] = R * W + R) >= 0
            && IntStream.generate(() -> 0).anyMatch(z -> sp[0] == 0 || (Integer.valueOf(stack[--sp[0]]) instanceof Integer u && Integer.valueOf(cnt[u] / 4) instanceof Integer k && k > 0
                && (cnt[u] -= 4 * k) >= 0 && Stream.of(u - 1, u + 1, u - W, u + W).allMatch(v -> (cnt[v] += k) >= 0 && (cnt[v] - k >= 4 || cnt[v] < 4 || (stack[sp[0]++] = v) >= 0)) && false))
            ? IntStream.range(0, t).mapToObj(i -> Long.valueOf(it.nextLong()) instanceof Long x && Long.valueOf(it.nextLong()) instanceof Long y
                ? String.valueOf(Math.abs(x) > R || Math.abs(y) > R ? 0 : cnt[(int) ((y + R) * W + x + R)]) : "").collect(Collectors.joining("\n")) : "");
    }
}
