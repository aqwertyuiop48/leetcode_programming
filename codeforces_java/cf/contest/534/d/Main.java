import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n
            && new int[n + 3] instanceof int[] head && IntStream.range(0, n + 3).allMatch(i -> (head[i] = -1) < 0) && new int[n] instanceof int[] nxt && new int[n] instanceof int[] order
            && IntStream.range(0, n).allMatch(i -> (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer a && (nxt[i] = head[a]) >= -1 && (head[a] = i) >= 0)
            && new int[]{0} instanceof int[] cur
            && IntStream.range(0, n).allMatch(step -> (Integer) IntStream.iterate(cur[0], c -> c >= 0 && head[c] < 0, c -> c - 3).reduce(Integer.MIN_VALUE, (x, y) -> y) instanceof Integer last
                && (cur[0] = last == Integer.MIN_VALUE ? cur[0] : last - 3) >= 0 && (Integer) head[cur[0]] instanceof Integer i && (head[cur[0]] = nxt[i]) >= -1 && (order[step] = i + 1) > 0 && ++cur[0] > 0)
            ? "Possible\n" + Arrays.stream(order).mapToObj(String::valueOf).collect(Collectors.joining(" ")) : "Impossible");
    }
}
