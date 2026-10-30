import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n
            && new long[n] instanceof long[] v && new long[n] instanceof long[] d && new long[n] instanceof long[] p
            && IntStream.range(0, n).filter(i -> (v[i] = s.nextLong()) + (d[i] = s.nextLong()) + (p[i] = s.nextLong()) < 0).count() >= 0
            && new boolean[n] instanceof boolean[] gone && new ArrayList<Integer>() instanceof ArrayList<Integer> res && new long[2] instanceof long[] st
            && IntStream.range(0, n).filter(i -> !gone[i] && res.add(i + 1) && (st[0] = v[i]) + (st[1] = 0) >= 0
                && IntStream.range(i + 1, n).filter(j -> !gone[j] && (p[j] -= st[0] + st[1]) + (st[0] > 0 ? st[0]-- : 0) >= Long.MIN_VALUE && p[j] < 0 && (gone[j] = true) && (st[1] += d[j]) >= 0).count() >= 0).count() >= 0
            ? res.size() + "\n" + res.stream().map(String::valueOf).collect(Collectors.joining(" ")) : "");
    }
}
