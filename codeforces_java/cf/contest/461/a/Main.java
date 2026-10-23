import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(
            new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st
            && Stream.generate(st::nextToken).limit(st.countTokens()).mapToInt(Integer::parseInt).toArray() instanceof int[] g
            && Arrays.stream(g, 1, g[0] + 1).sorted().toArray() instanceof int[] s
            ? String.valueOf(IntStream.range(0, s.length).mapToLong(i -> (long) s[i] * (i == s.length - 1 ? s.length : i + 2)).sum())
            : "");
    }
}
