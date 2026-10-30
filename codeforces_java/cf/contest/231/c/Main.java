import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer s
            && Integer.valueOf(Integer.parseInt(s.nextToken())) instanceof Integer n && Long.valueOf(Long.parseLong(s.nextToken())) instanceof Long k
            && IntStream.range(0, n).mapToLong(i -> Long.parseLong(s.nextToken())).sorted().toArray() instanceof long[] a
            && new long[]{0, 0, 0, 0} instanceof long[] st
            ? IntStream.range(0, n).allMatch(r -> (st[0] += a[r]) > Long.MIN_VALUE && IntStream.iterate(0, x -> a[r] * (r - st[1] + 1) - st[0] > k, x -> x + 1).allMatch(x -> (st[0] -= a[(int) st[1]++]) > Long.MIN_VALUE)
                && (r - st[1] + 1 <= st[2] || (st[2] = r - st[1] + 1) > 0 && (st[3] = a[r]) > Long.MIN_VALUE)) ? st[2] + " " + st[3] : "" : "");
    }
}
