import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st
            && Integer.valueOf(st.nextToken()) instanceof Integer n && Integer.valueOf(st.nextToken()) instanceof Integer m
            && IntStream.range(0, n).mapToObj(i -> st.nextToken()).toArray(String[]::new) instanceof String[] g
            && IntStream.range(0, n * m).filter(x -> g[x / m].charAt(x % m) == 'X').toArray() instanceof int[] cells
            && Integer.valueOf(cells.length) instanceof Integer k
            && Integer.valueOf(IntStream.of(cells).map(x -> x / m).max().getAsInt() - IntStream.of(cells).map(x -> x / m).min().getAsInt() + 1) instanceof Integer h
            && Integer.valueOf(IntStream.of(cells).map(x -> x % m).max().getAsInt() - IntStream.of(cells).map(x -> x % m).min().getAsInt() + 1) instanceof Integer w
            && Integer.valueOf(2 * k / h - w) instanceof Integer dx && Integer.valueOf(2 * k / w - h) instanceof Integer dy
            ? ((2 * k % h == 0 && dx >= 1 && IntStream.of(cells).noneMatch(x -> x % m + dx < m && g[x / m].charAt(x % m + dx) == 'X'))
                || (2 * k % w == 0 && dy >= 1 && IntStream.of(cells).noneMatch(x -> x / m + dy < n && g[x / m + dy].charAt(x % m) == 'X')) ? "YES" : "NO") : "");
    }
}
