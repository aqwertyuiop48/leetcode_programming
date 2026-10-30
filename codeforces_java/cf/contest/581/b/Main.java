import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s+")).mapToInt(Integer::parseInt).toArray() instanceof int[] t && new int[t[0]] instanceof int[] r && new int[1] instanceof int[] m && IntStream.range(0, t[0]).map(i -> t[0] - 1 - i).map(i -> r[i] = Math.max(0, m[0] + 1 - t[i + 1]) + 0 * (m[0] = Math.max(m[0], t[i + 1]))).sum() >= 0 ? Arrays.stream(r).mapToObj(String::valueOf).collect(Collectors.joining(" ")) : "");
    }
}
