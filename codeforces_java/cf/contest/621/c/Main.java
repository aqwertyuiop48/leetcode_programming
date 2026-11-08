import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st
            && Integer.valueOf(st.nextToken()) instanceof Integer n
            && Long.valueOf(st.nextToken()) instanceof Long p
            && new double[n] instanceof double[] pr
            && IntStream.range(0, n).filter(i -> Long.valueOf(st.nextToken()) instanceof Long l
                && Long.valueOf(st.nextToken()) instanceof Long r
                && (pr[i] = (double) (r / p - (l - 1) / p) / (r - l + 1)) < -1).count() >= 0
            ? String.format(Locale.US, "%.9f", IntStream.range(0, n).mapToDouble(i -> 2000.0 * (pr[i] + pr[(i + 1) % n] - pr[i] * pr[(i + 1) % n])).sum()) : "");
    }
}
