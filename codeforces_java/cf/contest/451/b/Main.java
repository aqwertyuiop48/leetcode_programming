import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(
            System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 8] instanceof int[] tk
            && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((tk[ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && (Integer) tk[0] instanceof Integer n
            && Arrays.copyOfRange(tk, 1, n + 1) instanceof int[] a
            && Arrays.stream(a).sorted().toArray() instanceof int[] s
            && (Integer) (int) IntStream.range(0, n).filter(i -> a[i] != s[i]).findFirst().orElse(0) instanceof Integer l
            && (Integer) (int) IntStream.range(0, n).filter(i -> a[i] != s[i]).reduce(0, (x, y) -> y) instanceof Integer r
            && IntStream.rangeClosed(l, r).allMatch(i -> a[i] == s[r - (i - l)])
            ? "yes\n" + (l + 1) + " " + (r + 1)
            : "no");
    }
}
