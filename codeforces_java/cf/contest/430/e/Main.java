import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n
            && IntStream.range(0, n).map(i -> s.nextInt()).boxed().sorted(Comparator.reverseOrder()).mapToInt(x -> x).toArray() instanceof int[] c
            && (Integer) (int) IntStream.of(c).filter(x -> x == 1).count() instanceof Integer leaves && (Integer) (n - leaves) instanceof Integer k
            && new int[Math.max(k, 1)] instanceof int[] rem && new int[Math.max(k, 1)] instanceof int[] ch && new Object[1] instanceof Object[] ref
            && (n == 1 ? c[0] == 1 : c[0] == n && IntStream.of(c).filter(x -> x == n).count() == 1 && IntStream.of(c).noneMatch(x -> x == 2) && leaves >= k + 1)
            && IntStream.range(0, k).allMatch(i -> (rem[i] = c[i] - 1) >= 0)
            && (ref[0] = (IntPredicate) i -> i == k ? IntStream.range(0, k).allMatch(p -> ch[p] + rem[p] >= 2) && IntStream.range(0, k).map(p -> rem[p]).sum() == leaves
                : IntStream.range(0, i).anyMatch(p -> rem[p] >= c[i] && (rem[p] -= c[i]) >= 0 && ch[p]++ >= 0 && (((IntPredicate) ref[0]).test(i + 1) || !((rem[p] += c[i]) >= 0 & ch[p]-- >= 0)))) != null
            && (n == 1 || ((IntPredicate) ref[0]).test(1)) ? "YES" : "NO");
    }
}
