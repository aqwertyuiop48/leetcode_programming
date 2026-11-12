import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st
            && Integer.valueOf(st.nextToken()) instanceof Integer n
            && Integer.valueOf(st.nextToken()) instanceof Integer c
            && new long[n + c + 1] instanceof long[] f
            && (f[0] = 1) == 1
            && IntStream.rangeClosed(1, n + c).allMatch(i -> (f[i] = f[i - 1] * i % 1000003L) > 0)
            && new long[]{1, f[n] * f[c] % 1000003L} instanceof long[] pw
            && IntStream.range(0, 21).allMatch(b -> (pw[0] = ((1000001L >> b) & 1) == 1 ? pw[0] * pw[1] % 1000003L : pw[0]) > 0
                && (pw[1] = pw[1] * pw[1] % 1000003L) > 0)
            ? (f[n + c] * pw[0] % 1000003L + 1000002L) % 1000003L : "");
    }
}
