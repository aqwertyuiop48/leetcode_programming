import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s+")).mapToLong(Long::parseLong).toArray() instanceof long[] t && (Integer) (int) t[0] instanceof Integer n && new int[n] instanceof int[] alive && IntStream.range(0, n).map(i -> alive[i] = 1).sum() >= 0 && new long[1] instanceof long[] cur && new long[1] instanceof long[] ds && IntStream.range(0, n).filter(i -> alive[i] == 1 && (cur[0] = t[1 + 3 * i]) >= 0 && IntStream.range(i + 1, n).takeWhile(j -> cur[0] > 0).filter(j -> alive[j] == 1 && (t[3 + 3 * j] -= cur[0]--) < Long.MAX_VALUE).count() >= 0 && (ds[0] = 0) == 0 && IntStream.range(i + 1, n).filter(j -> alive[j] == 1 && (t[3 + 3 * j] -= ds[0]) < 0 && (alive[j] = 0) == 0 && (ds[0] += t[2 + 3 * j]) >= 0).count() >= 0).boxed().toList() instanceof List<Integer> res ? res.size() + "\n" + res.stream().map(i -> String.valueOf(i + 1)).collect(Collectors.joining(" ")) : "");
    }
}
