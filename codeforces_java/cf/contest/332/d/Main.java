import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).mapToLong(t -> Long.parseLong((String) t)).toArray() instanceof long[] t
            && Integer.valueOf((int) t[0]) instanceof Integer n && Integer.valueOf((int) t[1]) instanceof Integer k
            && new long[n] instanceof long[] w && new long[n] instanceof long[] d
            && IntStream.range(0, n).allMatch(i -> IntStream.range(i + 1, n).filter(j -> t[2 + i * (n - 1) - i * (i - 1) / 2 + j - i - 1] >= 0)
                .allMatch(j -> (w[i] += t[2 + i * (n - 1) - i * (i - 1) / 2 + j - i - 1]) >= 0 & (w[j] += t[2 + i * (n - 1) - i * (i - 1) / 2 + j - i - 1]) >= 0 & ++d[i] > 0 & ++d[j] > 0))
            ? IntStream.range(0, n).mapToLong(v -> d[v] == 0 ? 0 : (k == 1 ? 1 : k == 2 ? d[v] - 1 : d[v] == k ? 1 : 0) * w[v]).sum() / (k == 1 ? n : k == 2 ? (long) n * (n - 1) / 2 : n) : "");
    }
}
