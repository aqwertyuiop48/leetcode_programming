import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(
            new String(System.in.readAllBytes()).trim().split("[ \r\n]+") instanceof String[] t
            && Integer.valueOf(t[0]) instanceof Integer n
            && IntStream.rangeClosed(1, n).mapToLong(i -> Long.parseLong(t[i])).toArray() instanceof long[] a
            && Arrays.stream(a).filter(v -> v > 0).toArray() instanceof long[] p
            && Arrays.stream(a).filter(v -> v < 0).map(v -> -v).toArray() instanceof long[] q
            && Long.valueOf(Arrays.stream(p).sum()) instanceof Long sp
            && Long.valueOf(Arrays.stream(q).sum()) instanceof Long sq
            && Integer.valueOf(sp.equals(sq) ? (Arrays.compare(p, q) != 0 ? Arrays.compare(p, q) : a[n - 1] > 0 ? 1 : -1) : sp > sq ? 1 : -1) instanceof Integer res
            ? res > 0 ? "first" : "second"
            : "");
    }
}
