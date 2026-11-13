import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk
            && Integer.valueOf(Integer.parseInt(tk.nextToken())) instanceof Integer n && Integer.valueOf(Integer.parseInt(tk.nextToken())) instanceof Integer k
            && IntStream.range(0, n).map(i -> Integer.parseInt(tk.nextToken())).toArray() instanceof int[] a
            && IntStream.range(0, n).filter(i -> a[i] < 0).toArray() instanceof int[] pos
            ? pos.length > k ? -1 : pos.length == 0 ? 0
                : Integer.valueOf(k - pos.length) instanceof Integer r
                && IntStream.range(1, pos.length).map(i -> pos[i] - pos[i - 1] - 1).filter(x -> x > 0).sorted().toArray() instanceof int[] gp
                && new int[gp.length] instanceof int[] pre && IntStream.range(0, gp.length).filter(i -> (pre[i] = gp[i] + (i > 0 ? pre[i - 1] : 0)) < 0).count() >= 0
                && Integer.valueOf(n - 1 - pos[pos.length - 1]) instanceof Integer tr
                && Integer.valueOf(IntStream.range(1, pos.length).filter(i -> pos[i] - pos[i - 1] > 1).boxed().toList().size() + 1) instanceof Integer g
                ? 2 * g - Math.max(2 * (int) IntStream.range(0, gp.length).filter(i -> pre[i] <= r).count(),
                    tr <= r ? 1 + 2 * (int) IntStream.range(0, gp.length).filter(i -> pre[i] <= r - tr).count() : 0)
                : "" : "");
    }
}
