import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk
            && Integer.valueOf(Integer.parseInt(tk.nextToken())) instanceof Integer n && Integer.valueOf(Integer.parseInt(tk.nextToken())) instanceof Integer k && Long.valueOf(Long.parseLong(tk.nextToken())) instanceof Long w
            && IntStream.range(0, n).mapToLong(i -> Long.parseLong(tk.nextToken())).toArray() instanceof long[] a
            && IntStream.range(0, n).mapToLong(i -> Long.parseLong(tk.nextToken())).toArray() instanceof long[] t
            && new long[]{0, 0, 0, 0, 0} instanceof long[] st && new TreeSet<Long>() instanceof TreeSet<Long> top && new TreeSet<Long>() instanceof TreeSet<Long> rest
            && IntStream.range(0, n).allMatch(r -> Long.valueOf(((t[r] / 2) << 20) | r) instanceof Long key
                && top.add(key) && (st[1] += key >> 20) >= 0 && (st[0] += t[r]) >= 0 && (st[2] += a[r]) >= 0
                && (top.size() <= k || (top.pollFirst() instanceof Long y && rest.add(y) && (st[1] -= y >> 20) >= 0))
                && IntStream.generate(() -> 0).takeWhile(z -> st[0] - st[1] > w).filter(z -> Integer.valueOf((int) st[3]) instanceof Integer l && Long.valueOf(((t[l] / 2) << 20) | l) instanceof Long x
                    && (top.remove(x) ? ((st[1] -= x >> 20) >= 0 && (rest.isEmpty() || (rest.pollLast() instanceof Long y2 && top.add(y2) && (st[1] += y2 >> 20) >= 0))) : rest.remove(x))
                    && (st[0] -= t[l]) < Long.MAX_VALUE && (st[2] -= a[l]) < Long.MAX_VALUE && ++st[3] > 0).count() >= 0
                && (st[4] = Math.max(st[4], st[2])) >= 0)
            ? st[4] : "");
    }
}
