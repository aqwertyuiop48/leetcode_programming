import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st
            && Integer.valueOf(st.nextToken()) instanceof Integer n
            && new PriorityQueue<Long>(Collections.reverseOrder()) instanceof PriorityQueue<Long> pq
            && new long[1] instanceof long[] ans
            && IntStream.range(0, n).allMatch(i -> Long.valueOf(Long.parseLong(st.nextToken()) - i) instanceof Long x
                && pq.add(x)
                && (pq.peek().longValue() > x.longValue() ? (ans[0] += pq.poll().longValue() - x.longValue()) >= 0 && pq.add(x) : true))
            ? ans[0] : "");
    }
}
