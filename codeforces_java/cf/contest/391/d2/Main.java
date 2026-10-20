import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] buf && new int[1] instanceof int[] ps
            && ((IntSupplier) () -> new int[1] instanceof int[] r
                && !IntStream.iterate(0, z -> z + 1).allMatch(z -> buf[ps[0]] < '0' && ++ps[0] > 0)
                && !IntStream.iterate(0, z -> z + 1).allMatch(z -> ps[0] < buf.length && buf[ps[0]] >= '0' && (r[0] = r[0] * 10 + buf[ps[0]++] - '0') >= 0)
                ? r[0] : 0) instanceof IntSupplier nx
            && Integer.valueOf(nx.getAsInt()) instanceof Integer n && Integer.valueOf(nx.getAsInt()) instanceof Integer m
            && IntStream.range(0, n).mapToObj(i -> new int[]{nx.getAsInt(), nx.getAsInt(), nx.getAsInt()}).toList() instanceof List<int[]> verts
            && IntStream.range(0, m).mapToObj(i -> new int[]{nx.getAsInt(), nx.getAsInt(), nx.getAsInt()}).toList() instanceof List<int[]> hors
            && ((IntPredicate) k -> verts.stream().filter(v -> v[2] >= 2 * k).toList() instanceof List<int[]> vs
                && hors.stream().filter(h -> h[2] >= 2 * k).toList() instanceof List<int[]> hs
                && !vs.isEmpty() && !hs.isEmpty()
                && Integer.valueOf(hs.size()) instanceof Integer H
                && IntStream.range(0, H).boxed().sorted(Comparator.comparingInt(i -> hs.get(i)[1])).toList() instanceof List<Integer> order
                && new int[H] instanceof int[] slot && IntStream.range(0, H).allMatch(j -> (slot[order.get(j)] = j + 1) > 0)
                && order.stream().mapToInt(i -> 2 * hs.get(i)[1]).toArray() instanceof int[] sy2
                && Stream.concat(IntStream.range(0, H).boxed().flatMap(i -> Stream.of(((hs.get(i)[0] + k) * 3L << 20) | i, (((hs.get(i)[0] + hs.get(i)[2] - k) * 3L + 2) << 20) | i)),
                    IntStream.range(0, vs.size()).mapToObj(i -> ((vs.get(i)[0] * 3L + 1) << 20) | i)).mapToLong(Long::longValue).sorted().toArray() instanceof long[] keys
                && new int[H + 1] instanceof int[] bit
                && ((IntUnaryOperator) i -> IntStream.iterate(i, j -> j > 0, j -> j - (j & -j)).map(j -> bit[j]).sum()) instanceof IntUnaryOperator pref
                && Arrays.stream(keys).anyMatch(key -> Integer.valueOf((int) ((key >> 20) % 3)) instanceof Integer ty && Integer.valueOf((int) (key & 0xFFFFF)) instanceof Integer idx
                    ? ty == 1 ? pref.applyAsInt(-Arrays.binarySearch(sy2, 2 * (vs.get(idx)[1] + vs.get(idx)[2] - k) + 1) - 1) - pref.applyAsInt(-Arrays.binarySearch(sy2, 2 * (vs.get(idx)[1] + k) - 1) - 1) > 0
                        : IntStream.iterate(slot[idx], j -> j <= H, j -> j + (j & -j)).allMatch(j -> (bit[j] += 1 - ty) > -999999) && false
                    : false)) instanceof IntPredicate ok
            ? IntStream.iterate(0, z -> z + 1).limit(1).map(z -> new int[]{0, 50000001} instanceof int[] bs
                && (IntStream.iterate(0, y -> bs[1] - bs[0] > 1, y -> y + 1).allMatch(y -> Integer.valueOf((bs[0] + bs[1]) / 2) instanceof Integer mid
                    && (ok.test(mid) ? (bs[0] = mid) >= 0 : (bs[1] = mid) >= 0)) || true) ? bs[0] : -1).sum() : "");
    }
}
