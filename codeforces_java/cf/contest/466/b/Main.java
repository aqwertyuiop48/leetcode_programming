import java.util.Arrays;
import java.util.stream.LongStream;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            Arrays.stream(new String(System.in.readAllBytes()).trim().split("[ \r\n]+")).mapToLong(Long::parseLong).toArray() instanceof long[] v
            && (Boolean) (v[1] > v[2]) instanceof Boolean sw
            && (Long) (sw ? v[2] : v[1]) instanceof Long a
            && (Long) (sw ? v[1] : v[2]) instanceof Long b
            && (Long) (6 * v[0]) instanceof Long s
            && (Long) (a * b >= s
                ? a
                : LongStream.rangeClosed(a, (long) Math.sqrt(s) + 2)
                    .map(x -> (x * Math.max(b, (s + x - 1) / x) << 17) | x)
                    .min().getAsLong() & 131071) instanceof Long x
            && (Long) Math.max(b, (s + x - 1) / x) instanceof Long y
            ? x * y + "\n" + (sw ? y + " " + x : x + " " + y)
            : "");
    }
}
