import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s+")).mapToLong(Long::parseLong).toArray() instanceof long[] t
            && new long[]{t[1], t[1], t[1], 0} instanceof long[] s
            ? IntStream.iterate(0, z -> s[0] < t[0], z -> z + 1).filter(z -> (s[3] = Math.min(t[0], s[1] + s[2] - 1)) > 0 & (s[0] = s[1]) > 0 & (s[1] = s[2]) > 0 & (s[2] = s[3]) > 0).count() : "");
    }
}
