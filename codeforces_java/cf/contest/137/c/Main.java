import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            Arrays.stream(new String(System.in.readAllBytes()).trim().split("[ \r\n]+")).mapToLong(Long::parseLong).toArray() instanceof long[] in
            && Integer.valueOf((int) in[0]) instanceof Integer n
            && new long[]{0} instanceof long[] mx
            ? IntStream.range(0, n).mapToLong(i -> in[1 + 2 * i] << 32 | in[2 + 2 * i]).sorted()
                .filter(v -> (v & 0xFFFFFFFFL) < mx[0] || (mx[0] = v & 0xFFFFFFFFL) < 0).count()
            : -1);
    }
}
