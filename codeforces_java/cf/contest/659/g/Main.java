import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st
            && Integer.valueOf(st.nextToken()) instanceof Integer n
            && new long[n + 2] instanceof long[] h
            && IntStream.rangeClosed(1, n).allMatch(i -> (h[i] = Long.parseLong(st.nextToken())) > 0)
            && (h[0] = 2000000000L) > 0 && (h[n + 1] = 2000000000L) > 0
            && new long[2] instanceof long[] s
            && IntStream.rangeClosed(1, n).allMatch(i -> (s[1] = (s[1] + h[i] - 1 + s[0] * (Math.min(h[i - 1], h[i]) - 1)) % 1000000007L) + (s[0] = (Math.min(h[i], h[i + 1]) - 1 + s[0] * (Math.min(Math.min(h[i - 1], h[i]), h[i + 1]) - 1)) % 1000000007L) >= 0)
            ? s[1]
            : "");
    }
}
