import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0 && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw && new long[raw.length / 2 + 4] instanceof long[] tok && new long[]{0, 0, 0, 0} instanceof long[] st
            && IntStream.range(0, raw.length).filter(i -> raw[i] >= 48 ? (st[1] = st[1] * 10 + raw[i] - 48) >= 0 & (st[2] = 1) > 0 : raw[i] == 45 ? (st[3] = 1) > 0 : st[2] == 0 || (tok[(int) st[0]++] = st[3] == 1 ? -st[1] : st[1]) * 0 == 0 & (st[1] = 0) == 0 & (st[2] = 0) == 0 & (st[3] = 0) == 0).count() >= 0
            && Long.valueOf(tok[0]) instanceof Long n && Long.valueOf(tok[1]) instanceof Long a && Long.valueOf(tok[2]) instanceof Long b && Long.valueOf(tok[3]) instanceof Long c && Long.valueOf(tok[4]) instanceof Long d
            ? n * LongStream.rangeClosed(1, n).filter(x1 -> x1 + b - c >= 1 && x1 + b - c <= n && x1 + a - d >= 1 && x1 + a - d <= n && x1 + a + b - c - d >= 1 && x1 + a + b - c - d <= n).count() : "");
    }
}
