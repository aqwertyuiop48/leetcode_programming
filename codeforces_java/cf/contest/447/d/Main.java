import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m
            && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer k && (Long) Long.parseLong(tk.nextToken()) instanceof Long p
            && new long[n] instanceof long[] rs && new long[m] instanceof long[] cs
            && IntStream.range(0, n).allMatch(i -> IntStream.range(0, m).allMatch(j -> (Long) Long.parseLong(tk.nextToken()) instanceof Long v && (rs[i] += v) >= 0 && (cs[j] += v) >= 0))
            && new PriorityQueue<Long>(Comparator.reverseOrder()) instanceof PriorityQueue<Long> pr && new PriorityQueue<Long>(Comparator.reverseOrder()) instanceof PriorityQueue<Long> pc
            && LongStream.of(rs).allMatch(pr::add) && LongStream.of(cs).allMatch(pc::add)
            && new long[k + 1] instanceof long[] R && new long[k + 1] instanceof long[] C
            && IntStream.rangeClosed(1, k).allMatch(i -> (R[i] = R[i - 1] + pr.peek()) > Long.MIN_VALUE && pr.add(pr.poll() - m * p))
            && IntStream.rangeClosed(1, k).allMatch(i -> (C[i] = C[i - 1] + pc.peek()) > Long.MIN_VALUE && pc.add(pc.poll() - n * p))
            ? IntStream.rangeClosed(0, k).mapToLong(i -> R[i] + C[k - i] - (long) i * (k - i) * p).max().getAsLong() : 0);
    }
}
