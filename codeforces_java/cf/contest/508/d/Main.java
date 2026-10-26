import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n
            && new int[16384] instanceof int[] head && new int[16384] instanceof int[] ind && new int[16384] instanceof int[] outd
            && IntStream.range(0, 16384).allMatch(i -> (head[i] = -1) < 0)
            && new int[n] instanceof int[] to && new int[n] instanceof int[] nxt
            && IntStream.range(0, n).mapToObj(i -> s.next()).toList() instanceof List<String> w
            && IntStream.range(0, n).allMatch(i -> (Integer) (w.get(i).charAt(0) * 128 + w.get(i).charAt(1)) instanceof Integer a && (Integer) (w.get(i).charAt(1) * 128 + w.get(i).charAt(2)) instanceof Integer b
                && (to[i] = b) >= 0 && (nxt[i] = head[a]) >= -1 && (head[a] = i) >= 0 && ++ind[b] > 0 && ++outd[a] > 0)
            && IntStream.range(0, 16384).filter(v -> outd[v] - ind[v] == 1).count() <= 1 && IntStream.range(0, 16384).filter(v -> ind[v] - outd[v] == 1).count() <= 1
            && IntStream.range(0, 16384).noneMatch(v -> Math.abs(outd[v] - ind[v]) > 1)
            && (Integer) IntStream.range(0, 16384).filter(v -> outd[v] - ind[v] == 1).findFirst().orElse((w.get(0).charAt(0) * 128 + w.get(0).charAt(1))) instanceof Integer start
            && new int[n + 5] instanceof int[] stack && (stack[0] = start) >= 0 && new int[]{1, 0} instanceof int[] sp && new int[n + 5] instanceof int[] circ
            && IntStream.generate(() -> 0).takeWhile(z -> sp[0] > 0).allMatch(z -> head[stack[sp[0] - 1]] >= 0
                ? (stack[sp[0]] = to[head[stack[sp[0] - 1]]]) >= 0 && (head[stack[sp[0] - 1]] = nxt[head[stack[sp[0] - 1]]]) >= -1 && ++sp[0] > 0
                : (circ[sp[1]++] = stack[--sp[0]]) >= 0)
            ? sp[1] == n + 1 ? "YES\n" + IntStream.range(0, n + 1).mapToObj(i -> circ[n - i]).map(v -> String.valueOf((char) (v % 128)))
                .collect(Collectors.joining()).transform(t -> "" + (char) (circ[n] / 128) + t) : "NO" : "NO");
    }
}
