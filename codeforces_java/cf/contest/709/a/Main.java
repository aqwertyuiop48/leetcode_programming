import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s+")).mapToLong(Long::parseLong).toArray() instanceof long[] t
            && new long[]{0, 0} instanceof long[] st
            && IntStream.range(3, 3 + (int) t[0]).filter(i -> t[i] <= t[1] && (st[0] += t[i]) > t[2] && (st[0] = 0) == 0 && ++st[1] > 0).count() >= 0
            ? st[1] : "");
    }
}
