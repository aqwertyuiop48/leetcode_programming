import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(
            new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st
            && Stream.generate(st::nextToken).limit(st.countTokens()).mapToInt(Integer::parseInt).toArray() instanceof int[] g
            && Integer.valueOf(g[0]) instanceof Integer n
            && Integer.valueOf(g[1]) instanceof Integer m
            && Arrays.stream(g, 2, 2 + n).asLongStream().toArray() instanceof long[] a
            && Arrays.stream(g, 2 + n, 2 + n + m).asLongStream().toArray() instanceof long[] b
            && (Long) LongStream.of(a).sum() instanceof Long sa
            && (Long) LongStream.of(b).sum() instanceof Long sb
            && (Long) LongStream.of(a).max().getAsLong() instanceof Long ma
            && (Long) LongStream.of(b).max().getAsLong() instanceof Long mb
            ? Math.min(
                sb + LongStream.of(a).map(x -> Math.min(x, sb)).sum() - Math.min(ma, sb),
                sa + LongStream.of(b).map(x -> Math.min(x, sa)).sum() - Math.min(mb, sa))
            : "");
    }
}
