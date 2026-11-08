import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] b && Arrays.copyOf(b, b.length + 1) instanceof byte[] raw
            && new long[4] instanceof long[] st && new int[]{0} instanceof int[] ix && new long[raw.length / 2 + 2] instanceof long[] v
            && IntStream.range(0, raw.length).allMatch(k -> raw[k] > 47 && raw[k] < 58 ? (st[0] = st[0] * 10 + raw[k] - 48) + (st[1] = 1) > 0
                : raw[k] == 45 ? (st[3] = 1) > 0
                : st[1] == 0 || ((v[ix[0]++] = st[3] == 1 ? -st[0] : st[0]) + (st[0] = 0) + (st[1] = 0) + (st[3] = 0)) * 0 == 0)
            && Integer.valueOf((int) v[0]) instanceof Integer n
            && IntStream.rangeClosed(1, n).filter(i -> v[i] != 0).mapToLong(i -> v[i]).toArray() instanceof long[] A
            && IntStream.rangeClosed(1, n).filter(i -> v[n + i] != 0).mapToLong(i -> v[n + i]).toArray() instanceof long[] B
            && Integer.valueOf(n - 1) instanceof Integer m
            ? (m == 0 || IntStream.range(0, m).filter(j -> B[j] == A[0]).boxed().findFirst().orElse(-1) instanceof Integer pos
                && pos >= 0 && IntStream.range(0, m).allMatch(i -> A[i] == B[(pos + i) % m])) ? "YES" : "NO" : "");
    }
}
