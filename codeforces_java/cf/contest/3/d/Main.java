import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.next()).ifPresent(pat ->
            System.out.println(
                new int[]{(int) pat.chars().filter(c -> c == '?').count()} instanceof int[] qArr
                && IntStream.generate(s::nextInt).limit(2 * qArr[0]).toArray() instanceof int[] pairs
                && new int[]{0} instanceof int[] balance
                && new long[]{0} instanceof long[] cost
                && new int[]{0} instanceof int[] qi
                && new boolean[]{false} instanceof boolean[] impossible
                && pat.toCharArray() instanceof char[] res
                && new PriorityQueue<long[]>(Comparator.comparingLong(a -> a[0])) instanceof PriorityQueue<long[]> heap
                && IntStream.range(0, pat.length()).allMatch(i ->
                    (pat.charAt(i) == '(' ? ((balance[0] += 1) == balance[0])
                     : pat.charAt(i) == ')' ? ((balance[0] -= 1) == balance[0])
                     : (new long[]{pairs[2 * qi[0]], pairs[2 * qi[0] + 1]} instanceof long[] oc
                        && (res[i] = ')') == ')'
                        && (cost[0] += oc[1]) == cost[0]
                        && (balance[0] -= 1) == balance[0]
                        && heap.add(new long[]{oc[0] - oc[1], i})
                        && (qi[0] += 1) == qi[0]))
                    &
                    (balance[0] < 0
                     ? (heap.isEmpty()
                         ? (impossible[0] = true)
                         : (heap.poll() instanceof long[] top
                            && (cost[0] += top[0]) == cost[0]
                            && (res[(int) top[1]] = '(') == '('
                            && (balance[0] += 2) == balance[0]))
                     : true))
                && !impossible[0] && balance[0] == 0
                ? cost[0] + "\n" + new String(res)
                : "-1")));
    }
}
