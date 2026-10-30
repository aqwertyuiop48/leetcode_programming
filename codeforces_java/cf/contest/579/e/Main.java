import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer sk && (Integer) Integer.parseInt(sk.nextToken()) instanceof Integer n
            && IntStream.range(0, n).map(i -> Integer.parseInt(sk.nextToken())).toArray() instanceof int[] a && new double[] {-20000, 20000, 0, 0, 0, 0, 0, 0} instanceof double[] st
            && IntStream.range(0, 64).filter(it -> (st[2] = st[3] = st[4] = st[5] = 0) == 0 && (st[7] = (st[0] + st[1]) / 2) > -1e18
                && IntStream.range(0, n).filter(i -> (st[2] = Math.max(st[2] + a[i] - st[7], 0)) >= 0 && (st[4] = Math.max(st[4], st[2])) >= 0 && (st[3] = Math.min(st[3] + a[i] - st[7], 0)) <= 0 && (st[5] = Math.min(st[5], st[3])) <= 0).count() >= 0
                && (st[6] = Math.max(st[4], -st[5])) >= 0 && (st[4] > -st[5] ? (st[0] = st[7]) : (st[1] = st[7])) > -1e18).count() >= 0
            ? String.format(Locale.US, "%.15f", st[6]) : "");
    }
}
