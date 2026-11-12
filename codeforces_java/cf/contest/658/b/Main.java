import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st
            && Integer.valueOf(st.nextToken()) instanceof Integer n
            && Integer.valueOf(st.nextToken()) instanceof Integer k
            && Integer.valueOf(st.nextToken()) instanceof Integer q
            && IntStream.range(0, n).map(i -> Integer.parseInt(st.nextToken())).toArray() instanceof int[] t
            && new boolean[n] instanceof boolean[] on
            && new PriorityQueue<Integer>() instanceof PriorityQueue<Integer> pq
            ? IntStream.range(0, q).mapToObj(i -> Integer.valueOf(st.nextToken()) instanceof Integer ty && Integer.valueOf(Integer.parseInt(st.nextToken()) - 1) instanceof Integer id
                ? (ty == 1
                    ? ((on[id] = true) && (pq.size() < k ? pq.add(t[id]) : t[id] > pq.peek() ? pq.poll() != null && pq.add(t[id]) : true) ? "" : "")
                    : (on[id] && (pq.size() < k || t[id] >= pq.peek()) ? "YES" : "NO"))
                : "").filter(x -> !x.isEmpty()).collect(Collectors.joining("\n"))
            : "");
    }
}
