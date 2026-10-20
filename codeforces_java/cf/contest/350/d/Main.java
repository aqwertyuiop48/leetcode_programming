import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import java.math.*;
import java.util.concurrent.atomic.*;

public class Main {
    public static void main(String[] args) throws Exception {
        if (new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st && ((IntSupplier) () -> Integer.parseInt(st.nextToken())) instanceof IntSupplier ni && Integer.valueOf(ni.getAsInt()) instanceof Integer n && Integer.valueOf(ni.getAsInt()) instanceof Integer m
            && (Function<long[], long[]>) (v -> Long.valueOf(BigInteger.valueOf(v[0]).gcd(BigInteger.valueOf(v[1])).gcd(BigInteger.valueOf(v[2])).longValue()) instanceof Long g && Long.valueOf(v[0] < 0 || v[0] == 0 && v[1] < 0 ? -g : g) instanceof Long s ? new long[] {v[0] / s, v[1] / s, v[2] / s} : null) instanceof Function<long[], long[]> norm
            && IntStream.range(0, n).mapToObj(i -> new long[] {ni.getAsInt(), ni.getAsInt(), ni.getAsInt(), ni.getAsInt()}).map(q -> norm.apply(new long[] {q[1] - q[3], q[2] - q[0], -(q[1] - q[3]) * q[0] - (q[2] - q[0]) * q[1]}) instanceof long[] k ? new long[][] {k, {Math.min(k[1] * q[0] - k[0] * q[1], k[1] * q[2] - k[0] * q[3]) * 2, Math.max(k[1] * q[0] - k[0] * q[1], k[1] * q[2] - k[0] * q[3]) * 2}} : null).collect(Collectors.groupingBy(o -> List.of(o[0][0], o[0][1], o[0][2]))).entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, e -> new long[][] {e.getValue().stream().mapToLong(o -> o[1][0]).sorted().toArray(), e.getValue().stream().mapToLong(o -> o[1][1]).sorted().toArray()})) instanceof Map<List<Long>, long[][]> mp
            && IntStream.range(0, m).mapToObj(i -> new long[] {ni.getAsInt(), ni.getAsInt(), ni.getAsInt()}).toArray(long[][]::new) instanceof long[][] c)
            System.out.print(IntStream.range(0, m).mapToLong(i -> IntStream.range(i + 1, m).filter(j -> c[i][2] == c[j][2]).mapToLong(j -> norm.apply(new long[] {2 * (c[j][0] - c[i][0]), 2 * (c[j][1] - c[i][1]), -(c[j][0] * c[j][0] + c[j][1] * c[j][1] - c[i][0] * c[i][0] - c[i][1] * c[i][1])}) instanceof long[] k && mp.get(List.of(k[0], k[1], k[2])) instanceof long[][] gr && Long.valueOf((c[i][0] + c[j][0]) * k[1] - (c[i][1] + c[j][1]) * k[0]) instanceof Long x && Integer.valueOf(Arrays.binarySearch(gr[0], x)) instanceof Integer u && Integer.valueOf(Arrays.binarySearch(gr[1], x)) instanceof Integer w ? (u >= 0 ? u + 1 : -u - 1) - (w >= 0 ? w : -w - 1) : 0).sum()).sum());
    }
}
