import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(n ->
            System.out.println(
                new PriorityQueue<Long>(Collections.reverseOrder()) instanceof PriorityQueue heap
                && new long[]{0} instanceof long[] ans
                && IntStream.range(0, n).allMatch(i ->
                    new long[]{s.nextLong()} instanceof long[] x
                    && heap.add(x[0])
                    && ((Long) heap.peek() > x[0]
                        ? (ans[0] += (Long) heap.poll() - x[0]) >= 0 && heap.add(x[0])
                        : true))
                ? ans[0]
                : 0L)));
    }
}

