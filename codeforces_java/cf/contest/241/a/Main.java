import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer m && Long.valueOf(sc.nextLong()) instanceof Long k
            && IntStream.range(0, m).mapToLong(i -> sc.nextLong()).toArray() instanceof long[] d
            && IntStream.range(0, m).mapToLong(i -> sc.nextLong()).toArray() instanceof long[] s
            && new long[]{0, 0, 0} instanceof long[] st
            && IntStream.range(0, m).allMatch(i -> (st[0] += s[i]) >= 0 && (st[2] = Math.max(st[2], s[i])) >= 0
                && Long.valueOf(Math.max(0, (d[i] - st[0] + st[2] - 1) / st[2])) instanceof Long w
                && (st[1] += w * k + d[i]) > 0 && (st[0] += w * st[2] - d[i]) >= 0)
            ? st[1] : "");
    }
}
