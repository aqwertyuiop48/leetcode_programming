import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Long.valueOf(s.nextLong()) instanceof Long n && Long.valueOf(s.nextLong()) instanceof Long m
            && Long.valueOf(s.nextLong()) instanceof Long x && Long.valueOf(s.nextLong()) instanceof Long y && s.next() instanceof String d
            && new long[]{x, y, d.charAt(0) == 'D' ? 1 : -1, d.charAt(1) == 'R' ? 1 : -1, 1, 0} instanceof long[] st && new HashSet<Long>() instanceof HashSet<Long> seen && seen.add(x * (m + 1) + y)
            && (st[2] = x == 1 ? 1 : x == n ? -1 : st[2]) != 0 && (st[3] = y == 1 ? 1 : y == m ? -1 : st[3]) != 0
            && (IntStream.range(0, (int) (4 * (n + m) + 10)).anyMatch(i -> st[4] >= n + m - 2 || Long.valueOf(Math.min(st[2] > 0 ? n - st[0] : st[0] - 1, st[3] > 0 ? m - st[1] : st[1] - 1)) instanceof Long k
                && (st[0] += st[2] * k) > 0 && (st[1] += st[3] * k) > 0 && (st[5] += k) >= 0 && (st[4] += seen.add(st[0] * (m + 1) + st[1]) ? 1 : 0) > 0
                && (st[2] = st[0] == 1 ? 1 : st[0] == n ? -1 : st[2]) != 0 && (st[3] = st[1] == 1 ? 1 : st[1] == m ? -1 : st[3]) != 0 && false) || true)
            ? st[4] >= n + m - 2 ? st[5] + 1 : -1 : "");
    }
}
