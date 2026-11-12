import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t && Integer.valueOf(t[0]) instanceof Integer n && Long.valueOf(t[1]) instanceof Long k
            && LongStream.range(0, n).map(i -> Long.parseLong(t[2 + (int) i])).toArray() instanceof long[] a
            && new long[][][] {IntStream.range(0, n).mapToObj(i -> IntStream.range(0, n).mapToLong(j -> Long.bitCount(a[i] ^ a[j]) % 3 == 0 ? 1 : 0).toArray()).toArray(long[][]::new)} instanceof long[][][] H
            && ((IntFunction<long[]>) i -> new long[n] instanceof long[] acc && IntStream.range(0, n).filter(q -> H[0][i][q] != 0 && IntStream.range(0, n).filter(j -> (acc[j] = (acc[j] + H[0][i][q] * H[0][q][j]) % 1000000007L) < 0).count() >= 0).count() >= 0 ? acc : null) instanceof IntFunction<long[]> sq
            && new long[][] {LongStream.generate(() -> 1).limit(n).toArray()} instanceof long[][] r
            && LongStream.range(0, 60).filter(bit -> ((k - 1) >> bit & 1) == 1
                ? (r[0] = IntStream.range(0, n).mapToLong(j -> IntStream.range(0, n).mapToLong(i -> r[0][i] * H[0][i][j] % 1000000007L).sum() % 1000000007L).toArray()) != null && (H[0] = IntStream.range(0, n).parallel().mapToObj(sq).toArray(long[][]::new)) != null
                : (H[0] = IntStream.range(0, n).parallel().mapToObj(sq).toArray(long[][]::new)) != null).count() >= 0
            ? Long.toString(Arrays.stream(r[0]).sum() % 1000000007L) : "");
    }
}
