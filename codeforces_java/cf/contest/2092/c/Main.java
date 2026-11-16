import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st
            && ((IntSupplier) () -> Integer.parseInt(st.nextToken())) instanceof IntSupplier ni
            && new StringBuilder() instanceof StringBuilder sb
            && IntStream.of(0).peek(z -> IntStream.range(0, ni.getAsInt()).forEach(tc -> sb.append(Integer.valueOf(ni.getAsInt()) instanceof Integer n
                && new long[n] instanceof long[] a
                && IntStream.range(0, n).filter(i -> (a[i] = ni.getAsInt()) >= 0).count() == n
                && Long.valueOf(Arrays.stream(a).filter(v -> v % 2 == 1).count()) instanceof Long odd
                ? (odd * (n - odd) == 0 ? Arrays.stream(a).max().getAsLong() : Arrays.stream(a).sum() - (odd - 1)) : -1).append('\n'))).sum() == 0
            ? sb.toString() : "");
    }
}
