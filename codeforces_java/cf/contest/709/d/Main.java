import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s+")).mapToLong(Long::parseLong).toArray() instanceof long[] t
            && IntStream.rangeClosed(0, 50000).filter(c -> (long) c * (c - 1) / 2 == t[0]).boxed().flatMap(c0 -> IntStream.rangeClosed(0, 50000).filter(c -> (long) c * (c - 1) / 2 == t[3]).filter(c1 -> c0 + c1 > 0 && (long) c0 * c1 == t[1] + t[2]).mapToObj(c1 -> new long[]{c0, c1})).findFirst() instanceof Optional<long[]> o
            ? (o.isEmpty() ? "Impossible"
                : (o.get() instanceof long[] c && Integer.valueOf((int) c[0]) instanceof Integer c0 && Integer.valueOf((int) c[1]) instanceof Integer c1
                && Integer.valueOf(c0 == 0 ? 0 : (int) (t[1] / c0)) instanceof Integer q && Integer.valueOf(c0 == 0 ? 0 : (int) (t[1] % c0)) instanceof Integer r
                ? "1".repeat(c1 - q - (r > 0 ? 1 : 0)) + "0".repeat(r) + (r > 0 ? "1" : "") + "0".repeat(c0 - r) + "1".repeat(q) : "")) : "");
    }
}
