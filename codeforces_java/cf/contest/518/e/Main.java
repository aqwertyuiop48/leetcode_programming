import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk
            && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer k
            && IntStream.range(0, n).mapToObj(i -> tk.nextToken()).toArray(String[]::new) instanceof String[] tok
            && new long[n] instanceof long[] val && new boolean[]{true} instanceof boolean[] ok
            && new long[]{-1000000000000L, 0} instanceof long[] st
            && IntStream.range(0, k).allMatch(r -> (st[0] = -1000000000000L) < 0 && (st[1] = -1) < 0
                && IntStream.rangeClosed(0, (n - 1 - r) / k + 1).allMatch(j -> (Integer) (r + j * k) instanceof Integer p
                    && (j <= (n - 1 - r) / k && tok[p].equals("?") ? st[1] >= 0 || (st[1] = j) >= 0
                        : (Long) (j <= (n - 1 - r) / k ? Long.parseLong(tok[p]) : 1000000000000L) instanceof Long hi
                            && (ok[0] &= hi - st[0] - 1 >= (st[1] < 0 ? 0 : j - st[1])) | true
                            && (st[1] < 0 || (Long) Math.min(Math.max(-((j - st[1] - 1) / 2), st[0] + 1), hi - (j - st[1])) instanceof Long s0
                                && IntStream.range((int) st[1], j).allMatch(t -> (val[r + t * k] = s0 + t - st[1]) > Long.MIN_VALUE))
                            && (j > (n - 1 - r) / k || (val[p] = hi) > Long.MIN_VALUE) && (st[0] = hi) > Long.MIN_VALUE && (st[1] = -1) < 0)))
            ? ok[0] ? Arrays.stream(val).mapToObj(String::valueOf).collect(Collectors.joining(" ")) : "Incorrect sequence" : "");
    }
}
