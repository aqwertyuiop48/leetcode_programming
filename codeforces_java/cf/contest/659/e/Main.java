import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st
            && Integer.valueOf(st.nextToken()) instanceof Integer n
            && Integer.valueOf(st.nextToken()) instanceof Integer m
            && IntStream.range(0, m).mapToObj(i -> new int[]{Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())}).toArray(int[][]::new) instanceof int[][] e
            && IntStream.rangeClosed(0, n).toArray() instanceof int[] p
            && IntStream.rangeClosed(0, n).map(x -> 1).toArray() instanceof int[] sz
            && new int[n + 1] instanceof int[] ec
            && ((IntUnaryOperator) x -> IntStream.iterate(x, v -> p[v] != v, v -> p[v]).reduce(x, (a, b) -> p[b])) instanceof IntUnaryOperator f
            && IntStream.range(0, m).allMatch(i -> Integer.valueOf(f.applyAsInt(e[i][0])) instanceof Integer x && Integer.valueOf(f.applyAsInt(e[i][1])) instanceof Integer y
                && x.intValue() != y.intValue() && (sz[x] < sz[y] ? (p[x] = y) + (sz[y] += sz[x]) : (p[y] = x) + (sz[x] += sz[y])) >= 0 || true)
            && IntStream.range(0, m).allMatch(i -> ++ec[f.applyAsInt(e[i][0])] > 0)
            ? IntStream.rangeClosed(1, n).filter(v -> p[v] == v && ec[v] == sz[v] - 1).count()
            : "");
    }
}
