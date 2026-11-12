import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s+")).mapToLong(Long::parseLong).toArray() instanceof long[] t
            && new long[]{1} instanceof long[] st
            && IntStream.range(1, (int) t[0]).allMatch(i -> (st[0] = t[2 + i] - t[1 + i] > t[1] ? 1 : st[0] + 1) > 0)
            ? st[0] : "");
    }
}
