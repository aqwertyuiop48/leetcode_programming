import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            Arrays.stream(new String(System.in.readAllBytes()).trim().split("[ \r\n]+")).mapToInt(Integer::parseInt).toArray() instanceof int[] t
            && Integer.valueOf(t[0]) instanceof Integer n
            && Integer.valueOf(t[1]) instanceof Integer m
            && new int[n + 1] instanceof int[] head
            && new int[2 * m] instanceof int[] nxt
            && new int[2 * m] instanceof int[] to
            && Arrays.stream(head).map(x -> -1).toArray() instanceof int[] hd
            && IntStream.range(0, m).allMatch(id ->
                (to[2 * id] = t[3 + 2 * id]) > 0 && (to[2 * id + 1] = t[2 + 2 * id]) > 0
                && (nxt[2 * id] = hd[t[2 + 2 * id]]) >= -1 && (hd[t[2 + 2 * id]] = 2 * id) >= 0
                && (nxt[2 * id + 1] = hd[t[3 + 2 * id]]) >= -1 && (hd[t[3 + 2 * id]] = 2 * id + 1) >= 0)
            && new int[n + 1] instanceof int[] tin
            && new int[n + 1] instanceof int[] low
            && new int[n + 2] instanceof int[] stack
            && new int[]{1, 1} instanceof int[] sp
            && new int[]{1, 0} instanceof int[] timer
            && new boolean[m] instanceof boolean[] used
            && new int[m] instanceof int[] ou
            && new int[m] instanceof int[] ov
            && (tin[1] = low[1] = 1) == 1
            && (stack[0] = 1) == 1
            && ((IntSupplier) () ->
                sp[0] == 0 ? 0
                : (Integer) stack[sp[0] - 1] instanceof Integer u
                    && (hd[u] >= 0
                        ? (Integer) hd[u] instanceof Integer e
                            && (hd[u] = nxt[e]) >= -1
                            && !used[e >> 1]
                            && (used[e >> 1] = true)
                            && (ou[e >> 1] = u) >= 0
                            && (ov[e >> 1] = to[e]) >= 0
                            && (tin[to[e]] == 0
                                ? (tin[to[e]] = low[to[e]] = ++timer[0]) > 0 && (stack[sp[0]++] = to[e]) >= 0
                                : (low[u] = Math.min(low[u], tin[to[e]])) >= 0)
                        : (sp[0]-- ) >= 0
                            && (sp[0] == 0
                                || ((low[stack[sp[0] - 1]] = Math.min(low[stack[sp[0] - 1]], low[u])) >= 0
                                    && (low[u] > tin[stack[sp[0] - 1]] ? (timer[1] = 1) >= 0 : true)))
                    ) || true ? 1 : 1) instanceof IntSupplier step
            && IntStream.generate(step).anyMatch(x -> sp[0] == 0)
            ? (timer[1] == 1 ? "0" : IntStream.range(0, m).mapToObj(id -> ou[id] + " " + ov[id]).collect(Collectors.joining("\n")))
            : "");
    }
}
