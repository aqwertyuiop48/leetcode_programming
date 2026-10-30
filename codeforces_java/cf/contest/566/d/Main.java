import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0
            && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw
            && new int[raw.length / 2 + 3] instanceof int[] nums
            && new int[3] instanceof int[] st
            && IntStream.range(0, raw.length).filter(i -> (raw[i] > 47 && raw[i] < 58
                ? (st[0] = st[0] * 10 + raw[i] - 48) + (st[2] = 1)
                : raw[i] <= 32 && st[2] == 1 ? (nums[st[1]++] = st[0]) + (st[0] = 0) + (st[2] = 0) : 0) != Integer.MIN_VALUE || true).count() >= 0
            && (Integer) nums[0] instanceof Integer n
            && (Integer) nums[1] instanceof Integer q
            && IntStream.rangeClosed(0, n + 1).toArray() instanceof int[] p
            && IntStream.rangeClosed(0, n + 1).toArray() instanceof int[] nx
            && ((ToIntBiFunction<int[], Integer>) (arr, x) ->
                IntStream.iterate(x, v -> arr[v] != v, v -> arr[v] = arr[arr[v]]).reduce((a, b) -> b) instanceof OptionalInt op && op.isPresent() ? arr[op.getAsInt()] : x) instanceof ToIntBiFunction<int[], Integer> fnd
            ? IntStream.range(0, q).mapToObj(i -> (Integer) nums[2 + 3 * i] instanceof Integer t
                && (Integer) nums[3 + 3 * i] instanceof Integer x
                && (Integer) nums[4 + 3 * i] instanceof Integer y
                ? (t == 1 ? ((p[fnd.applyAsInt(p, x)] = fnd.applyAsInt(p, y)) >= 0 ? null : null)
                    : t == 2 ? (IntStream.iterate(fnd.applyAsInt(nx, x), j -> j < y, j -> (p[fnd.applyAsInt(p, j)] = fnd.applyAsInt(p, j + 1)) >= 0 && (nx[j] = j + 1) > 0 ? fnd.applyAsInt(nx, j) : 0).count() >= 0 ? null : null)
                    : fnd.applyAsInt(p, x) == fnd.applyAsInt(p, y) ? "YES" : "NO")
                : null).filter(Objects::nonNull).collect(Collectors.joining("\n"))
            : "");
    }
}
