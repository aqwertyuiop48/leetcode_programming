import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n
            && new int[1 << 20] instanceof int[] cnt && IntStream.range(0, n).allMatch(i -> ++cnt[Integer.parseInt(tk.nextToken())] > 0)
            && new long[n + 1] instanceof long[] p2 && (p2[0] = 1) > 0 && IntStream.rangeClosed(1, n).allMatch(i -> (p2[i] = p2[i - 1] * 2 % 1000000007L) > 0)
            && IntStream.range(0, 20).allMatch(b -> IntStream.range(0, 1 << 20).allMatch(mask -> (mask >> b & 1) == 1 || (cnt[mask] += cnt[mask | 1 << b]) >= 0))
            ? (IntStream.range(0, 1 << 20).mapToLong(mask -> (Integer.bitCount(mask) % 2 == 0 ? 1 : -1) * (p2[cnt[mask]] - 1)).sum() % 1000000007L + 1000000007L) % 1000000007L : 0);
    }
}
