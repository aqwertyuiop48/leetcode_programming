import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(Integer.valueOf(new Scanner(System.in).nextInt()) instanceof Integer n
            ? n == 1 ? "0 0" : n % 2 == 1 ? "-1"
                : new int[n] instanceof int[] st && new int[n] instanceof int[] ph && new int[n] instanceof int[] out && new int[3] instanceof int[] sv
                && (st[0] = 0) == 0 && (sv[0] = 1) == 1 && (ph[0] = 1) == 1
                && IntStream.iterate(0, t -> sv[0] > 0, t -> t + 1).filter(t -> Integer.valueOf(st[sv[0] - 1]) instanceof Integer u
                    && (ph[u] == 1 ? (ph[u] = 2) > 0 && Integer.valueOf(u * 2 % n) instanceof Integer v && ph[v] == 0 && (ph[v] = 1) > 0 && (st[sv[0]++] = v) >= 0 || true
                    : ph[u] == 2 ? (ph[u] = 3) > 0 && Integer.valueOf((u * 2 + 1) % n) instanceof Integer v2 && ph[v2] == 0 && (ph[v2] = 1) > 0 && (st[sv[0]++] = v2) >= 0 || true
                    : (out[sv[1]++] = u) >= 0 && (sv[0]-- > 0))).count() >= 0
                ? IntStream.rangeClosed(0, n).mapToObj(i -> "" + (i == n ? 0 : out[n - 1 - i])).collect(Collectors.joining(" ")) : "" : "");
    }
}
