import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer h && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer q
            && IntStream.range(0, q).mapToObj(z -> (Integer) (h - Integer.parseInt(tk.nextToken())) instanceof Integer sh && (Long) Long.parseLong(tk.nextToken()) instanceof Long l && (Long) Long.parseLong(tk.nextToken()) instanceof Long r
                ? new long[]{l << sh, ((r + 1) << sh) - 1, Long.parseLong(tk.nextToken())} : null).toArray(long[][]::new) instanceof long[][] qs
            && (Long) Math.max(1L << (h - 1), Arrays.stream(qs).filter(x -> x[2] == 1).mapToLong(x -> x[0]).max().orElse(0)) instanceof Long lo
            && (Long) Math.min((1L << h) - 1, Arrays.stream(qs).filter(x -> x[2] == 1).mapToLong(x -> x[1]).min().orElse(Long.MAX_VALUE)) instanceof Long hi
            && new long[]{lo, 0, -1} instanceof long[] st
            && Arrays.stream(qs).filter(x -> x[2] == 0).sorted(Comparator.comparingLong(x -> x[0])).filter(x -> (Long) Math.max(x[0], lo) instanceof Long s && (Long) Math.min(x[1], hi) instanceof Long e && s <= e
                && (s <= st[0] || (st[1] += s - st[0]) > 0 && (st[2] >= 0 || (st[2] = st[0]) >= 0) || true) && (st[0] = Math.max(st[0], e + 1)) > 0).count() >= 0
            && (st[0] > hi || (st[1] += hi - st[0] + 1) > 0 && (st[2] >= 0 || (st[2] = st[0]) >= 0) || true)
            ? st[1] == 0 ? "Game cheated!" : st[1] == 1 ? "" + st[2] : "Data not sufficient!" : "");
    }
}
