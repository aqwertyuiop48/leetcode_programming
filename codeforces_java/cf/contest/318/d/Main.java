import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st
            && Integer.valueOf(st.nextToken()) instanceof Integer n && Integer.valueOf(st.nextToken()) instanceof Integer t
            && new int[256 * 256] instanceof int[] c && new ArrayDeque<Integer>(List.of(128 * 256 + 128)) instanceof ArrayDeque<Integer> q
            && (c[128 * 256 + 128] = n) >= 0
            && Stream.generate(q::poll).takeWhile(Objects::nonNull).filter(p -> Integer.valueOf(c[p] / 4) instanceof Integer k && k > 0
                && (c[p] -= 4 * k) >= 0 && (c[p + 1] += k) >= 0 && (c[p - 1] += k) >= 0 && (c[p + 256] += k) >= 0 && (c[p - 256] += k) >= 0
                && IntStream.of(p + 1, p - 1, p + 256, p - 256).filter(w -> c[w] >= 4 && c[w] - k < 4).mapToObj(w -> q.add(w)).count() >= 0).count() >= 0
            ? IntStream.range(0, t).mapToObj(i -> Integer.valueOf(st.nextToken()) instanceof Integer x && Integer.valueOf(st.nextToken()) instanceof Integer y
                ? Math.abs(x) >= 120 || Math.abs(y) >= 120 ? "0" : "" + c[(x + 128) * 256 + y + 128] : "").collect(Collectors.joining("\n")) : "");
    }
}
