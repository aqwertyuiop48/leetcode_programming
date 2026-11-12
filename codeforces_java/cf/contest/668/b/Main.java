import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0 && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw && new int[raw.length / 2 + 2] instanceof int[] tok && new int[]{0, 0, 0, 0} instanceof int[] ps
            && IntStream.range(0, raw.length).filter(i -> raw[i] >= 48 ? (ps[1] = ps[1] * 10 + raw[i] - 48) >= 0 & (ps[2] = 1) > 0
                : raw[i] == 45 ? (ps[3] = 1) > 0
                : ps[2] == 0 || (tok[ps[0]++] = ps[3] == 1 ? -ps[1] : ps[1]) > Integer.MIN_VALUE & (ps[1] = 0) == 0 & (ps[2] = 0) == 0 & (ps[3] = 0) == 0).count() >= 0
            && Integer.valueOf(tok[0]) instanceof Integer n && Integer.valueOf(tok[1]) instanceof Integer q
            && new int[]{2, 0, 1} instanceof int[] st
            && IntStream.range(0, q).filter(i -> tok[st[0]] == 1
                ? (st[1] = Math.floorMod(st[1] + tok[st[0] + 1], n)) >= 0 & (st[2] = Math.floorMod(st[2] + tok[st[0] + 1], n)) >= 0 & (st[0] += 2) > 0
                : (st[1] ^= 1) >= 0 & (st[2] ^= 1) >= 0 & ++st[0] > 0).count() >= 0
            && new int[n] instanceof int[] res
            && IntStream.range(0, n).filter(b -> (res[(b % 2 == 0 ? st[1] + b : st[2] + b - 1) % n] = b + 1) > 0).count() >= 0
            ? Arrays.stream(res).mapToObj(String::valueOf).collect(Collectors.joining(" ")) : "");
    }
}
