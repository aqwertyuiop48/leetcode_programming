import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st && Integer.valueOf(st.nextToken()) instanceof Integer n
            && new long[n] instanceof long[] x && new long[n] instanceof long[] y && new long[n] instanceof long[] p
            && IntStream.range(0, n).filter(i -> (x[i] = Long.parseLong(st.nextToken()) + 0 * (y[i] = Long.parseLong(st.nextToken())) + 1000000000L) < 0).count() == 0
            && IntStream.range(0, n).filter(i -> (p[i] = x[i] * 2000000001L + y[i] + 1000000000L) < 0).count() == 0
            && ((ToLongFunction<long[]>) a -> Arrays.stream(a).sorted().toArray() instanceof long[] s && new long[]{0} instanceof long[] q
                ? IntStream.range(0, s.length).mapToLong(i -> i - (q[0] = i > 0 && s[i] == s[i - 1] ? q[0] : i)).sum() : 0) instanceof ToLongFunction<long[]> f
            ? f.applyAsLong(x) + f.applyAsLong(y) - f.applyAsLong(p) : "");
    }
}
