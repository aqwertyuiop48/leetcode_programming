import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 2] instanceof int[] a
            && new int[]{0, 0, 0, 0, 0} instanceof int[] ps
            && Stream.of(0).peek(z -> IntStream.rangeClosed(0, raw.length).forEach(i -> ps[4] = i < raw.length && raw[i] >= 48 ? (ps[3] = 1) + (ps[0] = ps[0] * 10 + raw[i] - 48)
                : i < raw.length && raw[i] == 45 ? (ps[2] = 1)
                : ps[3] == 1 ? (a[ps[1]++] = ps[2] == 1 ? -ps[0] : ps[0]) + (ps[0] = ps[2] = ps[3] = 0) : 0)).findFirst().isPresent()
            && Integer.valueOf(a[0]) instanceof Integer n && new int[]{2, 0, 1, 0} instanceof int[] st && new int[n] instanceof int[] res
            && IntStream.range(0, a[1]).filter(i -> (st[3] = a[st[0]] == 1
                ? (st[1] = Math.floorMod(st[1] + a[st[0] + 1], n)) + (st[2] = Math.floorMod(st[2] + a[st[0] + 1], n)) + (st[0] += 2)
                : (st[1] += st[1] % 2 == 0 ? 1 : -1) + (st[2] += st[2] % 2 == 0 ? 1 : -1) + (st[0] += 1)) == 0 || true).count() >= 0
            && IntStream.range(0, n / 2).filter(k -> (res[(st[1] + 2 * k) % n] = 2 * k + 1) + (res[(st[2] + 2 * k) % n] = 2 * k + 2) >= 0).count() >= 0
            ? Arrays.stream(res).mapToObj(String::valueOf).collect(Collectors.joining(" ")) : "");
    }
}
