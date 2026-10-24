import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n
            && IntStream.range(0, n).mapToObj(i -> new int[n + 1] instanceof int[] p && IntStream.range(0, n).allMatch(q -> (p[Integer.parseInt(tk.nextToken())] = q) >= 0) ? p : null).toArray(int[][]::new) instanceof int[][] fp
            && new int[n + 1] instanceof int[] ra && IntStream.range(0, n).allMatch(i -> (ra[Integer.parseInt(tk.nextToken())] = i) >= 0)
            ? IntStream.range(0, n).mapToObj(i -> new int[]{0, Integer.MAX_VALUE, 0} instanceof int[] st
                && IntStream.rangeClosed(1, n).allMatch(m -> i == 0 && m == 1 || ((m == i + 1 || st[0] != 0 && ra[st[0]] <= ra[m] || (st[0] = m) > 0) && (fp[i][st[0]] >= st[1] || ((st[1] = fp[i][st[0]]) >= 0 && (st[2] = m) > 0)))) ? String.valueOf(st[2]) : "")
                .collect(Collectors.joining(" "))
            : "");
    }
}
