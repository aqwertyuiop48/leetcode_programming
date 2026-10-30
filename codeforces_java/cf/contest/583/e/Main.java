import java.math.BigInteger;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s+")).mapToInt(Integer::parseInt).toArray() instanceof int[] t && (Integer) t[0] instanceof Integer n && IntStream.range(0, n).map(x -> x == 0 ? 0 : BigInteger.valueOf(x).gcd(BigInteger.valueOf(n)).intValue()).toArray() instanceof int[] g ? IntStream.range(1, n).filter(d -> n % d == 0).mapToLong(d -> new int[d] instanceof int[] mx && IntStream.range(0, n).map(i -> mx[i % d] = Math.max(mx[i % d], t[1 + i])).max().getAsInt() >= 0 && new int[2 * n + 1] instanceof int[] run && IntStream.range(0, 2 * n).map(i -> 2 * n - 1 - i).map(i -> run[i] = t[1 + i % n] == mx[i % d] ? run[i + 1] + 1 : 0).max().getAsInt() >= 0 && new int[n] instanceof int[] pc && IntStream.range(1, n).map(x -> pc[x] = pc[x - 1] + (g[x] == d ? 1 : 0)).max().getAsInt() >= 0 ? IntStream.range(0, n).mapToLong(l -> pc[Math.min(run[l], n - 1)]).sum() : 0L).sum() : 0L);
    }
}
