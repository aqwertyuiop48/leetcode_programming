import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw && new int[raw.length / 2 + 2] instanceof int[] v && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i -> i < raw.length && raw[i] >= 48 ? (ps[1] = ps[1] * 10 + raw[i] - 48) >= 0 && (ps[2] = 1) == 1 : ps[2] == 0 || (v[ps[0]++] = ps[1]) >= 0 && (ps[1] = 0) == 0 && (ps[2] = 0) == 0)
            && Integer.valueOf(v[0]) instanceof Integer n && Integer.valueOf(v[1]) instanceof Integer m && new int[n + 1] instanceof int[] d
            && IntStream.range(0, 2 * m).allMatch(i -> ++d[v[2 + i]] > 0)
            && IntStream.rangeClosed(1, n).map(i -> d[i]).sorted().toArray() instanceof int[] ds
            ? (m.equals(n) && Arrays.stream(ds).allMatch(x -> x == 2) ? "ring" : m == n - 1 && ds[0] == 1 && ds[1] == 1 && ds[n - 1] == 2 && ds[n - 2] == 2 ? "bus" : m == n - 1 && ds[n - 2] == 1 && ds[n - 1] == n - 1 ? "star" : "unknown") + " topology" : "");
    }
}
