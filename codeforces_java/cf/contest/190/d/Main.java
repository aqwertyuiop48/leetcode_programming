import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).iterator() instanceof Iterator<Object> it
            && Integer.valueOf(Integer.parseInt((String) it.next())) instanceof Integer n
            && Integer.valueOf(Integer.parseInt((String) it.next())) instanceof Integer k
            && new HashMap<Integer, ArrayList<Integer>>() instanceof HashMap<Integer, ArrayList<Integer>> pos
            && new long[]{0} instanceof long[] best
            ? IntStream.range(0, n).mapToLong(r -> Integer.valueOf(Integer.parseInt((String) it.next())) instanceof Integer v
                    && pos.computeIfAbsent(v, z -> new ArrayList<>()).add(r)
                    && (pos.get(v).size() < k || (best[0] = Math.max(best[0], pos.get(v).get(pos.get(v).size() - k) + 1)) >= 0) ? best[0] : 0).sum()
            : 0);
    }
}

