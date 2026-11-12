import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && Integer.valueOf(tk.nextToken()) instanceof Integer n
            && new int[n + 1] instanceof int[] p && new int[n + 1] instanceof int[] sz && new double[n + 1] instanceof double[] e
            && IntStream.rangeClosed(1, n).filter(i -> (sz[i] = 1) + (i > 1 ? p[i] = Integer.parseInt(tk.nextToken()) : 0) < 0).count() >= 0
            && IntStream.iterate(n, i -> i >= 2, i -> i - 1).filter(i -> (sz[p[i]] += sz[i]) < 0).count() >= 0
            && (e[1] = 1) == 1 && IntStream.rangeClosed(2, n).filter(i -> (e[i] = e[p[i]] + 1 + (sz[p[i]] - 1 - sz[i]) / 2.0) < 0).count() >= 0
            ? Arrays.stream(e, 1, n + 1).mapToObj(Double::toString).collect(Collectors.joining(" ")) : "");
    }
}
