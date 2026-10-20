import java.io.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st
            && Integer.valueOf(st.nextToken()) instanceof Integer r && Integer.valueOf(st.nextToken()) instanceof Integer c && Integer.valueOf(st.nextToken()) instanceof Integer n
            && Integer.valueOf(2 * c) instanceof Integer w
            && new int[r * w] instanceof int[] par && new boolean[r * w] instanceof boolean[] land
            && IntStream.range(0, r * w).filter(i -> (par[i] = i) < 0).count() == 0
            && ((IntUnaryOperator) v -> IntStream.iterate(v, u -> u >= 0, u -> par[u] == u ? -1 : (par[u] = par[par[u]])).reduce(v, (a, b) -> b)) instanceof IntUnaryOperator find
            && ((IntFunction<int[]>) p -> IntStream.range(0, 9).filter(k -> k != 4 && p / w + k / 3 - 1 >= 0 && p / w + k / 3 - 1 < r
                    && land[(p / w + k / 3 - 1) * w + (p % w + k % 3 - 1 + w) % w]).map(k -> find.applyAsInt((p / w + k / 3 - 1) * w + (p % w + k % 3 - 1 + w) % w)).toArray()) instanceof IntFunction<int[]> nb
            ? c == 1 ? 0 : IntStream.range(0, n).filter(i -> Integer.valueOf(Integer.parseInt(st.nextToken()) - 1) instanceof Integer x && Integer.valueOf(Integer.parseInt(st.nextToken()) - 1) instanceof Integer y
                && Integer.valueOf(x * w + y) instanceof Integer p1 && Integer.valueOf(x * w + y + c) instanceof Integer p2
                && nb.apply(p1) instanceof int[] r1 && nb.apply(p2) instanceof int[] r2
                && !IntStream.of(r1).anyMatch(a -> IntStream.of(r2).anyMatch(b -> a == b))
                && (land[p1] = true) && (land[p2] = true)
                && IntStream.of(r1).filter(a -> (par[a] = p1) < 0).count() == 0 && IntStream.of(r2).filter(a -> (par[a] = p2) < 0).count() == 0).count() : "");
    }
}
