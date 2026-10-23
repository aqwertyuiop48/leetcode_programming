import java.util.Arrays;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(
            System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 8] instanceof int[] g
            && new int[4] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((g[ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && Integer.valueOf(g[0]) instanceof Integer n
            && Arrays.copyOfRange(g, 3, n + 3) instanceof int[] p
            && Arrays.stream(p).sorted().toArray() instanceof int[] s
            && IntStream.range(0, n + 2).toArray() instanceof int[] par
            && IntStream.generate(() -> 1).limit(n + 2).toArray() instanceof int[] sz
            && ((IntUnaryOperator) x -> IntStream.iterate(x, y -> par[y]).filter(y -> par[y] == y).findFirst().getAsInt()) instanceof IntUnaryOperator find
            && ((IntBinaryOperator) (x, y) ->
                (Integer) find.applyAsInt(x) instanceof Integer rx
                && (Integer) find.applyAsInt(y) instanceof Integer ry
                && (rx.equals(ry)
                    || ((Integer) (sz[rx] < sz[ry] ? rx : ry) instanceof Integer small
                        && (Integer) (sz[rx] < sz[ry] ? ry : rx) instanceof Integer big
                        && (par[small] = big) >= 0
                        && (sz[big] += sz[small]) > 0)) ? 0 : 1) instanceof IntBinaryOperator union
            && IntStream.range(0, n).allMatch(i ->
                (Integer) Arrays.binarySearch(s, g[1] - s[i]) instanceof Integer ja
                && (Integer) Arrays.binarySearch(s, g[2] - s[i]) instanceof Integer jb
                && union.applyAsInt(i, ja >= 0 ? ja : n + 1) == 0
                && union.applyAsInt(i, jb >= 0 ? jb : n) == 0)
            ? find.applyAsInt(n) == find.applyAsInt(n + 1)
                ? "NO\n"
                : "YES\n" + Arrays.stream(p).mapToObj(v -> find.applyAsInt(Arrays.binarySearch(s, v)) == find.applyAsInt(n + 1) ? "1" : "0")
                    .collect(java.util.stream.Collectors.joining(" ")) + "\n"
            : "");
    }
}
