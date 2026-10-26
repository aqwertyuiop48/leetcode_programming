import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m
            && tk.nextToken().toCharArray() instanceof char[] p && (Integer) p.length instanceof Integer len
            && IntStream.range(0, m).map(i -> Integer.parseInt(tk.nextToken())).toArray() instanceof int[] y
            && new int[len + 1] instanceof int[] pi
            && IntStream.range(1, len).allMatch(i -> (Integer) IntStream.iterate(pi[i], j -> j > 0 && p[i] != p[j], j -> pi[j]).reduce(-1, (x, z) -> z) instanceof Integer last
                && (Integer) (last < 0 ? pi[i] : pi[last]) instanceof Integer f && (pi[i + 1] = f + (p[i] == p[f] ? 1 : 0)) >= 0)
            && new boolean[len + 1] instanceof boolean[] border && Stream.iterate(pi[len], j -> j > 0, j -> pi[j]).allMatch(j -> (border[j] = true))
            && IntStream.range(0, m - 1).allMatch(i -> y[i + 1] - y[i] >= len || border[len - (y[i + 1] - y[i])])
            ? LongStream.range(0, n - (m == 0 ? 0 : IntStream.range(0, m - 1).map(i -> Math.min(len, y[i + 1] - y[i])).sum() + len)).reduce(1L, (x, i) -> x * 26 % 1000000007L) : 0);
    }
}
