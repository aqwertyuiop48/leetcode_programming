import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new BufferedReader(new InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(Object::toString).mapToInt(Integer::parseInt).iterator() instanceof PrimitiveIterator.OfInt it
            && Integer.valueOf(it.nextInt()) instanceof Integer n && Integer.valueOf(it.nextInt()) instanceof Integer m
            && IntStream.range(0, n).mapToLong(i -> it.nextInt() * 2L + 1).toArray() instanceof long[] ea && IntStream.range(0, n).mapToLong(i -> (m - it.nextInt()) * 2L).toArray() instanceof long[] eb
            && LongStream.concat(Arrays.stream(ea), Arrays.stream(eb)).sorted().toArray() instanceof long[] ev
            && new long[n] instanceof long[] st && new long[n] instanceof long[] bl && new long[n] instanceof long[] res && new int[3] instanceof int[] p
            && Arrays.stream(ev).allMatch(e -> (e & 1) == 1 ? (st[p[0]++] = e >> 1) >= 0
                : p[0] > 0 ? (res[p[2]++] = st[--p[0]] + m - (e >> 1)) >= 0 : (bl[p[1]++] = e >> 1) >= 0)
            && IntStream.range(0, p[0]).allMatch(i -> (res[p[2]++] = st[i] - bl[p[0] - 1 - i]) >= 0)
            ? Arrays.stream(res).boxed().sorted(Comparator.reverseOrder()).map(String::valueOf).collect(Collectors.joining(" ")) : "");
    }
}
