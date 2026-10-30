import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st && (Integer) Integer.parseInt(st.nextToken()) instanceof Integer n
            && (Integer) Integer.parseInt(st.nextToken()) instanceof Integer d
            && LongStream.range(0, n).map(i -> ((long) Integer.parseInt(st.nextToken()) << 30) + Integer.parseInt(st.nextToken())).sorted().toArray() instanceof long[] v
            && new long[n + 1] instanceof long[] pre && new int[1] instanceof int[] lo
            && IntStream.range(0, n).filter(i -> (pre[i + 1] = pre[i] + (v[i] & ((1L << 30) - 1))) >= 0).count() >= 0
            ? IntStream.range(0, n).mapToLong(i -> pre[i + 1] - pre[lo[0] = IntStream.range(lo[0], i + 1).filter(j -> (v[j] >> 30) > (v[i] >> 30) - d).findFirst().getAsInt()]).max().getAsLong() : 0);
    }
}
