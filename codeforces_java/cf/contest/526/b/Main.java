import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n
            && (Integer) (1 << (n + 1)) instanceof Integer sz && new long[sz] instanceof long[] best && new long[1] instanceof long[] add
            && IntStream.range(2, sz).allMatch(i -> (best[i] = Long.parseLong(tk.nextToken())) > 0)
            && IntStream.iterate(sz / 2 - 1, i -> i >= 1, i -> i - 1).allMatch(i -> (add[0] += Math.abs(best[2 * i] - best[2 * i + 1])) >= 0 && (best[i] += Math.max(best[2 * i], best[2 * i + 1])) >= 0)
            ? add[0] : 0);
    }
}
