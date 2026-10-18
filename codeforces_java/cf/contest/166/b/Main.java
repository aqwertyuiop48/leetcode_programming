import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).iterator() instanceof Iterator<Object> it
            && ((IntSupplier) () -> Integer.parseInt((String) it.next())) instanceof IntSupplier rd
            && Integer.valueOf(rd.getAsInt()) instanceof Integer n
            && IntStream.range(0, n).mapToObj(i -> new long[]{rd.getAsInt(), rd.getAsInt()}).toList() instanceof List<long[]> cw
            && IntStream.range(0, n).mapToObj(i -> cw.get(n - 1 - i)).toList() instanceof List<long[]> p
            && Integer.valueOf(rd.getAsInt()) instanceof Integer m
            && ((Function<long[][], Long>) v -> (v[1][0] - v[0][0]) * (v[2][1] - v[0][1]) - (v[1][1] - v[0][1]) * (v[2][0] - v[0][0])) instanceof Function<long[][], Long> cross
            ? IntStream.range(0, m).mapToObj(i -> new long[]{rd.getAsInt(), rd.getAsInt()}).allMatch(q ->
                cross.apply(new long[][]{p.get(0), p.get(1), q}) > 0
                && cross.apply(new long[][]{p.get(0), p.get(n - 1), q}) < 0
                && new int[]{1, n - 2} instanceof int[] lh
                && IntStream.range(0, 20).allMatch(z -> lh[0] >= lh[1] || (Integer.valueOf((lh[0] + lh[1] + 1) / 2) instanceof Integer mid
                    ? cross.apply(new long[][]{p.get(0), p.get(mid), q}) > 0 ? (lh[0] = mid) > 0 : (lh[1] = mid - 1) > 0 : true))
                && cross.apply(new long[][]{p.get(lh[0]), p.get(lh[0] + 1), q}) > 0) ? "YES" : "NO"
            : "");
    }
}
