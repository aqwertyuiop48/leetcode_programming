import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] tk
            && tk[0].getBytes() instanceof byte[] a
            && tk[1].getBytes() instanceof byte[] b
            && (Integer) a.length instanceof Integer n
            && IntStream.range(0, 26 * (n + 1)).map(i -> -1).toArray() instanceof int[] nx
            && IntStream.range(0, n).allMatch(k -> (Integer) (n - 1 - k) instanceof Integer i
                && IntStream.range(0, 26).allMatch(c -> (nx[i * 26 + c] = c == a[i] - 'a' ? i : nx[i * 26 + 26 + c]) >= -1))
            && new int[] {1, 0} instanceof int[] st
            ? IntStream.range(0, b.length).allMatch(j ->
                (Integer) (b[j] - 'a') instanceof Integer c
                && (Integer) nx[st[1] * 26 + c] instanceof Integer q
                && (q >= 0 || ((st[0]++ | (st[1] = 0)) >= 0))
                && (st[1] = nx[st[1] * 26 + c] + 1) > 0)
                ? st[0]
                : -1
            : -1);
    }
}
