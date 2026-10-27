import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s+")).mapToInt(Integer::parseInt).toArray() instanceof int[] t
            && ((IntPredicate) p -> p > 1 && IntStream.range(2, p).noneMatch(d -> p % d == 0)) instanceof IntPredicate pr
            && pr.test(t[0]) && pr.test(t[1]) && IntStream.range(t[0] + 1, t[1]).noneMatch(pr) ? "YES" : "NO");
    }
}





