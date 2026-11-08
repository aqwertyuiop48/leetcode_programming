import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer t && Integer.valueOf(t.nextToken()) instanceof Integer n && Integer.valueOf(t.nextToken()) instanceof Integer m && new int[]{0, 2, 3, 0} instanceof int[] st
            && new int[m] instanceof int[] a && new int[m] instanceof int[] b && new String[m] instanceof String[] res
            && IntStream.range(0, m).filter(i -> (a[i] = Integer.parseInt(t.nextToken())) > 0 & (b[i] = Integer.parseInt(t.nextToken())) >= 0).count() >= 0
            && IntStream.range(0, m).mapToLong(i -> ((long) a[i] * 2 + 1 - b[i] << 20) | i).sorted().toArray() instanceof long[] keys
            && LongStream.of(keys).filter(k -> (res[(int) (k & 1048575)] = b[(int) (k & 1048575)] == 1 ? "1 " + (++st[0] + 1)
                : st[2] <= st[0] + 1 ? ((st[1] + " " + st[2]) instanceof String e && (++st[1] < st[2] || (st[2]++ + (st[1] = 2)) > 0) ? e : "") : ((st[3] = 1) > 0 ? "" : "")) != null).count() >= 0
            ? (st[3] == 1 ? "-1" : String.join("\n", res)) : "");
    }
}
