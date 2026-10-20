import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st
            && Integer.valueOf(st.nextToken()) instanceof Integer n
            && IntStream.generate(() -> Integer.parseInt(st.nextToken())).limit(n).toArray() instanceof int[] a
            && new int[n + 1] instanceof int[] sv && new int[n + 1] instanceof int[] sd && new int[1] instanceof int[] sp
            ? IntStream.range(0, n).map(i -> Integer.valueOf(IntStream.iterate(0, k -> sp[0] > 0 && sv[sp[0] - 1] < a[i], k -> k + 1)
                    .map(k -> sd[--sp[0]]).reduce(0, Math::max)) instanceof Integer cur
                && Integer.valueOf(sp[0] == 0 ? 0 : cur + 1) instanceof Integer t
                && (sv[sp[0]] = a[i]) >= 0 && (sd[sp[0]++] = t) >= 0 ? t : 0).max().getAsInt() : "");
    }
}
