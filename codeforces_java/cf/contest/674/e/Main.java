import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0 && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw && new int[raw.length / 2 + 4] instanceof int[] tok && new int[]{0, 0, 0, 0} instanceof int[] st
            && IntStream.range(0, raw.length).filter(i -> raw[i] >= 48 ? (st[1] = st[1] * 10 + raw[i] - 48) >= 0 & (st[2] = 1) > 0 : raw[i] == 45 ? (st[3] = 1) > 0 : st[2] == 0 || (tok[st[0]++] = st[3] == 1 ? -st[1] : st[1]) * 0 == 0 & (st[1] = 0) == 0 & (st[2] = 0) == 0 & (st[3] = 0) == 0).count() >= 0
            && Integer.valueOf(tok[0]) instanceof Integer q
            && Integer.valueOf((int) IntStream.range(0, q).filter(i -> tok[1 + 2 * i] == 1).count() + 2) instanceof Integer nv
            && new double[nv * 42] instanceof double[] pr
            && new double[nv] instanceof double[] ev && new int[nv] instanceof int[] par && new int[]{1, 0} instanceof int[] s && new double[]{0, 0, 0} instanceof double[] ds
            && new StringBuilder() instanceof StringBuilder sb
            && IntStream.range(0, q).filter(i -> tok[1 + 2 * i] == 1
                ? (s[1] += 1) > 0 && (par[s[1] + 1] = tok[2 + 2 * i]) > 0 && (s[0] = tok[2 + 2 * i]) > 0 && (ds[0] = 0) == 0 && (ds[1] = 1) == 1
                    && (IntStream.rangeClosed(1, 41).allMatch(j -> s[0] != 0 && (ds[2] = -pr[s[0] * 42 + j]) > -5
                        && (pr[s[0] * 42 + j] = (1 + pr[s[0] * 42 + j]) / (1 - ds[0] / 2) * (1 - ds[1] / 2) - 1) > -5
                        && (ev[s[0]] += -pr[s[0] * 42 + j] - ds[2]) > -1e18
                        && (ds[0] = ds[2]) > -5 && (ds[1] = -pr[s[0] * 42 + j]) > -5 && (s[0] = par[s[0]]) >= 0) || true)
                : Long.valueOf(Math.max(0L, Math.round(ev[tok[2 + 2 * i]] * 1e9))) instanceof Long w
                    && sb.append(w / 1000000000L).append('.').append(String.valueOf(1000000000L + w % 1000000000L).substring(1)).append('\n') != null).count() >= 0
            ? sb.toString().trim() : "");
    }
}
