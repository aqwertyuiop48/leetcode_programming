import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s+")).mapToInt(Integer::parseInt).toArray() instanceof int[] t && (Integer) t[0] instanceof Integer n && new int[n + 1] instanceof int[] hu && new int[n + 1] instanceof int[] vu ? IntStream.range(0, n * n).filter(i -> hu[t[1 + 2 * i]] == 0 && vu[t[2 + 2 * i]] == 0 && (hu[t[1 + 2 * i]] = 1) + (vu[t[2 + 2 * i]] = 1) > 0).map(i -> i + 1).boxed().map(String::valueOf).collect(Collectors.joining(" ")) : "");
    }
}
