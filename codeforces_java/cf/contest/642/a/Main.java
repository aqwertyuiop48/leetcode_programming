
import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.append(new BufferedReader(new InputStreamReader(System.in)).lines().iterator() instanceof Iterator<String> it
            && (Integer) Integer.parseInt(it.next().trim()) instanceof Integer t
            && (Integer) Integer.parseInt(it.next().trim()) instanceof Integer p
            && new int[p] instanceof int[] tests
            && IntStream.range(0, p).map(i -> tests[i] = Integer.parseInt(it.next().trim().split("\\s+")[1])).sum() >= 0
            && new int[]{t} instanceof int[] fr
            && new ArrayList<int[]>() instanceof ArrayList<int[]> subs
            && new PriorityQueue<int[]>((x, y) -> x[0] != y[0] ? x[0] - y[0] : x[1] - y[1]) instanceof PriorityQueue<int[]> q
            && Stream.generate(() -> it.hasNext() ? it.next().trim() : null).takeWhile(l -> l != null).filter(l ->
                l.equals("-1") ? false
                : l.equals("-1 -1") ? (new StringBuilder() instanceof StringBuilder sb
                    && Stream.generate(() -> 0).takeWhile(z -> fr[0] > 0 && !q.isEmpty()).filter(z ->
                        (q.poll() instanceof int[] e && subs.get(e[1]) instanceof int[] s
                            && sb.append(e[1]).append(' ').append(s[1]++).append('\n') != null && --fr[0] >= 0)).count() >= 0
                    && System.out.append(sb.append("-1 -1\n")) != null)
                : l.indexOf(' ') > 0 ? (l.split("\\s+") instanceof String[] w && (Integer) Integer.parseInt(w[0]) instanceof Integer id
                    && (++fr[0] > 0) && w[2].equals("OK") && subs.get(id)[1] < subs.get(id)[0]
                    && q.add(new int[]{subs.get(id)[0] - subs.get(id)[1], id}))
                : ((Integer) Integer.parseInt(l) instanceof Integer pr && subs.add(new int[]{tests[pr], 0})
                    && q.add(new int[]{tests[pr], subs.size() - 1}))).count() >= 0
            ? "" : "");
    }
}
