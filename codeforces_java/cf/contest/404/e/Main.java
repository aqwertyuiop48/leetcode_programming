import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in).next() instanceof String s0 && (Boolean) (s0.charAt(s0.length() - 1) == 'L') instanceof Boolean lastL
            && new long[]{0, 0, 0, 0} instanceof long[] st
            && IntStream.range(0, s0.length()).allMatch(t -> (st[1] = Math.max(st[1], st[0])) >= 0 && (st[2] = Math.min(t == 0 ? Long.MAX_VALUE : st[2], st[0])) > Long.MIN_VALUE && (st[3] = Math.max(st[3], st[1] - st[0])) >= 0
                && (st[0] += (s0.charAt(t) == 'L') == lastL ? -1 : 1) > Long.MIN_VALUE)
            ? st[2] > st[0] ? 1 : Math.max(0, Math.min(st[1] - 1, st[2] > st[0] ? Long.MAX_VALUE : st[2] + (st[1] - st[0]) - 1) - Math.max(0, st[1] - st[0] > st[3] ? 0 : st[3] + st[0] + 1) + 1) : 0);
    }
}
