import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s+")).mapToInt(Integer::parseInt).toArray() instanceof int[] t
            && new int[]{2, 1, 0} instanceof int[] A
            && new int[]{2, 12, 22} instanceof int[] B
            && Stream.iterate(new int[]{t[0], t[1], 0}, s -> Integer.valueOf(IntStream.range(0, 3).map(k -> s[2] == 0 ? k : 2 - k).filter(j -> s[0] >= A[j] && s[1] >= B[j]).findFirst().orElse(-1)) instanceof Integer q && q >= 0
                ? new int[]{s[0] - A[q], s[1] - B[q], 1 - s[2]} : new int[]{-1, -1, s[2]}).filter(s -> s[0] < 0).findFirst().get() instanceof int[] r
            ? (r[2] == 0 ? "Hanako" : "Ciel") : "");
    }
}

