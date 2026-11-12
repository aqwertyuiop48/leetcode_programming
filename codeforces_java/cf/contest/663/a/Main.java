import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] w
            && Integer.valueOf(Integer.parseInt(w[w.length - 1])) instanceof Integer n
            && IntStream.range(0, w.length).filter(i -> w[i].equals("?")).map(i -> i == 0 || w[i - 1].equals("+") ? 1 : -1).toArray() instanceof int[] sg
            && new long[]{n - IntStream.of(sg).sum()} instanceof long[] d
            && new int[1] instanceof int[] q
            && IntStream.range(0, w.length).mapToObj(i -> w[i].equals("?")
                ? ("" + (Long.valueOf(1 + (sg[q[0]] > 0 && d[0] > 0 ? Math.min(d[0], n - 1) : sg[q[0]] < 0 && d[0] < 0 ? Math.min(-d[0], n - 1) : 0)) instanceof Long v
                    && (d[0] -= (v - 1) * sg[q[0]++]) <= Long.MAX_VALUE ? v : 0L))
                : w[i]).collect(Collectors.joining(" ")) instanceof String res
            ? d[0] == 0 ? "Possible\n" + res : "Impossible"
            : "");
    }
}
