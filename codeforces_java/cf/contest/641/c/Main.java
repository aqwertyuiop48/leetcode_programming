import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0 && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw && new int[raw.length / 2 + 2] instanceof int[] tok && new int[]{0, 0, 0, 0} instanceof int[] st
            && IntStream.range(0, raw.length).filter(i -> raw[i] == 45 ? (st[3] = 1) > 0
                : raw[i] >= 48 ? (st[1] = st[1] * 10 + raw[i] - 48) >= 0 & (st[2] = 1) > 0
                : st[2] == 0 || (tok[st[0]++] = st[3] == 1 ? -st[1] : st[1]) >= -1 << 30 & (st[1] = 0) == 0 & (st[2] = 0) == 0 & (st[3] = 0) == 0).count() >= 0
            && Integer.valueOf(tok[0]) instanceof Integer n && Integer.valueOf(tok[1]) instanceof Integer q && new int[]{0, 1, 2} instanceof int[] ps
            && IntStream.range(0, q).filter(k -> tok[ps[2]] == 1
                ? (ps[0] = ((ps[0] + tok[ps[2] + 1]) % n + n) % n) >= 0 & (ps[1] = ((ps[1] + tok[ps[2] + 1]) % n + n) % n) >= 0 & (ps[2] += 2) > 0
                : (ps[0] = ps[0] % 2 == 0 ? (ps[0] + 1) % n : (ps[0] + n - 1) % n) >= 0 & (ps[1] = ps[1] % 2 == 0 ? (ps[1] + 1) % n : (ps[1] + n - 1) % n) >= 0 & ++ps[2] > 0).count() >= 0
            && new int[n] instanceof int[] ans
            && IntStream.range(0, n).filter(i -> (ans[i % 2 == 0 ? (ps[0] + i) % n : (ps[1] + i - 1) % n] = i + 1) > 0).count() >= 0
            ? Arrays.stream(ans).mapToObj(String::valueOf).collect(Collectors.joining(" ")) : "");
    }
}
