import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw && new int[raw.length / 2 + 2] instanceof int[] v && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i -> i < raw.length && raw[i] >= 48 ? (ps[1] = ps[1] * 10 + raw[i] - 48) >= 0 && (ps[2] = 1) == 1 : ps[2] == 0 || (v[ps[0]++] = ps[1]) >= 0 && (ps[1] = 0) == 0 && (ps[2] = 0) == 0)
            && Integer.valueOf(v[0]) instanceof Integer n
            && new boolean[n] instanceof boolean[] forced
            && IntStream.range(0, v[n + 1]).allMatch(i -> (forced[v[n + 2 + i] - 1] = true))
            && new int[n] instanceof int[] res && new int[n + 1] instanceof int[] stack && new int[]{0} instanceof int[] sp
            && IntStream.iterate(n - 1, i -> i >= 0, i -> i - 1).allMatch(i -> !forced[i] && sp[0] > 0 && stack[sp[0] - 1] == v[1 + i]
                ? (res[i] = v[1 + i]) > 0 && (sp[0]--) > 0
                : (res[i] = -v[1 + i]) < 0 && (stack[sp[0]++] = v[1 + i]) > 0)
            ? sp[0] == 0 && new StringBuilder("YES\n") instanceof StringBuilder sb && IntStream.range(0, n).allMatch(i -> sb.append(res[i]).append(' ') != null) ? sb : "NO" : "");
    }
}
