import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st
            && Integer.valueOf(st.nextToken()) instanceof Integer n
            && new long[n + 1] instanceof long[] deg
            && IntStream.range(0, 2 * (n - 1)).allMatch(i -> ++deg[Integer.parseInt(st.nextToken())] > 0)
            ? Arrays.stream(deg).map(d -> d * (d - 1) / 2).sum() : "");
    }
}
