import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        if (new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st && ((IntSupplier) () -> Integer.parseInt(st.nextToken())) instanceof IntSupplier ni && Integer.valueOf(ni.getAsInt()) instanceof Integer n && Integer.valueOf(ni.getAsInt()) instanceof Integer m && Integer.valueOf(ni.getAsInt()) instanceof Integer q
            && IntStream.concat(IntStream.of(0), IntStream.generate(ni).limit(n)).asLongStream().toArray() instanceof long[] a
            && IntStream.range(0, m).mapToObj(j -> IntStream.generate(ni).limit(ni.getAsInt()).toArray()).toArray(int[][]::new) instanceof int[][] sets
            && IntStream.range(0, m).filter(j -> sets[j].length > 400).toArray() instanceof int[] hv && Integer.valueOf(hv.length) instanceof Integer hc
            && IntStream.range(0, m).map(j -> -1).toArray() instanceof int[] hid && IntStream.range(0, hc).map(h -> hid[hv[h]] = h).summaryStatistics() != null
            && IntStream.range(0, m).boxed().flatMapToLong(j -> Arrays.stream(sets[j]).mapToLong(e -> (long) e << 20 | j)).sorted().toArray() instanceof long[] keys
            && new int[n + 2] instanceof int[] pre && Arrays.stream(keys).mapToInt(kk -> pre[(int) (kk >> 20) + 1]++).sum() >= 0 && new int[] {0} instanceof int[] run && IntStream.range(0, n + 2).map(e -> pre[e] = run[0] += pre[e]).sum() >= 0
            && new int[m * hc] instanceof int[] inter && new long[hc] instanceof long[] lazy
            && IntStream.range(0, hc).mapToLong(h -> Arrays.stream(sets[hv[h]]).mapToLong(e -> IntStream.range(pre[e], pre[e + 1]).map(p -> inter[(int) (keys[p] & 1048575) * hc + h]++).sum()).sum()).sum() >= 0
            && IntStream.range(0, hc).mapToLong(h -> Arrays.stream(sets[hv[h]]).mapToLong(e -> a[e]).sum()).toArray() instanceof long[] hsum
            && (IntToLongFunction) (j -> (hid[j] >= 0 ? hsum[hid[j]] : Arrays.stream(sets[j]).mapToLong(e -> a[e]).sum()) + IntStream.range(0, hc).mapToLong(h -> lazy[h] * inter[j * hc + h]).sum()) instanceof IntToLongFunction qf
            && (LongBinaryOperator) ((k, x) -> hid[(int) k] >= 0 ? (lazy[hid[(int) k]] += x) : Arrays.stream(sets[(int) k]).mapToLong(e -> a[e] += x).sum() + IntStream.range(0, hc).mapToLong(h -> hsum[h] += x * inter[(int) k * hc + h]).sum()) instanceof LongBinaryOperator uf)
            System.out.print(IntStream.range(0, q).mapToObj(i -> st.nextToken().equals("?") ? String.valueOf(qf.applyAsLong(ni.getAsInt() - 1)) : Long.toString(uf.applyAsLong(ni.getAsInt() - 1, ni.getAsInt())).substring(0, 0)).filter(s -> !s.isEmpty()).collect(Collectors.joining("\n")));
    }
}

