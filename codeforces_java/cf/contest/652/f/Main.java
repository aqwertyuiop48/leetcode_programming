import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st && Integer.valueOf(st.nextToken()) instanceof Integer n
            && Long.valueOf(st.nextToken()) instanceof Long m && Long.valueOf(st.nextToken()) instanceof Long t
            && new long[n] instanceof long[] s && new long[n] instanceof long[] g && new long[]{0} instanceof long[] sh
            && IntStream.range(0, n).filter(i -> (s[i] = Long.parseLong(st.nextToken()) - 1) + 0 * (g[i] = s[i] + (st.nextToken().charAt(0) == 'R' ? t : -t)) < 0).count() == 0
            && IntStream.range(0, n).filter(i -> (sh[0] = (sh[0] + Math.floorMod(Math.floorDiv(g[i], m), (long) n)) % n) < 0 || (g[i] = Math.floorMod(g[i], m)) < 0).count() == 0
            && Arrays.stream(g).sorted().toArray() instanceof long[] gs
            && IntStream.range(0, n).mapToLong(i -> (s[i] << 19) | i).sorted().toArray() instanceof long[] ord
            && new long[n] instanceof long[] out
            && IntStream.range(0, n).filter(r -> (out[(int) (ord[r] & 524287)] = gs[(int) ((r + sh[0]) % n)] + 1) < 0).count() == 0
            ? Arrays.stream(out).mapToObj(String::valueOf).collect(Collectors.joining(" ")) : "");
    }
}
