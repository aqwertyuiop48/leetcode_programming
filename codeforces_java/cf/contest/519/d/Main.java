import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && IntStream.range(0, 26).map(i -> sc.nextInt()).toArray() instanceof int[] v && sc.next() instanceof String s
            && new HashMap<Long, Integer>() instanceof HashMap<Long, Integer> cnt && new long[]{0} instanceof long[] pre
            ? IntStream.range(0, s.length()).mapToLong(j -> (Long) (pre[0] * 26 + (s.charAt(j) - 'a')) instanceof Long key
                ? cnt.getOrDefault(key, 0) + 0L * (pre[0] += v[s.charAt(j) - 'a']) + 0L * cnt.merge(pre[0] * 26 + (s.charAt(j) - 'a'), 1, Integer::sum) : 0).sum() : 0);
    }
}
