import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st
            ? Stream.generate(() -> Integer.valueOf(st.nextToken()) instanceof Integer n
                ? (n == 0 ? "" : IntStream.range(0, n).mapToObj(i -> st.nextToken()).toArray(String[]::new) instanceof String[] rows
                && IntStream.range(0, n).boxed().flatMapToLong(j -> LongStream.concat(
                    IntStream.range(0, n).filter(i -> rows[i].charAt(j) != 48).limit(1).mapToLong(i -> ((long) (j + 1) << 20) | (n - i)),
                    IntStream.range(0, n).map(i -> n - 1 - i).filter(i -> rows[i].charAt(j) != 48).limit(1).mapToLong(i -> ((long) (j + 1) << 20) | (n - i)))).distinct().sorted().toArray() instanceof long[] so
                && Integer.valueOf(so.length) instanceof Integer m
                && Arrays.stream(so).map(c -> c >> 20).toArray() instanceof long[] px
                && Arrays.stream(so).map(c -> c & 1048575).toArray() instanceof long[] py
                && new int[2 * m + 2] instanceof int[] h
                && new int[1] instanceof int[] sz
                && ((LongBinaryOperator) (ij, k) -> (px[(int) (ij & 1048575)] - px[(int) (ij >> 20)]) * (py[(int) k] - py[(int) (ij >> 20)])
                    - (py[(int) (ij & 1048575)] - py[(int) (ij >> 20)]) * (px[(int) k] - px[(int) (ij >> 20)])) instanceof LongBinaryOperator crs
                && IntStream.range(0, m).allMatch(i -> (IntStream.range(0, m).allMatch(q -> sz[0] >= 2
                        && crs.applyAsLong(((long) h[sz[0] - 2] << 20) | h[sz[0] - 1], i) <= 0 && --sz[0] >= 0) || true)
                    && (h[sz[0]++] = i) >= 0)
                && Integer.valueOf(sz[0] + 1) instanceof Integer tt
                && IntStream.range(0, m - 1).allMatch(r -> Integer.valueOf(m - 2 - r) instanceof Integer i
                    && (IntStream.range(0, m).allMatch(q -> sz[0] >= tt
                        && crs.applyAsLong(((long) h[sz[0] - 2] << 20) | h[sz[0] - 1], i) <= 0 && --sz[0] >= 0) || true)
                    && (h[sz[0]++] = i) >= 0)
                && Integer.valueOf(sz[0] - 1) instanceof Integer len
                && new long[]{px[h[0]], py[h[0]]} instanceof long[] cur
                && new ArrayList<String>() instanceof ArrayList<String> out
                && IntStream.range(0, len).allMatch(k -> Integer.valueOf(h[(len - k) % len]) instanceof Integer p
                    && Integer.valueOf(h[(len - k - 1) % len]) instanceof Integer q
                    && Long.valueOf(px[q] - px[p]) instanceof Long ex
                    && Long.valueOf(py[q] - py[p]) instanceof Long ey
                    && Long.valueOf(ex - (ey == 0 ? Long.signum(ex) : 0)) instanceof Long rx
                    && Long.valueOf(ey - (ex == 0 ? Long.signum(ey) : 0)) instanceof Long ry
                    && ((rx == 0 && ry == 0) || (out.add(cur[0] + " " + cur[1]) && (cur[0] += rx) * 0 == 0 && (cur[1] += ry) * 0 == 0)))
                ? out.size() + "\n" + String.join("\n", out) : "") : "")
                .takeWhile(s -> !s.isEmpty()).collect(Collectors.joining("\n")) : "");
    }
}
