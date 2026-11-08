import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk
            && Integer.valueOf(tk.nextToken()) instanceof Integer q
            && new int[q + 2] instanceof int[] par && new double[(q + 2) * 42] instanceof double[] E && new int[]{1, 0} instanceof int[] cn && new double[2] instanceof double[] ev
            ? IntStream.range(0, q).mapToObj(z -> Integer.valueOf(tk.nextToken()) instanceof Integer ty && Integer.valueOf(tk.nextToken()) instanceof Integer v
                ? (ty == 1
                    ? ((Integer.valueOf(++cn[0]) instanceof Integer c && (par[c] = v) > 0 && (cn[1] = v) > 0
                        && (ev[0] = E[v * 42]) >= 0 && (ev[1] = 1 - (1 - ev[0]) * 0.5) >= 0 && (E[v * 42] = ev[1]) >= 0
                        && (IntStream.range(1, 42).allMatch(k -> par[cn[1]] != 0
                            && (ev[1] = 1 - (1 - E[par[cn[1]] * 42 + k]) * (1 - ev[1] / 2) / (1 - ev[0] / 2)) > -1e18 && (ev[0] = E[par[cn[1]] * 42 + k]) >= 0 && (E[par[cn[1]] * 42 + k] = ev[1]) > -1e18 && (cn[1] = par[cn[1]]) > 0) || true)) ? "" : "")
                    : Long.valueOf(Math.round(IntStream.range(0, 42).mapToDouble(d -> E[v * 42 + d]).sum() * 1e10)) instanceof Long r
                        ? (r / 10000000000L) + "." + String.valueOf(10000000000L + r % 10000000000L).substring(1) : "")
                : "").filter(s -> !s.isEmpty()).collect(Collectors.joining("\n")) : "");
    }
}
