import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw && new int[1000003] instanceof int[] tok && new long[]{0, 0, 0} instanceof long[] z
            && IntStream.range(0, raw.length + 1).filter(p -> p < raw.length && raw[p] >= 48 ? (z[0] = z[0] * 10 + raw[p] - 48) >= 0 && (z[1] = 1) > 0
                : z[1] == 1 && (tok[(int) z[2]++] = (int) z[0]) >= 0 && (z[0] = 0) == 0 && (z[1] = 0) == 0).count() >= 0
            && (Integer) tok[0] instanceof Integer n && (Integer) tok[1] instanceof Integer k
            && ((LongPredicate) x -> Arrays.stream(tok, 2, 2 + n).mapToLong(v -> v < x ? 0 : (1L << (31 - Integer.numberOfLeadingZeros(v / (int) x)))
                + ((v >> (31 - Integer.numberOfLeadingZeros(v / (int) x))) == 2 * x - 1 ? v & ((1 << (31 - Integer.numberOfLeadingZeros(v / (int) x))) - 1) : 0)).sum() >= k) instanceof LongPredicate f
            && new long[]{1, Arrays.stream(tok, 2, 2 + n).max().getAsInt()} instanceof long[] st
            && IntStream.range(0, 25).filter(i -> st[0] < st[1] && (f.test((st[0] + st[1] + 1) / 2) ? (st[0] = (st[0] + st[1] + 1) / 2) > 0 : (st[1] = (st[0] + st[1] + 1) / 2 - 1) > 0)).count() >= 0
            ? (f.test(1) ? st[0] : -1) : "");
    }
}
