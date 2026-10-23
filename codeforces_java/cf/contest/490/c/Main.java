import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(
            new String(System.in.readAllBytes()).trim().split("[ \r\n]+") instanceof String[] t
            && t[0].getBytes() instanceof byte[] s
            && Long.valueOf(t[1]) instanceof Long a
            && Long.valueOf(t[2]) instanceof Long b
            && new long[s.length + 1] instanceof long[] pm
            && IntStream.range(0, s.length).allMatch(i -> (pm[i + 1] = (pm[i] * 10 + s[i] - '0') % a) >= 0)
            && new long[]{0, 1 % b, -1} instanceof long[] sf
            && IntStream.iterate(s.length - 1, i -> i >= 1, i -> i - 1).allMatch(i ->
                (sf[0] = (sf[0] + (s[i] - '0') * sf[1]) % b) >= 0
                && (sf[1] = sf[1] * 10 % b) >= 0
                && (s[i] != '0' && pm[i] == 0 && sf[0] == 0 ? (sf[2] = i) >= 0 : true))
            && sf[2] > 0
            ? "YES\n" + new String(s, 0, (int) sf[2]) + "\n" + new String(s, (int) sf[2], s.length - (int) sf[2])
            : "NO");
    }
}
