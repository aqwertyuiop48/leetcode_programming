import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).iterator() instanceof Iterator<Object> it
            && Integer.valueOf(Integer.parseInt((String) it.next())) instanceof Integer n
            && IntStream.rangeClosed(0, n).mapToLong(i -> i == 0 ? 0 : Long.parseLong((String) it.next())).toArray() instanceof long[] a
            && new long[n + 2] instanceof long[] diff
            && IntStream.range(1, n).allMatch(i -> Integer.valueOf(n - i) instanceof Integer len
                && IntStream.range(1, Integer.bitCount(len)).allMatch(c -> new int[]{len, 0} instanceof int[] st
                    && IntStream.range(0, c).allMatch(z -> (st[1] |= Integer.highestOneBit(st[0])) >= 0 && (st[0] ^= Integer.highestOneBit(st[0])) >= 0)
                    && (i + st[1] >= n || (diff[i + st[1]] += a[i]) >= Long.MIN_VALUE)))
            && new long[]{0, 0} instanceof long[] run
            ? IntStream.range(1, n).mapToObj(k -> String.valueOf((run[0] += a[k]) + (run[1] += diff[k]))).collect(Collectors.joining("\n"))
            : "");
    }
}
