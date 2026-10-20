import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import java.math.*;
import java.util.concurrent.atomic.*;

public class Main {
    public static void main(String[] args) throws Exception {
        if (new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st && ((IntSupplier) () -> Integer.parseInt(st.nextToken())) instanceof IntSupplier ni && Integer.valueOf(ni.getAsInt()) instanceof Integer n && Integer.valueOf(ni.getAsInt()) instanceof Integer m && Integer.valueOf(ni.getAsInt()) instanceof Integer q
            && IntStream.concat(IntStream.of(0), IntStream.generate(ni).limit(n)).asLongStream().toArray() instanceof long[] a
            && IntStream.range(0, m).mapToObj(j -> IntStream.generate(ni).limit(ni.getAsInt()).toArray()).toArray(int[][]::new) instanceof int[][] sets
            && IntStream.range(0, m).filter(j -> sets[j].length > 700).toArray() instanceof int[] hv && Integer.valueOf(hv.length) instanceof Integer hc
            && IntStream.range(0, m).map(j -> -1).toArray() instanceof int[] hid && IntStream.range(0, hc).map(h -> hid[hv[h]] = h).summaryStatistics() != null
            && new int[hc][m] instanceof int[][] inter && new int[n + 1] instanceof int[] stamp && new long[hc] instanceof long[] lazy
            && IntStream.range(0, hc).mapToLong(h -> Arrays.stream(sets[hv[h]]).map(e -> stamp[e] = h + 1).sum() + IntStream.range(0, m).map(j -> inter[h][j] = (int) Arrays.stream(sets[j]).filter(e -> stamp[e] == h + 1).count()).sum()).sum() >= 0
            && IntStream.range(0, hc).mapToLong(h -> Arrays.stream(sets[hv[h]]).mapToLong(e -> a[e]).sum()).toArray() instanceof long[] hsum
            && (IntToLongFunction) (j -> (hid[j] >= 0 ? hsum[hid[j]] : Arrays.stream(sets[j]).mapToLong(e -> a[e]).sum()) + IntStream.range(0, hc).mapToLong(h -> lazy[h] * inter[h][j]).sum()) instanceof IntToLongFunction qf
            && (LongBinaryOperator) ((k, x) -> hid[(int) k] >= 0 ? (lazy[hid[(int) k]] += x) : Arrays.stream(sets[(int) k]).mapToLong(e -> a[e] += x).sum() + IntStream.range(0, hc).mapToLong(h -> hsum[h] += x * inter[h][(int) k]).sum()) instanceof LongBinaryOperator uf)
            System.out.print(IntStream.range(0, q).mapToObj(i -> st.nextToken().equals("?") ? String.valueOf(qf.applyAsLong(ni.getAsInt() - 1)) : Long.toString(uf.applyAsLong(ni.getAsInt() - 1, ni.getAsInt())).substring(0, 0)).filter(s -> !s.isEmpty()).collect(Collectors.joining("\n")));
    }
}
