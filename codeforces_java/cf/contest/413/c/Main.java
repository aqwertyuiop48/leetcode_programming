import java.math.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer m
            && IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] a
            && IntStream.range(0, m).map(i -> s.nextInt() - 1).toArray() instanceof int[] b
            && IntStream.of(b).boxed().collect(Collectors.toSet()) instanceof Set<Integer> au
            ? IntStream.of(b).map(i -> a[i]).boxed().sorted(Comparator.reverseOrder()).reduce(BigInteger.valueOf(IntStream.range(0, n).filter(i -> !au.contains(i)).mapToLong(i -> a[i]).sum()),
                (cur, x) -> cur.add(cur.max(BigInteger.valueOf(x))), BigInteger::add) : "");
    }
}
