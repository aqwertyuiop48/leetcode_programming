import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk
            && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer k
            && new PriorityQueue<Long>(IntStream.range(0, Math.min(n, k)).mapToObj(i -> 0L).toList()) instanceof PriorityQueue<Long> pq
            ? IntStream.range(0, n).mapToObj(i -> (Long) Long.parseLong(tk.nextToken()) instanceof Long s && (Long) Long.parseLong(tk.nextToken()) instanceof Long m
                && (Long) (Math.max(s, pq.poll()) + m) instanceof Long e && pq.add(e) ? String.valueOf(e) : "").collect(Collectors.joining("\n")) : "");
    }
}
