import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw && new long[raw.length / 2 + 2] instanceof long[] tk && new long[]{0, 0, 0, 1} instanceof long[] ps
            && IntStream.rangeClosed(0, raw.length).mapToLong(i -> i < raw.length && raw[i] >= 48 ? (ps[2] = 1) + (ps[1] = ps[1] * 10 + raw[i] - 48) : ps[2] == 1 ? (tk[(int) ps[0]++] = ps[1] * ps[3]) + (ps[2] = 0) + (ps[1] = 0) + (ps[3] = 1) : i < raw.length && raw[i] == 45 ? (ps[3] = -1) : 0).max().isPresent()
            && (Integer) (int) tk[0] instanceof Integer n && (Integer) (int) tk[1] instanceof Integer m
            && IntStream.range(0, n - 1).boxed().sorted(Comparator.comparingLong((Integer i) -> tk[4 + 2 * i] - tk[3 + 2 * i])).mapToInt(Integer::intValue).toArray() instanceof int[] go
            && IntStream.range(0, m).boxed().sorted(Comparator.comparingLong((Integer j) -> tk[2 + 2 * n + j])).mapToInt(Integer::intValue).toArray() instanceof int[] bo
            && new PriorityQueue<long[]>(Comparator.comparingLong((long[] x) -> x[0])) instanceof PriorityQueue<long[]> pq && new int[n - 1] instanceof int[] ans && new long[1] instanceof long[] ptr
            && IntStream.range(0, m).allMatch(jj -> (Long) tk[2 + 2 * n + bo[jj]] instanceof Long av
                && (ptr[0] += IntStream.range((int) ptr[0], n - 1).takeWhile(i -> tk[4 + 2 * go[i]] - tk[3 + 2 * go[i]] <= av).peek(i -> pq.add(new long[]{tk[5 + 2 * go[i]] - tk[2 + 2 * go[i]], go[i]})).count()) >= 0
                && (pq.isEmpty() || pq.poll() instanceof long[] top && top[0] >= av && (ans[(int) top[1]] = bo[jj] + 1) > 0))
            && Arrays.stream(ans).allMatch(x -> x > 0)
            ? "Yes\n" + Arrays.stream(ans).mapToObj(String::valueOf).collect(Collectors.joining(" ")) : "No");
    }
}
