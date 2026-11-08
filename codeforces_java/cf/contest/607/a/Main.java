import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw && new int[raw.length / 2 + 4] instanceof int[] tok && new int[]{0, 0, 0} instanceof int[] st
            && IntStream.range(0, raw.length + 1).filter(i -> i < raw.length && raw[i] > 47 ? (st[1] = st[1] * 10 + raw[i] - 48) >= 0 & (st[2] = 1) > 0 : st[2] == 0 || (tok[st[0]++] = st[1]) >= 0 & (st[1] = 0) == 0 & (st[2] = 0) == 0).count() >= 0
            && Integer.valueOf(tok[0]) instanceof Integer n && new int[1000002] instanceof int[] pw && new int[1000003] instanceof int[] f
            && IntStream.range(0, n).filter(i -> (pw[tok[1 + 2 * i]] = tok[2 + 2 * i] + 1) > 0).count() >= 0
            ? n - IntStream.range(0, 1000001).map(x -> f[x + 1] = pw[x] > 0 ? 1 + f[Math.max(0, x - pw[x] + 1)] : f[x]).max().getAsInt() : "");
    }
}
