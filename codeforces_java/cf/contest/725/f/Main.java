import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st
            && Stream.generate(st::nextToken).limit(st.countTokens()).mapToLong(Long::parseLong).toArray() instanceof long[] t
            && Integer.valueOf((int) t[0]) instanceof Integer n
            && Long.valueOf(IntStream.range(0, n).mapToLong(i -> t[1 + 4 * i] + t[2 + 4 * i] >= t[3 + 4 * i] + t[4 + 4 * i]
                ? t[1 + 4 * i] - t[2 + 4 * i] + t[3 + 4 * i] - t[4 + 4 * i]
                : t[1 + 4 * i] > t[4 + 4 * i] ? 2 * (t[1 + 4 * i] - t[4 + 4 * i]) : t[2 + 4 * i] > t[3 + 4 * i] ? -2 * (t[2 + 4 * i] - t[3 + 4 * i]) : 0L).sum()) instanceof Long tot
            && IntStream.range(0, n).filter(i -> t[1 + 4 * i] + t[2 + 4 * i] >= t[3 + 4 * i] + t[4 + 4 * i])
                .boxed().flatMapToLong(i -> LongStream.of(t[1 + 4 * i] + t[2 + 4 * i], t[3 + 4 * i] + t[4 + 4 * i])).sorted().toArray() instanceof long[] s
            ? String.valueOf((tot + IntStream.range(0, s.length).mapToLong(j -> (s.length - 1 - j) % 2 == 0 ? s[j] : -s[j]).sum()) / 2) : "");
    }
}
