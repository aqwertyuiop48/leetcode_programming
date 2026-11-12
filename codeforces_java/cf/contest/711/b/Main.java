import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0 && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw && new long[raw.length / 2 + 2] instanceof long[] tok && new long[]{0, 0, 0} instanceof long[] st
            && IntStream.range(0, raw.length).filter(i -> raw[i] >= 48 ? (st[1] = st[1] * 10 + raw[i] - 48) >= 0 & (st[2] = 1) > 0 : st[2] == 0 || (tok[(int) st[0]++] = st[1]) >= 0 & (st[1] = 0) == 0 & (st[2] = 0) == 0).count() >= 0
            && Integer.valueOf((int) tok[0]) instanceof Integer n
            && Integer.valueOf(IntStream.range(0, n * n).filter(i -> tok[1 + i] == 0).findFirst().orElse(0)) instanceof Integer z
            && Integer.valueOf(z / n) instanceof Integer r0w && Integer.valueOf(z % n) instanceof Integer c0w
            && ((java.util.function.IntToLongFunction) r -> IntStream.range(0, n).mapToLong(c -> tok[1 + r * n + c]).sum()) instanceof java.util.function.IntToLongFunction rowSum
            && ((java.util.function.IntToLongFunction) c -> IntStream.range(0, n).mapToLong(r -> tok[1 + r * n + c]).sum()) instanceof java.util.function.IntToLongFunction colSum
            && Long.valueOf(n == 1 ? 0 : rowSum.applyAsLong(r0w == 0 ? 1 : 0)) instanceof Long target
            && Long.valueOf(target - rowSum.applyAsLong(r0w)) instanceof Long x
            ? (n == 1 ? "1" : x <= 0 ? "-1"
                : (tok[1 + z] = x) == x
                && IntStream.range(0, n).allMatch(i -> rowSum.applyAsLong(i) == target && colSum.applyAsLong(i) == target)
                && IntStream.range(0, n).mapToLong(i -> tok[1 + i * n + i]).sum() == target
                && IntStream.range(0, n).mapToLong(i -> tok[1 + i * n + n - 1 - i]).sum() == target ? (Object) x : "-1") : "");
    }
}
