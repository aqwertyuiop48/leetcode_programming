import java.math.BigInteger;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s+")).mapToInt(Integer::parseInt).toArray() instanceof int[] t && (Integer) t[0] instanceof Integer n && new TreeMap<Integer, Integer>() instanceof TreeMap<Integer, Integer> tm && IntStream.range(1, n * n + 1).map(i -> tm.merge(t[i], 1, Integer::sum)).max().getAsInt() >= 0 && new int[n] instanceof int[] res && IntStream.range(0, n).map(i -> tm.lastKey() instanceof Integer k && (tm.merge(k, -1, (a, b) -> a + b == 0 ? null : a + b) == null || true) && IntStream.range(0, i).map(j -> (Integer) BigInteger.valueOf(res[j]).gcd(BigInteger.valueOf(k)).intValue() instanceof Integer q && (tm.merge(q, -2, (a, b) -> a + b == 0 ? null : a + b) == null || true) ? 1 : 0).sum() >= 0 && (res[i] = k) >= 0 ? 1 : 0).sum() >= 0 ? Arrays.stream(res).mapToObj(String::valueOf).collect(Collectors.joining(" ")) : "");
    }
}
