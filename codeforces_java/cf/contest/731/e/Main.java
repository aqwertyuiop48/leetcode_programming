import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer z && Integer.valueOf(Integer.parseInt(z.nextToken())) instanceof Integer n
            && IntStream.range(0, n).mapToLong(i -> Long.parseLong(z.nextToken())).toArray() instanceof long[] a && new long[n + 1] instanceof long[] pref
            && IntStream.range(0, n).filter(i -> (pref[i + 1] = pref[i] + a[i]) > Long.MIN_VALUE).count() >= 0 && new long[]{pref[n]} instanceof long[] best
            && IntStream.range(2, n).map(i -> n + 1 - i).filter(i -> (best[0] = Math.max(best[0], pref[i] - best[0])) > Long.MIN_VALUE).count() >= 0
            ? best[0] : 0L);
    }
}
