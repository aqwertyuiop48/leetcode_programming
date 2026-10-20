import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer n
            && IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] a
            && new int[]{0, 1, IntStream.of(a).sum()} instanceof int[] st && new StringBuilder() instanceof StringBuilder sb
            && IntStream.iterate(0, i -> st[2] > 0, i -> i + 1).map(i -> (a[st[0]] > 0 ? new int[]{--a[st[0]], --st[2], sb.append('P').length()}.length : 0)
                + (n > 1 && st[2] > 0 ? new int[]{st[1] = st[0] + st[1] < 0 || st[0] + st[1] >= n ? -st[1] : st[1], st[0] += st[1], sb.append(st[1] > 0 ? 'R' : 'L').length()}.length : 0)).sum() >= 0
            ? sb : "");
    }
}
